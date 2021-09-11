package com.example.myapplication

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        val flags = listOf(R.drawable.country0, R.drawable.country1, R.drawable.country2)

        val countryId = intent?.extras?.getString("id").toString()
        val countryPop = intent?.extras?.getInt("pop").toString()
        val countryArea = intent?.extras?.getInt("area").toString()
        val index = intent.extras?.getInt("index")
        val picture: ImageView = findViewById(R.id.imageView)
        val name:  TextView= findViewById(R.id.cntname)
        val pop:  TextView= findViewById(R.id.pop)
        val area:  TextView= findViewById(R.id.area)
        name.text = countryId
        pop.text = countryPop
        area.text = countryArea

        picture.setImageResource(flags[index!!])

    }
}