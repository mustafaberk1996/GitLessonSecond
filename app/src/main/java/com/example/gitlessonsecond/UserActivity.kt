package com.example.gitlessonsecond

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)



        findViewById<Button>(R.id.btnUser).setOnClickListener {
            // val intent = Intent(this, MainActivity::class.java)
            // startActivity(intent)
        }
    }
}