package com.example.barkaassignment

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val tvLoginLink = findViewById<TextView>(R.id.tvLoginLink)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        tvLoginLink.setOnClickListener {
            finish() // Go back to Login
        }

        btnRegister.setOnClickListener {
            // In a real app, you would register the user here.
            // For this demo, we just go to the Home screen.
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finishAffinity() // Clear back stack so user can't go back to login/register
        }
    }
}