/*
 * Copyright 2016 David Karnok
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package hu.akarnokd.rxjava2.parallel;

import java.util.concurrent.Callable;

import org.reactivestreams.*;

import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.subscribers.flowable.DeferredScalarSubscriber;
import io.reactivex.internal.subscriptions.*;
import io.reactivex.plugins.RxJavaPlugins;

/**
 * Reduce the sequence of values in each 'rail' to a single value.
 *
 * @param <T> the input value type
 * @param <R> the result value type
 */
final class ParallelReduce<T, R> extends ParallelFlowable<R> {

    final ParallelFlowable<? extends T> source;

    final Callable<R> initialSupplier;

    final BiFunction<R, T, R> reducer;

    ParallelReduce(ParallelFlowable<? extends T> source, Callable<R> initialSupplier, BiFunction<R, T, R> reducer) {
        this.source = source;
        this.initialSupplier = initialSupplier;
        this.reducer = reducer;
    }

    @Override
    public void subscribe(Subscriber<? super R>[] subscribers) {
        if (!validate(subscribers)) {
            return;
        }

        int n = subscribers.length;
        @SuppressWarnings("unchecked")
        Subscriber<T>[] parents = new Subscriber[n];

        for (int i = 0; i < n; i++) {

            R initialValue;

            try {
                initialValue = initialSupplier.call();
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                reportError(subscribers, ex);
                return;
            }

            if (initialValue == null) {
                reportError(subscribers, new NullPointerException("The initialSupplier returned a null value"));
                return;
            }

            parents[i] = new ParallelReduceSubscriber<T, R>(subscribers[i], initialValue, reducer);
        }

        source.subscribe(parents);
    }

    void reportError(Subscriber<?>[] subscribers, Throwable ex) {
        for (Subscriber<?> s : subscribers) {
            EmptySubscription.error(ex, s);
        }
    }

    @Override
    public int parallelism() {
        return source.parallelism();
    }

    static final class ParallelReduceSubscriber<T, R> extends DeferredScalarSubscriber<T, R> {


        private static final long serialVersionUID = 8200530050639449080L;

        final BiFunction<R, T, R> reducer;

        R accumulator;

        boolean done;

        ParallelReduceSubscriber(Subscriber<? super R> subscriber, R initialValue, BiFunction<R, T, R> reducer) {
            super(subscriber);
            this.accumulator = initialValue;
            this.reducer = reducer;
        }

        @Override
        public void onSubscribe(Subscription s) {
            if (SubscriptionHelper.validate(this.s, s)) {
                this.s = s;

                actual.onSubscribe(this);

                s.request(Long.MAX_VALUE);
            }
        }

        @Override
        public void onNext(T t) {
            if (done) {
                return;
            }

            R v;

            try {
                v = reducer.apply(accumulator, t);
            } catch (Throwable ex) {
                Exceptions.throwIfFatal(ex);
                cancel();
                onError(ex);
                return;
            }

            if (v == null) {
                cancel();
                onError(new NullPointerException("The reducer returned a null value"));
                return;
            }

            accumulator = v;
        }

        @Override
        public void onError(Throwable t) {
            if (done) {
                RxJavaPlugins.onError(t);
                return;
            }
            done = true;
            accumulator = null;
            actual.onError(t);
        }

        @Override
        public void onComplete() {
            if (done) {
                return;
            }
            done = true;

            R a = accumulator;
            accumulator = null;
            complete(a);
        }

        @Override
        public void cancel() {
            super.cancel();
            s.cancel();
        }
    }
}