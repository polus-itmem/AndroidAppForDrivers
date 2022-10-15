package com.example.polushack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.polushack.databinding.LoginBinding
import java.util.*

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: LoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        updateLoginPage()
        binding.buttonSignIn.setOnClickListener {
            Toast.makeText(this@LoginActivity, "You dared to click me?", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onResume() {
        super.onResume()
        updateLoginPage()
    }

    private fun updateLoginPage() {
        binding.textViewGreeting.text = getGreetingMessage()
        binding.imageView.setImageResource(getImage())
    }
    private fun getGreetingMessage():String{
        val c = Calendar.getInstance()

        return when (c.get(Calendar.HOUR_OF_DAY)) {
            in 0..4 -> "Доброй ночи!"
            in 4..12 -> "Доброе утро!"
            in 12..17 -> "Добрый день!"
            in 17..24 -> "Добрый вечер!"
            else -> "Доброго времени суток!"
        }
    }
    private fun getImage():Int{
        val c = Calendar.getInstance()

        if (c.get(Calendar.HOUR_OF_DAY) in 4..17) {
            return R.drawable.good_morning_img
        }
        return R.drawable.good_night_img
    }
}