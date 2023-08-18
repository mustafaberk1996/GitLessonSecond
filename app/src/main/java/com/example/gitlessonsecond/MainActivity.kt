package com.example.gitlessonsecond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnShowDialog).setOnClickListener {
            AlertDialog.Builder(this).setTitle("Info").setMessage("Hosgeldiniz").create().show()
        }
    }
}