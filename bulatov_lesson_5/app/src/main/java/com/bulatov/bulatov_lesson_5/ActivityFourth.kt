package com.bulatov.bulatov_lesson_5

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bulatov.bulatov_lesson_5.databinding.ActivityFourthBinding
import java.text.SimpleDateFormat
import java.util.*


class ActivityFourth : AppCompatActivity() {
    companion object {
        const val TIME_SET_TAG = "timeSet"
    }

    lateinit var activityFourth: ActivityFourthBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityFourth = ActivityFourthBinding.inflate(layoutInflater)
        val view = activityFourth.root
        setContentView(view)
        setTime(ActivityFirst.TIME_CODE)
        activityFourth.activityFourthButtonGoToFourthAgain.setOnClickListener {
            intent.flags = Intent.FLAG_ACTIVITY_SINGLE_TOP
            val currentTime = System.currentTimeMillis()
            val simpleDateFormat = SimpleDateFormat(ActivityFirst.TIME_FORMAT)
            val date = Date(currentTime)
            val time = simpleDateFormat.format(date)
            intent.putExtra(TIME_SET_TAG, time)
            startActivity(intent)
        }
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setTime(TIME_SET_TAG)
    }

    private fun setTime(value: String) {
        activityFourth.activityFourthGetCurrentData.text = intent?.getStringExtra(value)
    }
}