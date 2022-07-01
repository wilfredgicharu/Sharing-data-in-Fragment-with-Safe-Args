package com.example.sagerargsapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sagerargsapplication.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)


        return binding.apply {
            binding.shareButton.setOnClickListener {


                val username = getUsername()
                val userEmail = getUserEmail()

                val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(username, userEmail)
                findNavController().navigate(action)
            }
        }?.root
    }

    private fun getUsername(): String {
        return binding.usernameEditText.text.toString()
    }
    private fun getUserEmail(): String {
        return binding.userEmailEditText.text.toString()
    }


}