package com.example.boost.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.boost.R
import com.example.boost.adapter.ListAdapter
import com.example.boost.databinding.FragmentMainFragmentBinding
import com.example.boost.model.TopicDetails
import com.example.boost.viewmodel.FragmentMainViewModel

class FragmentMain : Fragment() {

    companion object {
        fun newInstance() = FragmentMain()
    }

    private lateinit var viewModel: FragmentMainViewModel
    lateinit var binding: FragmentMainFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_main_fragment, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(FragmentMainViewModel::class.java)
        // TODO: Use the ViewModel
        binding.viewmodel = viewModel
        binding.lifecycleOwner = this

        initRecyclerView()
    }

    fun initRecyclerView(){


        val adapter = ListAdapter(list)
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }


    private val list = arrayListOf(
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
