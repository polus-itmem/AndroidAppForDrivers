package com.example.polushack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.polushack.databinding.MainDevBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainDevBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainDevBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.buttonMap.setOnClickListener {
            val intent = Intent(this, MapActivity::class.java)
            startActivity(intent)
        }
        binding.buttonUserLocation.setOnClickListener {
            val intent = Intent(this, UserLocationActivity::class.java)
            startActivity(intent)
        }
        binding.buttonLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}