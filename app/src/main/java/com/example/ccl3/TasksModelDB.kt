package com.example.ccl3

import java.util.*

class TasksModelDB(
    val id: Int = getAutoId(),
    val nameTask: String,
    val description: String,
//    val listTitle: String
) {
companion object {
    fun getAutoId(): Int {
        val random = Random()
        return  random.nextInt(100)
    }
}

}