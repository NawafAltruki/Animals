package com.example.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.animals.adapter.AnimalAdapter
import com.example.animals.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataset = Datasource().loadAnimals()

        val recyclerView = findViewById<RecyclerView>(R.id.rv_animals)

        val adapter = AnimalAdapter(this,dataset)

        recyclerView.adapter = adapter

        recyclerView.setHasFixedSize(true)
    }
}