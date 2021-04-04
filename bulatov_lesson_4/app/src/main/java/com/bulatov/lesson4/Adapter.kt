package com.bulatov.lesson4

import android.content.res.Resources
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class Adapter(private val values: List<BaseInfoItem>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    companion object {
        const val LAYOUT_SHORT = 0
        const val LAYOUT_LONG = 1
        const val MARGIN_TOP = 22
        const val POSITION_LONG_MARGIN = 6
        const val POSITION_LONG = 5
        const val POSITION_FIRST = 0
        const val POSITION_SECOND = 1

    }

    override fun getItemViewType(position: Int): Int {
        return if (position > POSITION_LONG)
            LAYOUT_LONG
        else
            LAYOUT_SHORT
    }


    private fun setContentShort(holder: RecyclerView.ViewHolder, position: Int) {
        val vaultItemHolder = holder as ViewHolderShort
        if (position == POSITION_FIRST || position == POSITION_SECOND) vaultItemHolder.contentText?.setTextColor(
            ContextCompat.getColor(
                vaultItemHolder.contentText!!.context, R.color.card_contentRed
            )
        )
        vaultItemHolder.textTitle?.text = values[position].title
        vaultItemHolder.backgroundImageView?.setBackgroundResource(values[position].imageCard)
        vaultItemHolder.contentText?.text = values[position].content
        vaultItemHolder.parent?.setOnClickListener {
            Snackbar.make(
                it, "${vaultItemHolder.textTitle!!.text}",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }

    private fun setContentLong(holder: RecyclerView.ViewHolder, position: Int) {
        val vaultItemHolder = holder as ViewHolderLong
        val params = (vaultItemHolder.textTitle?.layoutParams as ViewGroup.MarginLayoutParams)
        if (position > POSITION_LONG_MARGIN) params.topMargin =
            (MARGIN_TOP * Resources.getSystem().displayMetrics.density).toInt()
        vaultItemHolder.textTitle?.text = values[position].title
        vaultItemHolder.backgroundImageView?.setBackgroundResource(values[position].imageCard)
        vaultItemHolder.contentText?.text = values[position].content
        vaultItemHolder.parent?.setOnClickListener {
            Snackbar.make(
                it, "${vaultItemHolder.textTitle!!.text}",
                Snackbar.LENGTH_LONG
            ).show()
        }
    }

    override fun getItemCount(): Int = values.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View?
        var viewHolder: RecyclerView.ViewHolder?

        if (viewType == LAYOUT_SHORT) {
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.list_item_short, parent, false)
            viewHolder = ViewHolderShort(view)
        } else {
            view =
                LayoutInflater.from(parent.context).inflate(R.layout.list_item_long, parent, false)
            viewHolder = ViewHolderLong(view)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder.itemViewType == LAYOUT_SHORT) {
            setContentShort(holder, position)
        } else {
            setContentLong(holder, position)
        }
    }


    class ViewHolderShort(view: View?) : RecyclerView.ViewHolder(view!!) {
        var backgroundImageView: ImageView? = null
        var textTitle: TextView? = null
        var contentText: TextView? = null
        var parent: ConstraintLayout? = null

        init {
            parent = view?.findViewById(R.id.card_parent)
            backgroundImageView = view?.findViewById(R.id.card_image)
            textTitle = view?.findViewById(R.id.card_title)
            contentText = view?.findViewById(R.id.card_content)
        }
    }


    class ViewHolderLong(view: View?) : RecyclerView.ViewHolder(view!!) {
        var backgroundImageView: ImageView? = null
        var textTitle: TextView? = null
        var contentText: TextView? = null
        var parent: ConstraintLayout? = null

        init {
            parent = view?.findViewById(R.id.card_parent)
            backgroundImageView = view?.findViewById(R.id.card_imageLong)
            textTitle = view?.findViewById(R.id.card_titleLong)
            contentText = view?.findViewById(R.id.card_contentLong)

        }
    }
}