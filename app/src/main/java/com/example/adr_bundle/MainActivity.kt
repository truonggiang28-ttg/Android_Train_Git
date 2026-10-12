package com.example.adr_bundle

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.adr_bundle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGui.setOnClickListener {
            with(binding){
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                    .apply{
                        putExtra("key_Name",edtName.text.toString())
                        putExtra("key_Date",edtDate.text.toString())
                        putExtra("key_Number",edtNumber.text.toString())
                    }
            }
            startActivity(intent)
        }
    }
}