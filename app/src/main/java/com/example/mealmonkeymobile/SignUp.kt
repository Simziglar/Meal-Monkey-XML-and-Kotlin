package com.example.mealmonkeymobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        supportActionBar?.hide()
        val loginText = findViewById<TextView>(R.id.loginText)
        loginText.setOnClickListener(){

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
            finish()
        }
    }
}