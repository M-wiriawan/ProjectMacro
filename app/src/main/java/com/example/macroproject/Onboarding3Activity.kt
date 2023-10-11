package com.example.macroproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Onboarding3Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val btnOnboarding2: Button = findViewById(R.id.myButton3)
        btnOnboarding2.setOnClickListener(this)

    }

    override fun onClick(Z: View) {
        when(Z.id) {
            R.id.myButton3 -> {
                val intent = Intent(this@Onboarding3Activity, Onboarding4Activity::class.java)
                startActivity(intent)
            }
        }
    }
}