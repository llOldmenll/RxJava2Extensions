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

package hu.akarnokd.rxjava2.async;

import java.util.concurrent.*;

import org.reactivestreams.*;

import hu.akarnokd.rxjava2.functions.*;
import io.reactivex.*;
import io.reactivex.functions.*;

/**
 * Utility methods to convert functions and actions into asynchronous operations through the Publisher/Subscriber
 * pattern.
 */
public final class AsyncFlowable {

    /** Utility class. */
    private AsyncFlowable() {
        throw new IllegalStateException("No instances!");
    }

    /**
     * Invokes the specified function asynchronously and returns an Flowable that emits the result.
     * <p>
     * Note: The function is called immediately and once, not whenever an observer subscribes to the resulting
     * Flowable. Multiple subscriptions to this Flowable observe the same return value.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/start.png" alt="">
     *
     * @param <T> the result value type
     * @param func function to run asynchronously
     * @return an Flowable that emits the function's result value, or notifies observers of an exception
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-start">RxJava Wiki: start()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229036.aspx">MSDN: Observable.Start</a>
     */
    public static <T> Flowable<T> start(Callable<? extends T> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Invokes the specified function asynchronously on the specified Scheduler and returns an Flowable that
     * emits the result.
     * <p>
     * Note: The function is called immediately and once, not whenever an observer subscribes to the resulting
     * Flowable. Multiple subscriptions to this Flowable observe the same return value.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/start.s.png" alt="">
     * <p>
     * @param <T> the result value type
     * @param func function to run asynchronously
     * @param scheduler Scheduler to run the function on
     * @return an Flowable that emits the function's result value, or notifies observers of an exception
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-start">RxJava Wiki: start()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211721.aspx">MSDN: Observable.Start</a>
     */
    public static <T> Flowable<T> start(Callable<T> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     * <p>
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229868.aspx">MSDN: Observable.ToAsync</a>
     */
    public static Callable<Flowable<Object>> toAsync(Action action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <R> the result value type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229182.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <R> Callable<Flowable<R>> toAsync(Callable<? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> first parameter type of the action
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229657.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1> Function<T1, Flowable<Object>> toAsync(Consumer<? super T1> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> first parameter type of the action
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229755.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, R> Function<T1, Flowable<R>> toAsync(Function<? super T1, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param action the action to convert
     * @return a function that returns a Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211875.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2> BiFunction<T1, T2, Flowable<Object>> toAsync(BiConsumer<? super T1, ? super T2> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns a Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229851.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, R> BiFunction<T1, T2, Flowable<R>> toAsync(BiFunction<? super T1, ? super T2, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229336.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3> Function3<T1, T2, T3, Flowable<Object>> toAsync(Consumer3<? super T1, ? super T2, ? super T3> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229450.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, R> Function3<T1, T2, T3, Flowable<R>> toAsync(Function3<? super T1, ? super T2, ? super T3, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229769.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4> Function4<T1, T2, T3, T4, Flowable<Object>> toAsync(Consumer4<? super T1, ? super T2, ? super T3, ? super T4> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229911.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, R> Function4<T1, T2, T3, T4, Flowable<R>> toAsync(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229577.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5> Function5<T1, T2, T3, T4, T5, Flowable<Void>> toAsync(Consumer5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229571.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, R> Function5<T1, T2, T3, T4, T5, Flowable<R>> toAsync(Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211773.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6> Function6<T1, T2, T3, T4, T5, T6, Flowable<Void>> toAsync(Consumer6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229716.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, R> Function6<T1, T2, T3, T4, T5, T6, Flowable<R>> toAsync(Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211812.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7> Function7<T1, T2, T3, T4, T5, T6, T7, Flowable<Void>> toAsync(Consumer7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229773.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, R> Function7<T1, T2, T3, T4, T5, T6, T7, Flowable<R>> toAsync(Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh228993.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Function8<T1, T2, T3, T4, T5, T6, T7, T8, Flowable<Void>> toAsync(Consumer8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229910.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function8<T1, T2, T3, T4, T5, T6, T7, T8, Flowable<R>> toAsync(Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <T9> the ninth parameter type
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211702.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Flowable<Void>> toAsync(Consumer9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <T9> the ninth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh212074.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Flowable<R>> toAsync(Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param action the action to convert
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     */
    public static Function<Object[], Flowable<Void>> toAsyncArray(Consumer<? super Object[]> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <R> the result type
     * @param func the function to convert
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     */
    public static <R> Function<Object[], Flowable<R>> toAsyncArray(Function<? super Object[], ? extends R> func) {
        // TODO
        throw new UnsupportedOperationException();
    }


    /**
     * Convert a synchronous action call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     * <p>
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229868.aspx">MSDN: Observable.ToAsync</a>
     */
    public static Callable<Flowable<Object>> toAsync(Action action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <R> the result value type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229182.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <R> Callable<Flowable<R>> toAsync(Callable<? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> first parameter type of the action
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229657.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1> Function<T1, Flowable<Object>> toAsync(Consumer<? super T1> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> first parameter type of the action
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229755.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, R> Function<T1, Flowable<R>> toAsync(Function<? super T1, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns a Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211875.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2> BiFunction<T1, T2, Flowable<Object>> toAsync(BiConsumer<? super T1, ? super T2> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through a Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns a Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229851.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, R> BiFunction<T1, T2, Flowable<R>> toAsync(BiFunction<? super T1, ? super T2, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229336.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3> Function3<T1, T2, T3, Flowable<Object>> toAsync(Consumer3<? super T1, ? super T2, ? super T3> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229450.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, R> Function3<T1, T2, T3, Flowable<R>> toAsync(Function3<? super T1, ? super T2, ? super T3, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229769.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4> Function4<T1, T2, T3, T4, Flowable<Object>> toAsync(Consumer4<? super T1, ? super T2, ? super T3, ? super T4> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229911.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, R> Function4<T1, T2, T3, T4, Flowable<R>> toAsync(Function4<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229577.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5> Function5<T1, T2, T3, T4, T5, Flowable<Void>> toAsync(Consumer5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229571.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, R> Function5<T1, T2, T3, T4, T5, Flowable<R>> toAsync(Function5<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211773.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6> Function6<T1, T2, T3, T4, T5, T6, Flowable<Void>> toAsync(Consumer6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229716.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, R> Function6<T1, T2, T3, T4, T5, T6, Flowable<R>> toAsync(Function6<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211812.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7> Function7<T1, T2, T3, T4, T5, T6, T7, Flowable<Void>> toAsync(
            Consumer7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229773.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, R> Function7<T1, T2, T3, T4, T5, T6, T7, Flowable<R>> toAsync(
            Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh228993.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8> Function8<T1, T2, T3, T4, T5, T6, T7, T8, Flowable<Void>> toAsync(
            Consumer8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh229910.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> Function8<T1, T2, T3, T4, T5, T6, T7, T8, Flowable<R>> toAsync(
            Function8<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <T9> the ninth parameter type
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh211702.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Flowable<Void>> toAsync(
            Consumer9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <T1> the first parameter type
     * @param <T2> the second parameter type
     * @param <T3> the third parameter type
     * @param <T4> the fourth parameter type
     * @param <T5> the fifth parameter type
     * @param <T6> the sixth parameter type
     * @param <T7> the seventh parameter type
     * @param <T8> the eighth parameter type
     * @param <T9> the ninth parameter type
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     * @see <a href="http://msdn.microsoft.com/en-us/library/hh212074.aspx">MSDN: Observable.ToAsync</a>
     */
    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, Flowable<R>> toAsync(
            Function9<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous action call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.an.png" alt="">
     *
     * @param action the action to convert
     * @param scheduler the Scheduler used to execute the {@code action}
     * @return a function that returns an Flowable that executes the {@code action} and emits {@code null}
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     */
    public static Function<Object[], Flowable<Void>> toAsyncArray(Consumer<? super Object[]> action, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Convert a synchronous function call into an asynchronous function call through an Flowable.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/toAsync.png" alt="">
     *
     * @param <R> the result type
     * @param func the function to convert
     * @param scheduler the Scheduler used to call the {@code func}
     * @return a function that returns an Flowable that executes the {@code func} and emits its returned value
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-toasync-or-asyncaction-or-asyncfunc">RxJava Wiki: toAsync()</a>
     */
    public static <R> Function<Object[], Flowable<R>> toAsyncArray(Function<? super Object[], ? extends R> func, Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Invokes the asynchronous function immediately, surfacing the result through an Observable.
     * <p>
     * <em>Important note</em> subscribing to the resulting Observable blocks until the future completes.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/startFuture.png" alt="">
     *
     * @param <T> the result type
     * @param functionAsync the asynchronous function to run
     * @return an Observable that surfaces the result of the future
     * @see #startFuture(Callable, Scheduler)
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-startfuture">RxJava Wiki: startFuture()</a>
     */
    public static <T> Flowable<T> startFuture(Callable<? extends Future<? extends T>> functionAsync) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Invokes the asynchronous function immediately, surfacing the result through an Observable and waits on
     * the specified Scheduler.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/startFuture.s.png" alt="">
     *
     * @param <T> the result type
     * @param functionAsync the asynchronous function to run
     * @param scheduler the Scheduler where the completion of the Future is awaited
     * @return an Observable that surfaces the result of the future
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-startfuture">RxJava Wiki: startFuture()</a>
     */
    public static <T> Flowable<T> startFuture(Callable<? extends Future<? extends T>> functionAsync,
        Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Returns an Observable that starts the specified asynchronous factory function whenever a new observer
     * subscribes.
     * <p>
     * <em>Important note</em> subscribing to the resulting Observable blocks until the future completes.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/deferFuture.png" alt="">
     *
     * @param <T> the result type
     * @param observableFactoryAsync the asynchronous function to start for each observer
     * @return the Observable emitting items produced by the asynchronous observer produced by the factory
     * @see #deferFuture(Callable, Scheduler)
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-deferfuture">RxJava Wiki: deferFuture()</a>
     */
    public static <T> Flowable<T> deferFuture(Callable<? extends Future<? extends Publisher<? extends T>>> observableFactoryAsync) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Returns an Observable that starts the specified asynchronous factory function whenever a new observer
     * subscribes.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/deferFuture.s.png" alt="">
     *
     * @param <T> the result type
     * @param observableFactoryAsync the asynchronous function to start for each observer
     * @param scheduler the Scheduler where the completion of the Future is awaited
     * @return the Observable emitting items produced by the asynchronous observer produced by the factory
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-deferfuture">RxJava Wiki: deferFuture()</a>
     */
    public static <T> Flowable<T> deferFuture(
            Callable<? extends Future<? extends Publisher<? extends T>>> observableFactoryAsync,
            Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Subscribes to the given source and calls the callback for each emitted item, and surfaces the completion
     * or error through a Future.
     * <p>
     * <em>Important note:</em> The returned task blocks indefinitely unless the {@code run()} method is called
     * or the task is scheduled on an Executor.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/forEachFuture.png" alt="">
     *
     * @param <T> the source value type
     * @param source the source Observable
     * @param onNext the action to call with each emitted element
     * @return the Future representing the entire for-each operation
     * @see #forEachFuture(Publisher, Consumer, Scheduler)
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-foreachfuture">RxJava Wiki: forEachFuture()</a>
     */
    public static <T> FutureTask<Void> forEachFuture(
            Publisher<? extends T> source,
            Consumer<? super T> onNext) {
        // TODO
        throw new UnsupportedOperationException();
    }


    /**
     * Subscribes to the given source and calls the callback for each emitted item, and surfaces the completion
     * or error through a Future.
     * <p>
     * <em>Important note:</em> The returned task blocks indefinitely unless the {@code run()} method is called
     * or the task is scheduled on an Executor.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/forEachFuture.png" alt="">
     *
     * @param <T> the source value type
     * @param source the source Observable
     * @param onNext the action to call with each emitted element
     * @param onError the action to call when an exception is emitted
     * @return the Future representing the entire for-each operation
     * @see #forEachFuture(Publisher, Consumer, Consumer, Scheduler)
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-foreachfuture">RxJava Wiki: forEachFuture()</a>
     */
    public static <T> FutureTask<Void> forEachFuture(
            Publisher<? extends T> source,
            Consumer<? super T> onNext,
            Consumer<? super Throwable> onError) {
        // TODO
        throw new UnsupportedOperationException();
    }


    /**
     * Subscribes to the given source and calls the callback for each emitted item, and surfaces the completion
     * or error through a Future.
     * <p>
     * <em>Important note:</em> The returned task blocks indefinitely unless the {@code run()} method is called
     * or the task is scheduled on an Executor.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/forEachFuture.png" alt="">
     *
     * @param <T> the source value type
     * @param source the source Observable
     * @param onNext the action to call with each emitted element
     * @param onError the action to call when an exception is emitted
     * @param onCompleted the action to call when the source completes
     * @return the Future representing the entire for-each operation
     * @see #forEachFuture(Publisher, Consumer, Consumer, Action, Scheduler)
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-foreachfuture">RxJava Wiki: forEachFuture()</a>
     */
    public static <T> FutureTask<Void> forEachFuture(
            Publisher<? extends T> source,
            Consumer<? super T> onNext,
            Consumer<? super Throwable> onError,
            Action onCompleted) {
        // TODO
        throw new UnsupportedOperationException();
    }


    /**
     * Subscribes to the given source and calls the callback for each emitted item, and surfaces the completion
     * or error through a Future, scheduled on the given scheduler.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/forEachFuture.s.png" alt="">
     *
     * @param <T> the source value type
     * @param source the source Observable
     * @param onNext the action to call with each emitted element
     * @param scheduler the Scheduler where the task will await the termination of the for-each
     * @return the Future representing the entire for-each operation
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-foreachfuture">RxJava Wiki: forEachFuture()</a>
     */
    public static <T> FutureTask<Void> forEachFuture(
            Publisher<? extends T> source,
            Consumer<? super T> onNext,
            Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }


    /**
     * Subscribes to the given source and calls the callback for each emitted item, and surfaces the completion
     * or error through a Future, scheduled on the given Scheduler.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/forEachFuture.s.png" alt="">
     *
     * @param <T> the source value type
     * @param source the source Observable
     * @param onNext the action to call with each emitted element
     * @param onError the action to call when an exception is emitted
     * @param scheduler the Scheduler where the task will await the termination of the for-each
     * @return the Future representing the entire for-each operation
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-foreachfuture">RxJava Wiki: forEachFuture()</a>
     */
    public static <T> FutureTask<Void> forEachFuture(
            Publisher<? extends T> source,
            Consumer<? super T> onNext,
            Consumer<? super Throwable> onError,
            Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }


    /**
     * Subscribes to the given source and calls the callback for each emitted item, and surfaces the completion
     * or error through a Future, scheduled on the given Scheduler.
     * <p>
     * <img width="640" src="https://raw.github.com/wiki/ReactiveX/RxJava/images/rx-operators/forEachFuture.s.png" alt="">
     *
     * @param <T> the source value type
     * @param source the source Observable
     * @param onNext the action to call with each emitted element
     * @param onError the action to call when an exception is emitted
     * @param onCompleted the action to call when the source completes
     * @param scheduler the Scheduler where the task will await the termination of the for-each
     * @return the Future representing the entire for-each operation
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-foreachfuture">RxJava Wiki: forEachFuture()</a>
     */
    public static <T> FutureTask<Void> forEachFuture(
            Publisher<? extends T> source,
            Consumer<? super T> onNext,
            Consumer<? super Throwable> onError,
            Action onCompleted,
            Scheduler scheduler) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Runs the provided action on the given scheduler and allows propagation of multiple events to the
     * observers of the returned StoppableObservable. The action is immediately executed and unobserved values
     * will be lost.
     *
     * @param <T> the output value type
     * @param scheduler the Scheduler where the action is executed
     * @param action the action to execute, receives a Subscriber where the events can be pumped and a
     *               Subscription which lets it check for cancellation condition
     * @return an Observable that provides a Subscription interface to cancel the action
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-runasync">RxJava Wiki: runAsync()</a>
     */
    public static <T> DisposableFlowable<T> runAsync(Scheduler scheduler,
            final BiConsumer<? super Subscriber<? super T>, ? super Subscription> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

    /**
     * Runs the provided action on the given scheduler and allows propagation of multiple events to the
     * observers of the returned StoppableObservable. The action is immediately executed and unobserved values
     * might be lost, depending on the Subject type used.
     *
     * @param <T> the output value of the action
     * @param <U> the output type of the observable sequence
     * @param scheduler the Scheduler where the action is executed
     * @param processor the subject to use to distribute values emitted by the action
     * @param action the action to execute, receives a Subscriber where the events can be pumped and a
     *               Subscription which lets it check for cancellation condition
     * @return an Observable that provides a Subscription interface to cancel the action
     * @see <a href="https://github.com/ReactiveX/RxJava/wiki/Async-Operators#wiki-runasync">RxJava Wiki: runAsync()</a>
     */
    public static <T, U> DisposableFlowable<U> runAsync(Scheduler scheduler,
            final Processor<T, U> processor,
            final BiConsumer<? super Subscriber<? super T>, ? super Subscription> action) {
        // TODO
        throw new UnsupportedOperationException();
    }

}