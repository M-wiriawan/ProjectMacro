package com.example.macroproject

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Onboarding2Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val btnOnboarding2: Button = findViewById(R.id.myButton2)
        btnOnboarding2.setOnClickListener(this)

    }

    override fun onClick(Y: View) {
        when(Y.id) {
            R.id.myButton2 -> {
                val intent = Intent(this@Onboarding2Activity, Onboarding3Activity::class.java)
                startActivity(intent)
            }
        }
    }
}