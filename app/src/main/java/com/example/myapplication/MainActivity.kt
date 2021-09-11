package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val China = Country("China", 9388211, 153, 1439323776)
        val India = Country("India", 2973190, 464, 1380004385)
        val UnitedStates = Country("United States", 9147420, 36,331002651)
        val CountryList = listOf( China, India, UnitedStates
        )
        val adapter = CountryAdapter(CountryList)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = adapter


        // Sets the LinearLayoutManager of the recyclerview
        recyclerView.layoutManager = LinearLayoutManager(this)








    }
}
