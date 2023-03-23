package com.example.matematikaoyin.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import com.example.matematikaoyin.MainActivity
import com.example.matematikaoyin.R

class SplashscreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        object : CountDownTimer(4000, 2000) {
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
                startActivity(Intent(this@SplashscreenActivity, MainActivity::class.java))
                finish()
            }

        }
            .start()
    }


}