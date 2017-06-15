package tsurutan.com.jp.kotlinproject

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent

import javax.security.auth.callback.Callback

/**
 * Created by tsurutan on 2017/06/15.
 */

class Test : LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    internal fun stop() {
        // disconnect if connected
    }
    //    private MyLocationListener listener;
    //
    //    private void test(CallbackLocation callback) {
    //
    //    }
    //
    //    public interface CallbackLocation {
    //        void test(int location);
    //    }
    //
    //    private void test2() {
    //        test(new CallbackLocation() {
    //            @Override
    //            public void test(int location) {
    //
    //            }
    //        });
    //    }
}
