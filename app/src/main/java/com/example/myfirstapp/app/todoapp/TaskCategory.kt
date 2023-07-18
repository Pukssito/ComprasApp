package com.example.myfirstapp.app.todoapp

sealed class TaskCategory {
    object Business :TaskCategory()
    object Personal :TaskCategory()
    object Other :TaskCategory()


}


