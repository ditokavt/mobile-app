package com.example.myapplication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.myapplication.R
import com.example.myapplication.databinding.fragment_main  // Correct ViewBinding for this fragment

class main : Fragment(R.layout.fragment_main) {

    private lateinit var binding: fragment_main  // ViewBinding instance for fragment
    private lateinit var nameEditText: EditText
    private lateinit var nameTextView: TextView
    private lateinit var okButton: Button
    private lateinit var nextButton: Button

    // Inflate the fragment layout and initialize ViewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using ViewBinding and return the root view
        binding = fragment_main.inflate(inflater, container, false)
        return binding.root
    }

    // Set up listeners after the view has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views using ViewBinding
        nameEditText = binding.nameEditText
        nameTextView = binding.nameTextView
        okButton = binding.okButton
        nextButton = binding.nextButton

        // Set up OK button to display input in TextView
        okButton.setOnClickListener {
            val name = nameEditText.text.toString()
            nameTextView.text = name
        }

        // Set up Next button to navigate to another fragment (or activity if needed)
        nextButton.setOnClickListener {
            // Example: Use navigation to go to another fragment
            Navigation.findNavController(it)
                .navigate(fragment_click.actionMainFragmentToSecondFragment())
        }
    }
}
