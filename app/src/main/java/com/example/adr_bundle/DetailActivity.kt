package com.example.adr_bundle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.adr_bundle.databinding.ActivityDetailBinding

class DetailActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras

        intent.extras?.let { bundle ->
            with(binding){
                val ht = bundle.getString("key_Name")
                val ngsinh = bundle.getString("key_Date")
                val sdt = bundle.getString("key_Number")

                tvName.text = "${ht}"
                tvDate.text = "${ngsinh}"
                tvNumber.text = "${sdt}"
            }
        }

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}