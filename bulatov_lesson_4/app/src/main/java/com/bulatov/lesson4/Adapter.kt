package com.bulatov.lesson4

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private val values : List<DataInfoItem.DetailInfoItem>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    companion object{
        const val LAYOUT_SHORT = 0
        const val LAYOUT_LONG = 1
    }

    override fun getItemViewType(position: Int): Int {
        return if(position>5)
            LAYOUT_LONG
        else
            LAYOUT_SHORT
    }
    override fun getItemCount() : Int = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View? = null
        var viewHolder: RecyclerView.ViewHolder? = null

        if (viewType == LAYOUT_SHORT) {
            view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_short, parent, false)
            viewHolder = ViewHolderShort(view)
        } else {
            view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_long, parent, false)
           viewHolder = ViewHolderLong(view)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder?.itemViewType == LAYOUT_SHORT) {
            val vaultItemHolder = holder as ViewHolderShort
            vaultItemHolder.textTitle?.text = values[position].title
            vaultItemHolder.backgroundImageView?.setBackgroundResource(values[position].imageCard)
            vaultItemHolder.contentText?.text = values[position].content
        } else {
            val vaultItemHolder = holder as ViewHolderLong
            vaultItemHolder.textTitle?.text = values[position].title
            vaultItemHolder.backgroundImageView?.setBackgroundResource(values[position].imageCard)
            vaultItemHolder.contentText?.text = values[position].content
//            holder.textTitle?.text = values[position].title
//            holder.backgroundImageView?.setBackgroundResource(values[position].imageCard)
//            holder.contentText?.text = values[position].content
        }
    }
    class ViewHolderShort (view: View?) : RecyclerView.ViewHolder(view!!){
        var backgroundImageView : ImageView? = null
        var textTitle : TextView? = null
        var contentText : TextView? = null
        init {
            backgroundImageView = view?.findViewById(R.id.card_image)
            textTitle = view?.findViewById(R.id.card_title)
            contentText = view?.findViewById(R.id.card_content)
        }
    }
    class ViewHolderLong (view: View?) : RecyclerView.ViewHolder(view!!){
        var backgroundImageView : ImageView? = null
        var textTitle : TextView? = null
        var contentText : TextView? = null
        init {
            backgroundImageView = itemView?.findViewById(R.id.card_imageLong)
            textTitle = itemView?.findViewById(R.id.card_titleLong)
            contentText = itemView?.findViewById(R.id.card_contentLong)
        }
    }
}