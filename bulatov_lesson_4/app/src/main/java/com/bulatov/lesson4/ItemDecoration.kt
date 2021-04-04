package com.bulatov.lesson4

import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ItemDecoration(private val offset : Int) : RecyclerView.ItemDecoration() {
    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
       val offsetDp = offset * Resources.getSystem().displayMetrics.density.toInt()
            outRect.top = offsetDp
            outRect.left = offsetDp
            outRect.right = offsetDp
    }
}