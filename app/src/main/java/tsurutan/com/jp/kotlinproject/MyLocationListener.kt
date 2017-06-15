package tsurutan.com.jp.kotlinproject

import android.arch.lifecycle.Lifecycle
import android.arch.lifecycle.LifecycleObserver
import android.arch.lifecycle.OnLifecycleEvent
import android.content.Context

import javax.security.auth.callback.Callback

/**
 * Created by tsurutan on 2017/06/15.
 */

class MyLocationListener(context: Context, lifecycle: Lifecycle, callback:CallbackLocation) : LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    internal fun start() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    internal fun stop() {

    }

}
