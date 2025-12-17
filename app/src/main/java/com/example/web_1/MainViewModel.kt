package com.example.web_1

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class MainViewModel : ViewModel() {

    private val imageUrls = listOf(
        "https://image.fonwall.ru/o/vx/space-planet-beauty.jpg",
        "https://avatars.mds.yandex.net/i?id=a2a55b0f33135f2476b533bfa675e933_l-9289605-images-thumbs&n=13",
        "https://i.pinimg.com/originals/d9/eb/ac/d9ebac8a441988fe3a3e7219bd21559f.jpg",
        "https://avatars.mds.yandex.net/get-altay/14372341/2a000001965fdc2f343b430625ee80058e67/XXL_height",
        "https://avatars.mds.yandex.net/i?id=f405ff229f21b20212144ab6b43bc270_l-10906089-images-thumbs&n=13"
    )

    private val _items = MutableStateFlow<List<Item>>(emptyList())
    val items: StateFlow<List<Item>> = _items.asStateFlow()

    init {
        loadItems()
    }

    private fun loadItems() {
        _items.value = List(100) { index ->
            Item(
                imageUrl = imageUrls[index % imageUrls.size],
                title = "Элемент ${index + 1}"
            )
        }
    }
}