package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView = findViewById<TextView>(R.id.display) // Display Dhorlam
        var button = findViewById<Button>(R.id.button) // Button Dhorlam


        button.setOnClickListener {
            val randomInt = (1..6).random()
            textView.text = randomInt.toString()
    }





    }

}