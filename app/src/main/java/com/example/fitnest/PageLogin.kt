package com.example.fitnest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class PageLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_page_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Forgot Password Navigation
        val forgotPasswordText = findViewById<TextView>(R.id.forgotPasswordText)
        forgotPasswordText.setOnClickListener {
            val intent = Intent(this,FrogetPassword::class.java)
            startActivity(intent)
        }

        // Login Button
        val loginButton = findViewById<Button>(R.id.loginButton)
        loginButton.setOnClickListener {
            intent = Intent(this, NavigationActivity::class.java)
            startActivity(intent)

        }

        // Google Login Button
        val googleLoginButton = findViewById<Button>(R.id.googleLoginButton)
        googleLoginButton.setOnClickListener {
            // Handle Google Sign-In logic
        }

        // Facebook Login Button
        val facebookLoginButton = findViewById<Button>(R.id.facebookLoginButton)
        facebookLoginButton.setOnClickListener {
            // Handle Facebook Sign-In logic
        }

        // Register Text Navigation
        val registerText = findViewById<TextView>(R.id.registerText)
        registerText.setOnClickListener {
            val intent = Intent(this,Register::class.java)
            startActivity(intent)
        }
    }
}