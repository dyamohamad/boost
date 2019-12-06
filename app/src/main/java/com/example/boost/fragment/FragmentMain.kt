package com.example.boost.fragment

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.boost.R
import com.example.boost.adapter.ListAdapter
import com.example.boost.databinding.FragmentMainFragmentBinding
import com.example.boost.listener.OnItemListener
import com.example.boost.model.TopicDetails
import com.example.boost.viewmodel.FragmentMainViewModel
import kotlinx.android.synthetic.main.field.view.*

class FragmentMain : Fragment() {

    companion object {
        fun newInstance() = FragmentMain()
    }

    private lateinit var viewModel: FragmentMainViewModel
    private val DOWN_VOTE = 1
    private val UP_VOTE = 0
    lateinit var adapter: ListAdapter
    lateinit var binding: FragmentMainFragmentBinding
    val listArray: ArrayList<TopicDetails> = ArrayList()
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

        viewModel.onClickAdd.observe(viewLifecycleOwner, Observer {
            showAlertDialogToAddNewTopic()
        })
        listArray.addAll(viewModel.compareUpvoteDescendingOrder())

        initRecyclerView()
    }

    fun initRecyclerView() {

        adapter =
            ListAdapter(listArray, object :
                OnItemListener<TopicDetails> {
                override fun onClickItem(position: Int, data: TopicDetails?) {
                    context?.let {
                        //click upvote or downvote


                    }

                }

                override fun onClick(position: Int, data: TopicDetails?, type: Int) {
                    context?.let {
                        //click upvote or downvote
                        when (type) {
                            UP_VOTE -> {
                                listArray.get(position).upVote++
                                adapter.notifyItemChanged(position)
                            }

                            DOWN_VOTE -> {
                                if (listArray.get(position).downvote != 0) {
                                    listArray.get(position).downvote--
                                    adapter.notifyItemChanged(position)
                                }

                            }


                        }


                    }

                }
            })

        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.recyclerView.adapter = adapter
        binding.recyclerView.setHasFixedSize(true)
    }

    fun showAlertDialogToAddNewTopic() {
        val builder = AlertDialog.Builder(getContext())
        val view = layoutInflater.inflate(R.layout.field, null)
        builder.setView(view)

        // set up the ok button
        builder.setPositiveButton(android.R.string.ok) { dialog, _ ->
            val newCategory = view.et_new_topic.text.toString()
            var isValid = true
            if (newCategory.isEmpty()) {
                isValid = false
            }

            if (isValid) {

                listArray.add(TopicDetails(newCategory, 0, 0))
                adapter.notifyDataSetChanged()

            }

            if (isValid) {
                dialog.dismiss()
            }
        }

        builder.setNegativeButton(android.R.string.cancel) { dialog, _ ->
            dialog.cancel()
        }

        builder.show()
    }


}
