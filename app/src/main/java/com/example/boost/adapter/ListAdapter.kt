package com.example.boost.adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.boost.holder.ItemViewHolder
import com.example.boost.listener.OnItemListener
import com.example.boost.model.TopicDetails

class ListAdapter(var nameList: List<TopicDetails>?, val listener: OnItemListener<TopicDetails>):
    RecyclerView.Adapter<ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder.create(parent)
    }

    fun update(list: List<TopicDetails>?){
        nameList = list
    }

    override fun getItemCount(): Int {
        return nameList?.size ?: 0
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        nameList?.let {
            holder.bindTo(nameList!!.get(position),listener)
        }
    }

}