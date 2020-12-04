package com.example.finalprojectremind

interface UpdateAndDelete {
    fun modifyItem(itemUID :String, isDone :Boolean)
    fun onItemDelete(itemUID: String)
}