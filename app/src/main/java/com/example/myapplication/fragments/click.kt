package com.example.myapplication.fragments

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class click : AppCompatActivity() {

    private lateinit var clickButton: Button
    private lateinit var numberTextView: TextView
    private var count: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_click)

        clickButton = findViewById(R.id.clickButton)
        numberTextView = findViewById(R.id.numberTextView)

        numberTextView.text = count.toString()

        clickButton.setOnClickListener {
            count++
            numberTextView.text = count.toString()
        }
    }
}