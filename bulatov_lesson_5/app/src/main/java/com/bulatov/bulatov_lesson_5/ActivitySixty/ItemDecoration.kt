package com.bulatov.bulatov_lesson_5.ActivitySixty


import android.content.res.Resources
import android.graphics.Rect
import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ItemDecoration(private val offset: Int) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(
        outRect: Rect,
        view: View,
        parent: RecyclerView,
        state: RecyclerView.State
    ) {
        val offsetDp = offset * Resources.getSystem().displayMetrics.density.toInt()
        outRect.left = offsetDp
        outRect.right = offsetDp
        outRect.top = offsetDp
    }
}