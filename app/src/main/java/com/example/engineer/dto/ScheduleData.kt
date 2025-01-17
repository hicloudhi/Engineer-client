package com.example.engineer.dto

import java.io.Serializable

data class ScheduleData(
    val dateTime: String = "0",
    val product: String = "1",
    val address: String = "2",
    var process: String = "3",
    val phoneNum: String = "4",
    val content: String = "5"
) : Serializable
