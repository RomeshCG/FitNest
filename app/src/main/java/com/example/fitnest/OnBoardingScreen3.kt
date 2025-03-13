package com.example.fitnest

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OnBoardingScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_on_boarding_screen3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val nextbtn3 = findViewById<Button>(R.id.nextbtn3)
        nextbtn3.setOnClickListener{
            val intent = Intent(this,PageLogin::class.java)
            startActivity(intent)
        }
        val skipbtn = findViewById<Button>(R.id.skipbtn)
        skipbtn.setOnClickListener{
            intent = Intent(this,PageLogin::class.java)
            startActivity(intent)
        }

    }
}