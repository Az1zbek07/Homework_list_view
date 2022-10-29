package com.example.homeworklistview.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.homeworklistview.R

class ItemCityAdapter(
    context: Context,
    private val itemList: MutableList<ItemCity>
): BaseAdapter() {
    private val layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): ItemCity {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(pos: Int, p1: View?, viewGroup: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.item_city_layout, viewGroup, false)
        val title = view.findViewById<TextView>(R.id.textCityName)
        val link = view.findViewById<TextView>(R.id.textCityLink)
        val image = view.findViewById<ImageView>(R.id.imageCity)
        val item = getItem(pos)
        title.text = item.title
        link.text = item.link
        image.setImageResource(item.image)
        return view
    }
}