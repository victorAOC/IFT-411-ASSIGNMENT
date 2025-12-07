package com.example.barkaassignment

import -android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvCreateAccount = findViewById<TextView>(R.id.tvCreateAccount)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        tvCreateAccount.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnLogin.setOnClickListener {
            // In a real app, you would authenticate the user here.
            // For this demo, we just go to the Home screen.
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish() // Finish LoginActivity so user can't go back to it
        }
    }
}