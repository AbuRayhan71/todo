package com.example.todolist.data.domain

import androidx.lifecycle.LiveData
import com.example.todolist.data.model.CategoryInfo
import com.example.todolist.data.model.NoOfTaskForEachCategory
import com.example.todolist.data.model.TaskCategoryInfo
import com.example.todolist.data.model.TaskInfo
import java.util.*
//The TaskCategoryRepository is like a to-do list manager for the app.
// It has rules for how to handle the list of tasks and categories:
interface TaskCategoryRepository {
    // Updates the completion status of a task.
    suspend fun updateTaskStatus(task: TaskInfo) : Int

    // Deletes a specific task from the database.
    suspend fun deleteTask(task: TaskInfo)

    // Inserts a task and its associated category into the database at the same time.
    suspend fun insertTaskAndCategory(taskInfo: TaskInfo, categoryInfo: CategoryInfo)

    // Deletes a task and its associated category from the database.
    suspend fun deleteTaskAndCategory(taskInfo: TaskInfo, categoryInfo: CategoryInfo)

    // Updates a task's details, adds a new category, and deletes an old category, all in one operation.
    suspend fun updateTaskAndAddDeleteCategory(taskInfo: TaskInfo, categoryInfoAdd: CategoryInfo, categoryInfoDelete: CategoryInfo)

    // Updates a task's details and adds a new category to the database.
    suspend fun updateTaskAndAddCategory(taskInfo: TaskInfo, categoryInfo: CategoryInfo)

    // Retrieves a list of all uncompleted tasks.
    fun getUncompletedTask(): LiveData<List<TaskCategoryInfo>>

    // Retrieves a list of all completed tasks.
    fun getCompletedTask(): LiveData<List<TaskCategoryInfo>>

    // Retrieves a list of uncompleted tasks for a specific category.
    fun getUncompletedTaskOfCategory(category: String): LiveData<List<TaskCategoryInfo>>

    // Retrieves a list of completed tasks for a specific category.
    fun getCompletedTaskOfCategory(category: String): LiveData<List<TaskCategoryInfo>>

    // Retrieves a list showing the number of uncompleted tasks for each category.
    fun getNoOfTaskForEachCategory(): LiveData<List<NoOfTaskForEachCategory>>

    // Retrieves a list of all categories.
    fun getCategories(): LiveData<List<CategoryInfo>>

    // Counts how many tasks exist within a specific category.
    suspend fun getCountOfCategory(category: String) : Int

    // Retrieves a list of tasks with a future alarm (tasks that are upcoming).
    suspend fun getActiveAlarms(currentTime : Date) : List<TaskInfo>
}
