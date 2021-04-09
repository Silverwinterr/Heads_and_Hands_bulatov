package com.bulatov.bulatov_lesson_5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bulatov.bulatov_lesson_5.databinding.ActivityFirstBinding
import com.bulatov.bulatov_lesson_5.databinding.ActivitySecondBinding

class ActivitySecond : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val activitySecond = ActivitySecondBinding.inflate(layoutInflater)
        val view = activitySecond.root
        setContentView(view)
        activitySecond.activitySecondButtonGoToThird.setOnClickListener {
            val intent = Intent(this,ActivityThird::class.java)
            startActivity(intent)
        }
    }
}