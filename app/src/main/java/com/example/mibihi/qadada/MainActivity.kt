package com.example.mibihi.qadada

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    val foodlist = arrayListOf("italian","Thai","Sambusa","Hilib ari","Waslad Bariis","Pizza")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDecide.setOnClickListener {
            val random = Random()
            val randomfood = random.nextInt(foodlist.count())
            txtSelectedFood.text = foodlist[randomfood]
        }
        btnAddfood.setOnClickListener {
            val addedfood = etxtAddFood.text.toString()
            foodlist.add(addedfood)
            etxtAddFood.text.clear()


        }

    }
}
