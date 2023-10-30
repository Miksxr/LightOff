package com.example.lightoff.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.lightoff.Profile
import com.example.lightoff.R
import com.example.lightoff.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater,container,false)

        binding.Prof.setOnClickListener {
            val profile = Profile()
            val transaction: FragmentTransaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.nav_host_fragment_activity_main,profile)
            transaction.commit()
        }
        return binding.root
    }
}