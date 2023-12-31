package com.example.facebookapp_gr1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.facebookapp_gr1.databinding.ActivityMainBinding
import com.example.facebookapp_gr1.fragment.LoginFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, LoginFragment())
            commit()
        }
    }

}