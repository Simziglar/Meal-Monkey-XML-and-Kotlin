package com.example.mealmonkeymobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val loginButton = findViewById<Button>(R.id.ma_login_btn)
        val createAccButton = findViewById<Button>(R.id.ma_create_acc_btn)

        loginButton.setOnClickListener (){

            val intent =  Intent(this@MainActivity,Login::class.java)
            startActivity(intent)
            finish()
        }

        createAccButton.setOnClickListener(){
            val intent = Intent(this,SignUp::class.java)
            startActivity(intent)
            finish()
        }

    }
}