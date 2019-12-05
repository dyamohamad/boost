package com.example.boost.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel
import com.example.boost.R
import com.example.boost.model.TopicDetails
import com.example.boost.util.SingleLiveEvent

class FragmentMainViewModel : ViewModel() {
    // TODO: Implement the ViewModel

    val onClickAdd: SingleLiveEvent<View> = SingleLiveEvent()

    fun onClickAddNewTopic(v: View) {
        onClickAdd.postValue(v)
    }



}
