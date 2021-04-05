package com.bulatov.lesson4


import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
import androidx.recyclerview.widget.RecyclerView
import com.bulatov.lesson4.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    companion object {
        const val LAYOUT_SHORT = 2
        const val LAYOUT_LONG = 1
        const val LAYOUT_POSITION = 5
        const val ALERT_MESSAGE = "Info"
        const val ALERT_NEGATIVE_TEXT = "Отмена"
        const val HOME_TEXT = "Home"
        const val LAYOUT_MARGIN = 8
        const val SPAN_COUNT = 2
    }

    lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        recyclerView = binding.recyclerView
        recyclerView.layoutManager = GridLayoutManager(this, SPAN_COUNT)
        recyclerView.addItemDecoration(ItemDecoration(LAYOUT_MARGIN))
        recyclerView.adapter = Adapter(ContentItem().addListInfoItem())
        (recyclerView.layoutManager as GridLayoutManager).spanSizeLookup =
            object : SpanSizeLookup() {
                override fun getSpanSize(position: Int): Int {
                    return if (position > LAYOUT_POSITION)
                        LAYOUT_SHORT
                    else
                        LAYOUT_LONG
                }
            }
        binding.cardInfoButtonView.setOnClickListener {
            val dialog = AlertDialog.Builder(this)
            dialog.setMessage(ALERT_MESSAGE)
            dialog.setNegativeButton(
                ALERT_NEGATIVE_TEXT
            ) { _: DialogInterface?, _: Int -> }
            dialog.show()
        }
        binding.cardHomeButtonView.setOnClickListener {
            Toast.makeText(this, HOME_TEXT, Toast.LENGTH_SHORT).show()
        }
    }
}