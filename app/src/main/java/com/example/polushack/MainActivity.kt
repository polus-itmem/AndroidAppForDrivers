package com.example.polushack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.polushack.databinding.MainBinding
import com.example.polushack.databinding.TaskBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val dataModel = DataModel()
        for (i in 1..10) {
            dataModel.tasks.forEach { task ->
                val taskBinding = TaskBinding.inflate(layoutInflater)
                taskBinding.status.setImageResource(R.drawable.waiting)
                taskBinding.fromPlace.text = task.fromPlace
                taskBinding.toPlace.text = task.toPlace
                taskBinding.fromTime.text = task.fromTime
                taskBinding.toTime.text = task.toTime
                taskBinding.description.text = task.description
                binding.tasksLinearLayout.addView(taskBinding.root)
            }
        }
    }
}