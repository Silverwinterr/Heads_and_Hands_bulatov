package com.bulatov.lesson3

import android.os.Build
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bulatov.lesson3.databinding.ActivitySecondBinding
import com.bulatov.lesson3.databinding.PersonalDataBinding
import com.bulatov.lesson3.databinding.TopToolbar1Binding

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu_activity, menu)
            return true
        }

    }
}