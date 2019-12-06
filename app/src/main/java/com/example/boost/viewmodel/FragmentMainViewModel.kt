package com.example.boost.viewmodel

import android.app.Application
import android.view.View
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.boost.BaseApplication
import com.example.boost.R
import com.example.boost.model.TopicDetails
import com.example.boost.util.SingleLiveEvent

class FragmentMainViewModel(application: Application) : AndroidViewModel(application) {
    // TODO: Implement the ViewModel

    private val context = getApplication<Application>().applicationContext

    val onClickAdd: SingleLiveEvent<View> = SingleLiveEvent()

    fun onClickAddNewTopic(v: View) {
        onClickAdd.postValue(v)
    }


    //function to sort the list by descending order of upvote
    fun compareUpvoteDescendingOrder():List<TopicDetails>
    {
        return ArrayList(list)
            .sortedWith(compareByDescending<TopicDetails> { it.upVote })

    }
    //initialize data
    val list = arrayListOf(
        TopicDetails(context.resources.getString(R.string.first_title), 0,10),
        TopicDetails(context.resources.getString(R.string.sec_title), 11,9),
        TopicDetails(context.resources.getString(R.string.thid_title), 90,10),
        TopicDetails(context.resources.getString(R.string.fourth_title), 20,20),
        TopicDetails(context.resources.getString(R.string.fifth_title), 4,3),
        TopicDetails(context.resources.getString(R.string.sixth_title), 10,8),
        TopicDetails(context.resources.getString(R.string.seven_title), 9,10),
        TopicDetails(context.resources.getString(R.string.eight_title), 6,10),
        TopicDetails(context.resources.getString(R.string.nine_title), 3,6),
        TopicDetails(context.resources.getString(R.string.tenth_title), 9,2),
        TopicDetails(context.resources.getString(R.string.eleven_title), 1,0),
        TopicDetails(context.resources.getString(R.string.twelvth_title), 45,0),
        TopicDetails(context.resources.getString(R.string.thirteen_title), 9,0),
        TopicDetails(context.resources.getString(R.string.fourteen_title), 0,8),
        TopicDetails(context.resources.getString(R.string.fifteen_title), 0,6),
        TopicDetails(context.resources.getString(R.string.sixth_title), 3,1),
        TopicDetails(context.resources.getString(R.string.seventeen_title), 0,6),
        TopicDetails(context.resources.getString(R.string.eighteen_title), 0,3),
        TopicDetails(context.resources.getString(R.string.nineteen_title), 0,50),
        TopicDetails(context.resources.getString(R.string.twenty_title), 10,10)
    )



}
