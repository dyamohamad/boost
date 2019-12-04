package com.example.boost.model

/**
 * Created by Diyana
 * This is Object class for the topic,description,downvote,upvote
 */
class TopicDetails{
    var topicName: String = ""
        get() = field
        set(value) { field = value }


    var upVote: Int = 0
        get() = field
        set(value) { field = value }

    var downVote: Int = 0
        get() = field
        set(value) { field = value }

    var description: String = ""
        get() = field
        set(value) { field = value }
}