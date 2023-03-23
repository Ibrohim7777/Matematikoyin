package com.example.matematikaoyin.BirinchiActivitiy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.matematikaoyin.databinding.ActivityMainBinding
import com.example.matematikaoyin.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}