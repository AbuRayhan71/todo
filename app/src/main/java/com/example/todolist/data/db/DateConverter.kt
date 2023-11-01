package com.example.todolist.data.db

import androidx.room.TypeConverter
import java.util.*

class DateConverter {
    // Converts a timestamp (long number) to a Date object.
    @TypeConverter
     fun fromTimeStamp(value : Long) : Date = Date(value)
    @TypeConverter
    // Converts a Date object to a timestamp (long number)
    fun dateToTimeStamp(date : Date) : Long = date.time
}
//