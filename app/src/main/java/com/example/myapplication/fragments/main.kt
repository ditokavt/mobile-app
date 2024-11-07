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
import com.example.myapplication.databinding.FragmentMainBinding  // Correct ViewBinding for this fragment

class MainFragment : Fragment(R.layout.fragment_main) {

    private lateinit var binding: FragmentMainBinding  // ViewBinding instance for fragment
    private var count: Int = 0

    // Inflate the fragment layout and initialize ViewBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout using ViewBinding and return the root view
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    // Set up listeners after the view has been created
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize views using ViewBinding
        val nameEditText = binding.editText
        val nameTextView = binding.textView1
        val okButton = binding.Btt2
        val nextButton = binding.Btt1

        // Set up OK button to display input in TextView
        okButton.setOnClickListener {
            val name = nameEditText.text.toString()
            nameTextView.text = "Your name is: $name"
        }


        nextButton.setOnClickListener {
            val number = nameEditText.text.toString()
            val action = mainFragment.actionMainFragmentToSecondFragment(number)
            Navigation.findNavController(it).navigate(action)

        }
    }
}
