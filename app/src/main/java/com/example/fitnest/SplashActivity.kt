package com.example.fitnest

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = SplashScreen.installSplashScreen(this) // Default splash screen
        super.onCreate(savedInstanceState)

        // Redirect to onboarding screen
        startActivity(Intent(this, OnBoarding::class.java))
        finish() // Close splash screen activity
    }
}
