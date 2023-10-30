package com.example.lightoff

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentTransaction
import com.example.lightoff.databinding.FragmentHomeBinding
import com.example.lightoff.databinding.FragmentProfileBinding
import com.example.lightoff.ui.home.HomeFragment

class Profile : Fragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentProfileBinding.inflate(inflater,container,false)

        binding.arrow.setOnClickListener {
            val homeBinding = HomeFragment()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_host_fragment_activity_main,homeBinding)
            transaction.commit()
        }
        return binding.root
    }
}