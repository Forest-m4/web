package com.example.web_1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

class MainActivity : ComponentActivity() {

    data class Item(
        val imageUrl: String,
        val title: String
    )

    private val imageUrls = listOf(
        "https://image.fonwall.ru/o/vx/space-planet-beauty.jpg",
        "https://avatars.mds.yandex.net/i?id=a2a55b0f33135f2476b533bfa675e933_l-9289605-images-thumbs&n=13",
        "https://i.pinimg.com/originals/d9/eb/ac/d9ebac8a441988fe3a3e7219bd21559f.jpg",
        "https://avatars.mds.yandex.net/get-altay/14372341/2a000001965fdc2f343b430625ee80058e67/XXL_height",
        "https://avatars.mds.yandex.net/i?id=f405ff229f21b20212144ab6b43bc270_l-10906089-images-thumbs&n=13",
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                MainScreen()
            }
        }
    }

    @Composable
    fun MainScreen() {
        // Создаем список из объектов Item
        val itemsList = List(100) { index ->
            Item(
                imageUrl = imageUrls.random(),
                title = "Элемент ${index + 1}"
            )
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            contentPadding = PaddingValues(16.dp)
        ) {
            items(itemsList) { item ->
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {
                            startActivity(
                                Intent(this@MainActivity, DetailActivity::class.java)
                                    .putExtra("title", item.title)
                                    .putExtra("imageUrl", item.imageUrl)
                            )
                        }
                        .padding(8.dp)
                ) {
                    AsyncImage(
                        model = item.imageUrl,
                        contentDescription = null,
                        modifier = Modifier.size(64.dp)
                    )
                    Spacer(Modifier.width(16.dp))
                    Text(item.title)
                }
            }
        }
    }
}