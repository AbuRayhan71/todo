package com.example.todolist.data.db

import androidx.room.TypeConverter
import java.util.*
//The purpose of the DateConverter class is to provide a way to store Date objects in the database.
// SQLite does not have a native way to store date and time values as it does with other data types like integers and strings.
// To work around this, Room allows developers to define TypeConverters that can convert custom objects to and from a type that SQLite can understand.
class DateConverter {
    // Converts a timestamp (long number) to a Date object.
    @TypeConverter
     fun fromTimeStamp(value : Long) : Date = Date(value)
    @TypeConverter
    // Converts a Date object to a timestamp (long number)
    fun dateToTimeStamp(date : Date) : Long = date.time
}
//