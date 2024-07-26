package com.example.olxkotlinn

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import com.example.olxkotlinn.databinding.ActivityLoginOptionsBinding


class LoginOptionsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginOptionsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginOptionsBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.closeBtn.setOnClickListener{
            onBackPressed()
        }


        }
    }
