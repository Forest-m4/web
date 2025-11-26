package com.example.web_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemIds = listOf(
            R.id.item1,
            R.id.item2,
            R.id.item3,
            R.id.item4,
            R.id.item5
        )

        val names = listOf(
            "Название 1",
            "Название 2",
            "Название 3",
            "Название 4",
            "Название 5"
        )
        for (i in itemIds.indices) {
            val item = findViewById<LinearLayout>(itemIds[i])
            item.setOnClickListener {
                openDetail(names[i], R.drawable.pic1)
            }
        }
    }

    private fun openDetail(title: String, imageRes: Int) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("title", title)
        intent.putExtra("image", imageRes)
        startActivity(intent)
    }
}