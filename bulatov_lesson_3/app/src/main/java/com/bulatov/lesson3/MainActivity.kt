package com.bulatov.lesson3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val first = findViewById<Button>(R.id.firstActivity)
        val second = findViewById<Button>(R.id.secondActivity)
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