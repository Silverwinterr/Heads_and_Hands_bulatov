package com.bulatov.bulatov_lesson_5

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bulatov.bulatov_lesson_5.databinding.ActivityFifthBinding


class ActivityFifth : AppCompatActivity() {
    lateinit var activityFifth: ActivityFifthBinding
    var value: Data? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityFifth = ActivityFifthBinding.inflate(layoutInflater)
        val view = activityFifth.root
        setContentView(view)
        activityFifth.activityFifthButtonDeliverResult.setOnClickListener {
            val intent = Intent(this, ActivityThird::class.java)
            intent.putExtra("text", activityFifth.activityFifthText.text.toString())
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
        if (savedInstanceState != null) {
            value = savedInstanceState.getParcelable("data") as Data?
            setValue()
        }
        activityFifth.activityFifthButtonDataSave.setOnClickListener {
            value = Data(activityFifth.activityFifthText.text.toString())
            setValue()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable("data", value)
    }
    fun setValue(){
        activityFifth.activityFifthTextSave.text = value?.string
    }
}