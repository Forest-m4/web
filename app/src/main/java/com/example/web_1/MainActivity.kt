package com.example.web_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val item1 = findViewById<LinearLayout>(R.id.item1)
        val item2 = findViewById<LinearLayout>(R.id.item2)
        val item3 = findViewById<LinearLayout>(R.id.item3)
        val item4 = findViewById<LinearLayout>(R.id.item4)
        val item5 = findViewById<LinearLayout>(R.id.item5)

        item1.setOnClickListener { openDetail() }
        item2.setOnClickListener { openDetail() }
        item3.setOnClickListener { openDetail() }
        item4.setOnClickListener { openDetail() }
        item5.setOnClickListener { openDetail() }
    }

    private fun openDetail() {
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}