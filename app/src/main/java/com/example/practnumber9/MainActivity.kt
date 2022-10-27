package com.example.practnumber9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.core.graphics.toColor

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Изменение текста
        val text: TextView = findViewById(R.id.textViewCopyright)
        text.setText("Copyright (C) 2021")
        text.setTextColor(getColor(R.color.emiralde_color))
    }
}