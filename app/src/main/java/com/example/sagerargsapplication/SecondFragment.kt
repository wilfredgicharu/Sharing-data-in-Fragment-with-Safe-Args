package com.example.sagerargsapplication

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sagerargsapplication.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {
private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        val bundle = arguments

        if (bundle == null){
            Log.e("SecondFragment", "bundle is not null")
        }
        val args = SecondFragmentArgs.fromBundle(bundle!!)
        binding.username.text= args.username
        binding.email.text= args.email


        return binding.root
    }


}