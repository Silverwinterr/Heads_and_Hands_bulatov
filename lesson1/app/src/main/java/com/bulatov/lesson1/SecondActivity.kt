package com.bulatov.lesson1

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.KeyEvent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    companion object {
        const val enter = KeyEvent.KEYCODE_ENTER
        const val down = KeyEvent.ACTION_DOWN
        var id = 1
    }

    lateinit var valueStudent: EditText
    lateinit var buttonStudent: Button
    lateinit var valueView: TextView

    @SuppressLint("SetTextI18n")
    private fun setText() {
        if (valueStudent.text.split(" ").size == 4) {
            val (name, lastName, grade, birthday) = valueStudent.text.split(" ")
            val studentData = studentValue(id++, name, lastName, grade, birthday)
            valueView.text = valueView.text.toString() +
                    "${studentData.id} " +
                    "${studentData.name} " +
                    "${studentData.lastName} " +
                    "${studentData.grade} " +
                    "${studentData.birthday}\n"
            valueStudent.setText("")
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        valueStudent = findViewById<EditText>(R.id.enter_value_student)
        buttonStudent = findViewById<Button>(R.id.button_student)
        valueView = findViewById<TextView>(R.id.view_student)

        buttonStudent.setOnClickListener {
            setText()
        }
        valueStudent.setOnKeyListener { view, keyCode, event ->
            if (event.action == down) {
                if (keyCode == enter) {
                    setText()
                    true
                } else false
            } else false
        }
    }
}