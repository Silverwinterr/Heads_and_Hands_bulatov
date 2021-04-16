package com.bulatov.bulatov_lesson_6.fragment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bulatov.bulatov_lesson_6.R


class ViewPagerAdapter(private val images: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image: ImageView? = null
        var text: TextView? = null

        init {
            text = itemView.findViewById(R.id.view_pager_textView)
            image = itemView.findViewById(R.id.view_pager_imageView)
            image?.setOnClickListener {
                Toast.makeText(it.context,"Картинка ${adapterPosition+1}",Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_pager, parent, false)
        return ViewPagerViewHolder(view)
    }

    override fun getItemCount(): Int {
        return images.size
    }

    override fun onBindViewHolder(holder: ViewPagerViewHolder, position: Int) {
        val curImage = images[position]
        holder.image?.setImageResource(curImage)
        holder.text?.text = "Картинка ${position + 1}"
    }
}