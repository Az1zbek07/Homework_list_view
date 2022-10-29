package com.example.homeworklistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import com.example.homeworklistview.model.ItemCity
import com.example.homeworklistview.model.ItemCityAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private val itemCityAdapter by lazy { ItemCityAdapter(this, items()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)
        listView.adapter = itemCityAdapter
    }

    private fun items(): MutableList<ItemCity>{
        val list = mutableListOf<ItemCity>()
        list.add(ItemCity("London", "https://en.wikipedia.org/wiki/London", R.drawable.london_image))
        list.add(ItemCity("Rome", "https://en.wikipedia.org/wiki/Rome", R.drawable.rome_image))
        list.add(ItemCity("Paris", "https://en.wikipedia.org/wiki/Paris", R.drawable.paris_image))
        return list
    }
}