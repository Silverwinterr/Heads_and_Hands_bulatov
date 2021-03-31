package com.bulatov.lesson3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bulatov.lesson3.User
import com.bulatov.lesson3.databinding.PersonalDataBinding


class PersonalDataFirst : Fragment() {
    private lateinit var personal: PersonalDataBinding

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        personal = PersonalDataBinding.inflate(layoutInflater)
        val makeData =
                User("Анастасия", "Антонина", "anykey@gmal.com", "AWDKJAJWK", "Санкт-Петербург")
        personal.personalDataPenEdit.setOnClickListener {
            Toast.makeText(requireContext(),"Edit Text", Toast.LENGTH_SHORT).show()
        }
        personal.doorExit.setOnClickListener {
            Toast.makeText(requireContext(),"Exit", Toast.LENGTH_SHORT).show()
        }
        personal.textExit.setOnClickListener {
            Toast.makeText(requireContext(),"Exit", Toast.LENGTH_SHORT).show()
        }
        personal.personalData = makeData
        return personal.root
    }
}