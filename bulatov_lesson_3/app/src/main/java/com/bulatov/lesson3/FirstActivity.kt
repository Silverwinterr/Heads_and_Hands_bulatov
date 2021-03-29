package com.bulatov.lesson3

import android.os.Bundle
import android.view.Menu
import android.widget.ImageView
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import com.bulatov.lesson3.databinding.PersonalData1Binding
import com.bulatov.lesson3.databinding.PersonalDataBinding
import com.google.android.material.appbar.CollapsingToolbarLayout


class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        fun onCreateOptionsMenu(menu: Menu?): Boolean {
            menuInflater.inflate(R.menu.menu_activity, menu)
            return true
        }

    }
}