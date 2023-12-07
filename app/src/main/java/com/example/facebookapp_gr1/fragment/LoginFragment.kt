package com.example.facebookapp_gr1.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.FragmentContainer
import com.example.facebookapp_gr1.R
import com.example.facebookapp_gr1.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnlogin.setOnClickListener {
           val username = binding.etUsername.text.toString()
           val password = binding.etPassword.text.toString()

           if (username == "Erblin" && password == "Zulfaj"){
               parentFragmentManager.beginTransaction().apply {
                   replace(R.id.fragmentContainer, HomeFragment())
                   commit()
               }
           }else{
               Toast.makeText(requireContext(), "invalid credentials!", Toast.LENGTH_SHORT).show()
           }
        }
    }


}






