package com.bulatov.bulatov_lesson_6.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bulatov.bulatov_lesson_6.R
import com.bulatov.bulatov_lesson_6.databinding.FragmentThirdBinding

class ItemThird : Fragment() {


    private lateinit var itemThird: FragmentThirdBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        itemThird = FragmentThirdBinding.inflate(layoutInflater)
        val images = listOf(
            R.drawable.img_1,
            R.drawable.img_2,
            R.drawable.img_3
        )
        val adapter = ViewPagerAdapter(images)
        val buttonPager = itemThird.fragmentThirdButton
        val viewPager = itemThird.fragmentThirdViewPager
        val dotsIndicator = itemThird.dotsIndicator

        itemThird.fragmentThirdViewPager.adapter = adapter
        itemThird.dotsIndicator.setViewPager2(viewPager)
        buttonPager.setOnClickListener {
            when (viewPager.visibility) {
                View.VISIBLE -> {
                    viewPager.visibility = View.GONE
                    dotsIndicator.visibility = View.GONE
                    buttonPager.text = getString(R.string.buttonPager_text_setVisible)
                }
                View.GONE -> {
                    viewPager.visibility = View.VISIBLE
                    dotsIndicator.visibility = View.VISIBLE
                    buttonPager.text = getString(R.string.buttonPager_text_setGone)
                }
            }
        }
        return itemThird.root
    }
}