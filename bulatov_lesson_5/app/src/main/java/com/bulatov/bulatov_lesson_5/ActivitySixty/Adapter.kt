package com.bulatov.bulatov_lesson_5.ActivitySixty

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bulatov.bulatov_lesson_5.R

class Adapter(private var value : List<Item>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int = value.size

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView!!) {
        var iconView: ImageView? = null
        var titleView: TextView? = null
        var contentView: TextView? = null
        var addressView: TextView? = null
        var parent: ConstraintLayout? = null
        var more: ImageView? = null
        init {
            more = itemView?.findViewById(R.id.item_more)
            parent = itemView?.findViewById(R.id.item_parent)
            iconView = itemView?.findViewById(R.id.item_image)
            titleView = itemView?.findViewById(R.id.item_title)
            contentView = itemView?.findViewById(R.id.item_content)
            addressView = itemView?.findViewById(R.id.item_address)
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.iconView?.setBackgroundColor(value[position].icon)
        holder.titleView?.text = value[position].title
        holder.contentView?.text = value[position].content
        holder.addressView?.text = value[position].address
        holder.parent?.setOnClickListener {
            Toast.makeText(it.context, value[position].title,Toast.LENGTH_SHORT).show()
        }
        holder.more?.setOnClickListener {
            Toast.makeText(it.context, value[position].content,Toast.LENGTH_SHORT).show()
        }
    }
}