package com.example.mealmonkeymobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportActionBar?.hide()

        val signUpText = findViewById<TextView>(R.id.sign_up_text)
        signUpText.setOnClickListener(){

            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }

    }
}