package com.example.huihui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button =  findViewById<Button>(R.id.button)
        button.setOnClickListener() {
            val Intent = Intent(this, MainActivity2 :: class.java)
            startActivity(Intent)
            Toast.makeText(this, "Eww kartik", Toast.LENGTH_SHORT).show()


        }
    }
}