package com.example.todolist.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

// Represents a category in the to-do list with a unique name/identifier and associated color.
@Entity(tableName = "categoryInfo")
data class CategoryInfo(
    @PrimaryKey
    var categoryInformation: String,
    var color: String
) : Serializable

// Represents the number of tasks associated with each category, including the category's color.
data class NoOfTaskForEachCategory(
    val category: String, // Name of the category
    val color: String,    // Color for the category, usually for UI display
    val count: Int,       // Number of tasks within this category
)
