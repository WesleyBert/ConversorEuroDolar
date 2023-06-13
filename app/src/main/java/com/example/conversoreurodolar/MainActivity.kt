package com.example.conversoreurodolar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversoreurodolar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Conversor.setOnClickListener{
            val euros: Double = binding.editText.text.toString().toDouble()
            val dolares = String.format("%.2f",euros * 1.08).toDouble()

            binding.idResultado.text = dolares.toString().plus("$")
        }


    }
}