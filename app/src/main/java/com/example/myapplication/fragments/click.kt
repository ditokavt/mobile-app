package com.example.myapplication.fragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.databinding.FragmentClickBinding

class ClickActivity : AppCompatActivity() {

    private lateinit var binding: FragmentClickBinding
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentClickBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.numberTextView.text = count.toString()

        binding.clickButton.setOnClickListener {
            count++
            binding.numberTextView.text = count.toString()
        }
    }
}
