package tsurutan.com.jp.kotlinproject

import android.arch.lifecycle.LifecycleActivity
import android.os.Bundle

class MainActivity : LifecycleActivity() {
    private var myLocation: MyLocationListener? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myLocation = MyLocationListener(applicationContext, lifecycle, object : CallbackLocation {
            override fun test(value: Int) {

            }
        })
    }
}
