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
            val view: View =
                LayoutInflater.from(parent.context).inflate(R.layout.item_topic, parent, false)

            return ItemViewHolder(view)
        }
    }

    fun bindTo(topic: TopicDetails, listener: OnItemListener<TopicDetails>) {
        view.tv_totalupvote.text = topic.upVote.toString()
        view.tv_totalupdownvote.text = topic.downvote.toString()
        view.tv_topic.text = topic.topicTItle

        view.img_up.setOnClickListener {
            //count vote
            //type 0=upvote
            listener.onClick(adapterPosition, topic,0)
        }

        view.img_down.setOnClickListener {
            //type 1=downvote
            listener.onClick(adapterPosition, topic,1)
        }

        view.setOnClickListener {
            listener.onClickItem(adapterPosition, topic)


        }
    }
}