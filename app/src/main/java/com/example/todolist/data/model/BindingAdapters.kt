package com.example.todolist.data.model
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.View
import androidx.databinding.BindingAdapter

@BindingAdapter("app:backgroundColor")
fun setBackgroundColor(view: View, colorString: String?) {
    try {
        if (colorString != null) {
            view.setBackgroundColor(Color.parseColor(colorString))
        }
    } catch (e: Exception) {
        // Handle exceptions, e.g., if the color string is invalid
    }
}
