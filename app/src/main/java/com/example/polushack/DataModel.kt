package com.example.polushack

class DataModel (
    val tasks : List<TaskModel> = listOf(
        TaskModel(
            status = Status.WAITING,
            fromPlace = "ЕКБ",
            toPlace = "СПБ",
            fromTime = "12:30 1 Oct",
            toTime = "18:30 1 Oct",
            description = "Crane"
        ),
        TaskModel(
            status = Status.SUCCESS,
            fromPlace = "МСК",
            toPlace = "СПБ",
            fromTime = "15:30 2 Oct",
            toTime = "18:30 2 Oct",
            description = "Камаз big"
        ),
        TaskModel(
            status = Status.WAITING,
            fromPlace = "СПБ",
            toPlace = "МСК",
            fromTime = "15:30 2 Oct",
            toTime = "18:30 2 Oct",
            description = "Камаз small"
        ),
        TaskModel(
            status = Status.WAITING,
            fromPlace = "ВЛГ",
            toPlace = "МСК",
            fromTime = "17:30 3 Oct",
            toTime = "18:30 3 Oct",
            description = "Cream"
        )
    )
)

class TaskModel (
    val status: Status,
    val fromPlace: String,
    val toPlace: String,
    val fromTime: String,
    val toTime: String,
    val description: String
    )

enum class Status {
    WARNING, WAITING, SUCCESS
}