package com.bulatov.lesson3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bulatov.lesson3.User
import com.bulatov.lesson3.databinding.PersonalData1Binding


class PersonalData : Fragment() {
    private lateinit var personal1: PersonalData1Binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        personal1 = PersonalData1Binding.inflate(layoutInflater)
        val makeData =
                User("Анастасия", "Антонина", "anykey@gmal.com", "AWDKJAJWK", "Санкт-Петербург")
        personal1.personal1Data = makeData
        personal1.personal1DataPenEdit.setOnClickListener {
            Toast.makeText(requireContext(),"Edit Text",Toast.LENGTH_SHORT).show()
        }
        personal1.layoutExit.setOnClickListener {
            Toast.makeText(requireContext(),"Exit",Toast.LENGTH_SHORT).show()
        }
        return personal1.root
    }
}