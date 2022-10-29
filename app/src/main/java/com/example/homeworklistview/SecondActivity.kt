package com.example.homeworklistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import com.example.homeworklistview.model.ItemFood
import com.example.homeworklistview.model.ItemFoodAdapter

class SecondActivity : AppCompatActivity() {
    private lateinit var listViewFood: ListView
    private val itemFoodAdapter by lazy { ItemFoodAdapter(this, items()) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        listViewFood = findViewById(R.id.listViewFood)
        listViewFood.adapter = itemFoodAdapter
    }

    private fun items(): MutableList<ItemFood>{
        val list = mutableListOf<ItemFood>()
        list.add(ItemFood("Pizza", "Spice Chicken Pizza", 310.00, R.drawable.pizza_image))
        list.add(ItemFood("Burger", "Beef Burger", 350.00, R.drawable.bigburger_image))
        list.add(ItemFood("Pizza", "Chicken Pizza", 250.00, R.drawable.chicken_pizza_image))
        list.add(ItemFood("Burger", "Chicken Burger", 350.00, R.drawable.chicken_burger_image))
        list.add(ItemFood("Burger", "Fish Burger", 310.00, R.drawable.fish_burger_image))
        list.add(ItemFood("Mange", "Mange Juice", 250.00, R.drawable.mange_image))
        list.add(ItemFood("Palov", "Tearoom Palov", 550.00, R.drawable.palov_image))
        return list
    }
}