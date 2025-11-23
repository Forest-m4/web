package com.example.web_1

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val toolbar = findViewById<Toolbar>(R.id.toolbar_detail)
        toolbar.title = "Назад"
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        toolbar.setNavigationOnClickListener { finish() }

        val imageView = findViewById<ImageView>(R.id.detail_image)
        val titleView = findViewById<TextView>(R.id.detail_title)

        val title = intent.getStringExtra("title")
        val imageRes = intent.getIntExtra("image", R.drawable.pic1)

        titleView.text = title
        imageView.setImageResource(imageRes)
    }
}