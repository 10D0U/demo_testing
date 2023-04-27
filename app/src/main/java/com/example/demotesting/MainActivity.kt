package com.example.demotesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        var recyclerView2 = findViewById<RecyclerView>(R.id.recyclerView2)

        var adapter = InfoAdapter(
            listOf(
                Info(
                    image = R.drawable.item_1,
                    name = "Cobra",
                    type = "Bar"
                ),
                Info(
                    image = R.drawable.item_2,
                    name = "Eska",
                    type = "Restaurant"
                ),
                Info(
                    image = R.drawable.item_3,
                    name = "Cafe Planda",
                    type = "Burger Joint"
                )
            )
        )

        var adapter2 = InfoAdapter(
            listOf(
                Info(
                    image = R.drawable.item_4,
                    name = "Long Island",
                    type = "Whisky Bar"
                ),
                Info(
                    image = R.drawable.item_5,
                    name = "Ichibana Sekiro",
                    type = "Sushi Bar"
                )
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView.adapter = adapter

        recyclerView2.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        recyclerView2.adapter = adapter2

    }
}