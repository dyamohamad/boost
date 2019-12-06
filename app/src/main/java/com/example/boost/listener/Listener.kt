package com.example.boost.listener




interface OnItemListener<T> {

    fun onClick(position: Int, data: T?,type:Int)

    fun onClickItem(position: Int, data: T?)

}