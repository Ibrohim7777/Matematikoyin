package com.example.matematikaoyin.BirinchiActivitiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.matematikaoyin.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}