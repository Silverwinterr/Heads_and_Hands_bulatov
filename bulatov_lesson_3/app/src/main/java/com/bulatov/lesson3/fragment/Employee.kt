package com.bulatov.lesson3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bulatov.lesson3.UserWork
import com.bulatov.lesson3.databinding.Profile1Binding

class Employee : Fragment() {
    private lateinit var profile1Set: Profile1Binding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        profile1Set = Profile1Binding.inflate(layoutInflater)
        val makeProfile1 =
                UserWork("Карточка 214329523","Специалист")
        profile1Set.profileUserWork1 = makeProfile1
        return profile1Set.root
    }
}