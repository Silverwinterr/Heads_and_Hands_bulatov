package com.bulatov.lesson4


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    companion object {
        const val LAYOUT_SHORT = 2
        const val LAYOUT_LONG = 1
    }

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = Adapter(ContentItem().addListDetailInfoItem())
        (recyclerView.layoutManager as GridLayoutManager).spanSizeLookup =
            object : SpanSizeLookup() {
                override fun getSpanSize(position: Int): Int {
                    return if (position > 5)
                        LAYOUT_SHORT
                    else
                        LAYOUT_LONG
                }
            }
    }
}