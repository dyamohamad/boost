package com.example.boost

import android.app.Application
import android.content.Context
import android.content.res.Resources
import androidx.multidex.MultiDex
import com.example.boost.model.TopicDetails

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

        instance = this
    }





}