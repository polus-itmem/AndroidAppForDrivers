package com.example.polushack

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        updateLoginPage()
    }

    override fun onResume() {
        super.onResume()
        updateLoginPage()
    }

    private fun updateLoginPage() {
        findViewById<TextView>(R.id.textView).apply {
            text = getGreetingMessage()
        }
        findViewById<ImageView>(R.id.imageView).setImageResource(getImage())
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