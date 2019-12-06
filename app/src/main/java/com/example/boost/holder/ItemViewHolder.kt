package com.example.boost.holder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.boost.R
import com.example.boost.listener.OnItemListener
import com.example.boost.model.TopicDetails
import kotlinx.android.synthetic.main.item_topic.view.*

class ItemViewHolder(var view: View):
    RecyclerView.ViewHolder(view) {

    companion object {
        fun create(parent: ViewGroup): ItemViewHolder {
            val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)
            return ItemViewHolder(view)
        }
    }

    fun bindTo(topic: TopicDetails, listener: OnItemListener<TopicDetails>) {
        view.tv_topic.text=topic.topicTItle
        view.img_up.setOnClickListener {
            listener.onClick(adapterPosition, topic)
        }

        view.img_down.setOnClickListener {

        }



    }
}