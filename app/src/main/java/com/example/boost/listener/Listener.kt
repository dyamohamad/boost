package com.example.boost.listener




interface OnItemListener<T> {

    fun onClick(position: Int, data: T?)

}