package com.bulatov.bulatov_lesson_6.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bulatov.bulatov_lesson_6.databinding.FragmentFirstBinding
import com.bulatov.bulatov_lesson_6.databinding.FragmentSecondBinding

class ItemSecond : Fragment(){

    private lateinit var itemSecond : FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        itemSecond = FragmentSecondBinding.inflate(layoutInflater)
        return itemSecond.root
    }
}
