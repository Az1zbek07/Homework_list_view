package com.example.homeworklistview.model

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.homeworklistview.R

class ItemFoodAdapter(context: Context, private val itemList: MutableList<ItemFood>): BaseAdapter() {
    private val layoutInflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getCount(): Int {
        return itemList.size
    }

    override fun getItem(position: Int): ItemFood {
        return itemList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view = layoutInflater.inflate(R.layout.item_food_layout, parent, false)
        val title = view.findViewById<TextView>(R.id.textFoodTitle)
        val cost = view.findViewById<TextView>(R.id.textFoodCost)
        val type = view.findViewById<TextView>(R.id.textFoodType)
        val image = view.findViewById<ImageView>(R.id.image_food)
        val item = getItem(position)
        title.text = item.title
        cost.text = item.cost.toString()
        type.text = item.type
        image.setImageResource(item.image)
        return view
    }
}