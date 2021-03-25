package com.bulatov.lesson1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = findViewById<Button>(R.id.buttonFirst)
        val second = findViewById<Button>(R.id.buttonSecond)
        first.setOnClickListener {
            val startFirst = Intent(this, FirstActivity::class.java)
            startActivity(startFirst)
        }
        second.setOnClickListener {
            val startSecond = Intent(this, SecondActivity::class.java)
            startActivity(startSecond)
        }
    }
}