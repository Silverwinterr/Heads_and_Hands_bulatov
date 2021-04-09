package com.bulatov.bulatov_lesson_5

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bulatov.bulatov_lesson_5.databinding.ActivityThirdBinding
import com.google.android.material.snackbar.Snackbar

class ActivityThird : AppCompatActivity() {
    private lateinit var activityThird: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityThird = ActivityThirdBinding.inflate(layoutInflater)
        val view = activityThird.root
        setContentView(view)
        activityThird.activityThirdButtonGoToFirst.setOnClickListener {
            val intent = Intent(this, ActivityFirst::class.java)
            startActivity(intent)
        }
        activityThird.activityThirdButtonGoToFifth.setOnClickListener {
            val intent = Intent(this, ActivityFifth::class.java)
            startActivityForResult(intent, 1)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1) {
            if (resultCode == Activity.RESULT_OK) {
                val take = data?.getStringExtra("text")
                Snackbar.make(
                        activityThird.root, "$take",
                        Snackbar.LENGTH_LONG
                ).show()
            }
        }
    }
}