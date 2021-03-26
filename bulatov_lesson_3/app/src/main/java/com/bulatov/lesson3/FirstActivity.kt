package com.bulatov.lesson3

import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.CollapsingToolbarLayout


class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        val back = findViewById<ImageView>(R.id.back_to_main)
        val editData = findViewById<ImageView>(R.id.topPen)
        val editData1 = findViewById<ImageView>(R.id.bottom_pen)
        val imageExit = findViewById<ImageView>(R.id.door_exit)
        val textExit = findViewById<TextView>(R.id.text_exit)
        fun exit(){
                Toast.makeText(getApplicationContext(), "На выход!", Toast.LENGTH_SHORT).show()
        }
        back.setOnClickListener {
            Toast.makeText(getApplicationContext(), "В клуб петровичей", Toast.LENGTH_SHORT).show()
        }
        editData.setOnClickListener {
            Toast.makeText(getApplicationContext(), "Меняем данные", Toast.LENGTH_SHORT).show()
        }
        editData1.setOnClickListener {
            Toast.makeText(getApplicationContext(), "Меняем данные", Toast.LENGTH_SHORT).show()
        }
        imageExit.setOnClickListener {
            exit()
        }
        textExit.setOnClickListener {
            exit()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_activity, menu)
        return true
    }

}