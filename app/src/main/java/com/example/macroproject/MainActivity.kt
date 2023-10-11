package com.example.macroproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOnboarding2: Button = findViewById(R.id.myButton)
        btnOnboarding2.setOnClickListener(this)
    }

    override fun onClick(V: View) {
        when(V.id) {
            R.id.myButton -> {
                val intent = Intent(this@MainActivity, Onboarding2Activity::class.java)
                startActivity(intent)
            }
        }
    }
}