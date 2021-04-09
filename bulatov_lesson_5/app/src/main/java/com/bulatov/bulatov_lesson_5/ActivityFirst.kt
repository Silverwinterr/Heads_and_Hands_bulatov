package com.bulatov.bulatov_lesson_5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bulatov.bulatov_lesson_5.ActivitySixty.ActivitySixty
import com.bulatov.bulatov_lesson_5.databinding.ActivityFirstBinding
import java.text.SimpleDateFormat
import java.util.*

class ActivityFirst : AppCompatActivity() {
    companion object {
        const val TIME_FORMAT = "dd.MM.yyyy HH:mm:ss"
        const val TIME_CODE = "time"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activityFirst = ActivityFirstBinding.inflate(layoutInflater)
        val view = activityFirst.root
        setContentView(view)

        activityFirst.activityFirstButtonGoToFourth.setOnClickListener {
            val intent = Intent(this, ActivityFourth::class.java)
            val currentTime = System.currentTimeMillis()
            val simpleDateFormat = SimpleDateFormat(TIME_FORMAT)
            val date = Date(currentTime)
            val time = simpleDateFormat.format(date)
            intent.putExtra(TIME_CODE, time)
            startActivity(intent)
        }
        activityFirst.activityFirstButtonGoToSecond.setOnClickListener {
            val intent = Intent(this, ActivitySecond::class.java)
            startActivity(intent)
        }
        activityFirst.activityFirstButtonGoToSix.setOnClickListener {
            val intent = Intent(this,ActivitySixty::class.java)
            startActivity(intent)
        }

    }
}