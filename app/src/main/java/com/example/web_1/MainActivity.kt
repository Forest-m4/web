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

        item1.setOnClickListener { openDetail("Название 1", R.drawable.pic1) }
        item2.setOnClickListener { openDetail("Название 2", R.drawable.pic1) }
        item3.setOnClickListener { openDetail("Название 3", R.drawable.pic1) }
        item4.setOnClickListener { openDetail("Название 4", R.drawable.pic1) }
        item5.setOnClickListener { openDetail("Название 5", R.drawable.pic1) }
    }

    private fun openDetail(title: String, imageRes: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("image", imageRes)
        startActivity(intent)
    }
}