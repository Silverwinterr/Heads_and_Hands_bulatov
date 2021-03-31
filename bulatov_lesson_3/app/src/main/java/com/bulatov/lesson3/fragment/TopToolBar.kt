package com.bulatov.lesson3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bulatov.lesson3.databinding.TopToolbar1Binding

class TopToolBar : Fragment() {
    private lateinit var topToolBar: TopToolbar1Binding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        topToolBar = TopToolbar1Binding.inflate(layoutInflater)
        topToolBar.secondBackButton.setOnClickListener {
            Toast.makeText(requireContext(),"Exit", Toast.LENGTH_SHORT).show()
        }
        topToolBar.toolbarEditPen.setOnClickListener {
            Toast.makeText(requireContext(),"Edit Text", Toast.LENGTH_SHORT).show()
        }
        return topToolBar.root
    }
}