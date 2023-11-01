package com.example.todolist.data.db

import androidx.room.*
import com.example.todolist.data.model.CategoryInfo
import com.example.todolist.data.model.TaskInfo
// Defines the database configuration and serves as the app's main access point to the persisted data.
@Database(entities = [TaskInfo::class, CategoryInfo::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class TaskDatabase : RoomDatabase() {
    // Returns a Data Access Object (DAO) for accessing the database operations.lll
    abstract fun getTaskCategoryDao() : TaskCategoryDao
}