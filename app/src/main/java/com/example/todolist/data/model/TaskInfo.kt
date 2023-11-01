package com.example.todolist.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Embedded
import androidx.room.Relation
import java.io.Serializable
import java.util.Date

// Defines the structure for a task entity with various details.
@Entity(tableName = "taskInfo")
data class TaskInfo(
    @PrimaryKey(autoGenerate = false)
    var id : Int,
    var description : String,
    var date : Date,
    var priority : Int,
    var status : Boolean,
    var category: String
) : Serializable

// Represents the relationship between a task and its category.
data class TaskCategoryInfo(
    @Embedded val taskInfo: TaskInfo, // The task details are embedded within this class.
    @Relation(
        parentColumn = "category", // The column in TaskInfo that relates to CategoryInfo.
        entityColumn = "categoryInformation" // The column in CategoryInfo that TaskInfo refers to.
    )
    val categoryInfo: List<CategoryInfo> // A list of categories associated with the task.
) : Serializable
