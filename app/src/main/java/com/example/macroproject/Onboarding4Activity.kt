package com.example.macroproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Onboarding4Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding4)

        val btnOnboarding2: Button = findViewById(R.id.myButton4)
        btnOnboarding2.setOnClickListener(this)

    }

    override fun onClick(L: View) {
        when(L.id) {
            R.id.myButton4 -> {
                val intent = Intent(this@Onboarding4Activity, Onboarding5Activity::class.java)
                startActivity(intent)
            }
        }
    }
}