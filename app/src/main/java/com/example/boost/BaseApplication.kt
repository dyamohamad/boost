package com.example.boost

import android.app.Application
import android.content.Context
import androidx.multidex.MultiDex

/**
 * Created by Diyana
 */
class BaseApplication:Application(){

    companion object {
        lateinit var instance: BaseApplication
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)
        MultiDex.install(this)
    }

    override fun onCreate() {
        super.onCreate()

    }
}