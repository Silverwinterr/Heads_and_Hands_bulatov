package com.bulatov.bulatov_lesson_5.ActivitySixty

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bulatov.bulatov_lesson_5.databinding.ActivitySixtyBinding

class ActivitySixty : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var activitySixty : ActivitySixtyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activitySixty = ActivitySixtyBinding.inflate(layoutInflater)
        setContentView(activitySixty.root)
        recyclerView = activitySixty.recyclerView
        recyclerView.layoutManager = GridLayoutManager(this, 1)
        recyclerView.addItemDecoration(ItemDecoration(8))
        recyclerView.adapter = Adapter(ItemContent().addListInfoItem())
        activitySixty.buttonAll.setOnClickListener {
            Toast.makeText(it.context,"ALL!!!",Toast.LENGTH_SHORT).show()
        }
        activitySixty.parentPartnership.setOnClickListener {
            Toast.makeText(it.context,"CLICK CLICK",Toast.LENGTH_SHORT).show()
        }
    }
}