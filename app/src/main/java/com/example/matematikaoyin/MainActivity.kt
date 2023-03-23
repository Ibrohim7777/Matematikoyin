package com.example.matematikaoyin

import com.example.matematikaoyin.BirinchiActivitiy.LivelActivity
import com.example.matematikaoyin.BirinchiActivitiy.SecondActivity
import com.example.matematikaoyin.BirinchiActivitiy.ThirdActivity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.matematikaoyin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btndarajabir.setOnClickListener {
            startActivity(Intent(this, LivelActivity::class.java))
        }
        binding.btndarajaikki.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }
        binding.btndarajauch.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}