package com.bulatov.lesson3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bulatov.lesson3.UserWork
import com.bulatov.lesson3.databinding.ProfileBinding

class EmployeeFirst : Fragment() {
    private lateinit var profileSet: ProfileBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        profileSet = ProfileBinding.inflate(layoutInflater)
        val makeProfile =
                UserWork("Карточка 214329523","Специалист")
        profileSet.profileUserWork = makeProfile
        return profileSet.root
    }
}