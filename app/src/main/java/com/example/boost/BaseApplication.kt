package com.example.boost

import android.app.Application
import android.content.Context
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


     val list = arrayListOf(
        TopicDetails(resources.getString(R.string.first_title), 0,10),
        TopicDetails(resources.getString(R.string.sec_title), 11,9),
        TopicDetails(resources.getString(R.string.thid_title), 90,10),
        TopicDetails(resources.getString(R.string.fourth_title), 20,20),
        TopicDetails(resources.getString(R.string.fifth_title), 4,3),
        TopicDetails(resources.getString(R.string.sixth_title), 10,8),
        TopicDetails(resources.getString(R.string.seven_title), 9,10),
        TopicDetails(resources.getString(R.string.eight_title), 6,10),
        TopicDetails(resources.getString(R.string.nine_title), 3,6),
        TopicDetails(resources.getString(R.string.tenth_title), 9,2),
        TopicDetails(resources.getString(R.string.eleven_title), 1,0),
        TopicDetails(resources.getString(R.string.twelvth_title), 45,0),
        TopicDetails(resources.getString(R.string.thirteen_title), 9,0),
        TopicDetails(resources.getString(R.string.fourteen_title), 0,8),
        TopicDetails(resources.getString(R.string.fifteen_title), 0,6),
        TopicDetails(resources.getString(R.string.sixth_title), 3,1),
        TopicDetails(resources.getString(R.string.seventeen_title), 0,6),
        TopicDetails(resources.getString(R.string.eighteen_title), 0,3),
        TopicDetails(resources.getString(R.string.nineteen_title), 0,50),
        TopicDetails(resources.getString(R.string.twenty_title), 10,10)
    )


}