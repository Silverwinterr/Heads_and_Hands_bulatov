package com.bulatov.bulatov_lesson_6.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bulatov.bulatov_lesson_6.databinding.FragmentFirstBinding

class ItemFirst : Fragment() {
    private lateinit var itemFirst : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        itemFirst = FragmentFirstBinding.inflate(layoutInflater)
        return itemFirst.root
    }
}