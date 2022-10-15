package com.example.polushack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.polushack.databinding.MainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
    }
}