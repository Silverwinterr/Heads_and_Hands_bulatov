package com.bulatov.bulatov_lesson_6.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bulatov.bulatov_lesson_6.R
import com.bulatov.bulatov_lesson_6.databinding.ViewPagerBinding


class ViewPagerAdapter(private val images: List<Int>) :
    RecyclerView.Adapter<ViewPagerAdapter.ViewPagerViewHolder>() {

    inner class ViewPagerViewHolder(itemView: ViewPagerBinding) : RecyclerView.ViewHolder(itemView.root) {
        var image: ImageView? = null
        var text: TextView? = null

        init {
            text = itemView.viewPagerTextView
            image = itemView.viewPagerImageView
            image?.setOnClickListener {
                Toast.makeText(it.context,"Картинка ${adapterPosition+1}",Toast.LENGTH_SHORT).show()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPagerViewHolder {
        val view = ViewPagerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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