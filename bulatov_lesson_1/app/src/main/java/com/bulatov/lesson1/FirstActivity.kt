package com.bulatov.lesson1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class FirstActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        val getButton = findViewById<Button>(R.id.get_button)
        val setButton = findViewById<Button>(R.id.set_button)
        val enterValue = findViewById<EditText>(R.id.enter_value)
        val setValue = findViewById<TextView>(R.id.view_value)
        val valueArray: TreeSet<String> = sortedSetOf()
        getButton.setOnClickListener {
            valueArray.add("${enterValue.text}")
            enterValue.setText("")
        }
        setButton.setOnClickListener {
            setValue.text = valueArray.joinToString("\n")
        }
    }
}