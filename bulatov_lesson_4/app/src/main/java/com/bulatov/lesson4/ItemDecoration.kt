package com.bulatov.lesson4

import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemDecoration(private val offset : Int) : RecyclerView.ItemDecoration() {
    companion object {
        const val LAYOUT_POSITION_LONG = 5
    }
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
       val offsetDp = offset * Resources.getSystem().displayMetrics.density.toInt()
        val position = parent.getChildAdapterPosition(view)
        if (position> LAYOUT_POSITION_LONG){
            outRect.top = offsetDp
            outRect.left = offsetDp
            outRect.right = offsetDp }
        else {
            if (position % 2 !=0) {
                outRect.top = offsetDp
                outRect.left = offsetDp / 2
                outRect.right = offsetDp
            }
            else {
                outRect.top = offsetDp
                outRect.left = offsetDp
                outRect.right = offsetDp / 2
            }
        }
    }
}