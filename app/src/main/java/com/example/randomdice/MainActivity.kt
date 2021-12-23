package com.example.randomdice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }
    fun initViews(){
        val imgDice1 = findViewById<ImageView>(R.id.img_dice1)
        val imgDice2 = findViewById<ImageView>(R.id.img_dice2)
        val btnRoll = findViewById<Button>(R.id.btn_roll)
        val txtView = findViewById<TextView>(R.id.txt_Ball)

        var counter1 = 0
        var counter2 = 0

        btnRoll.setOnClickListener {
            counter1 = Random.nextInt(1, 7)
            counter2 = Random.nextInt(1, 7)

            imgDice1.setImageResource(when(counter1){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.ic_launcher_foreground
            })

            imgDice2.setImageResource(when(counter2){
                1 -> R.drawable.dice1
                2 -> R.drawable.dice2
                3 -> R.drawable.dice3
                4 -> R.drawable.dice4
                5 -> R.drawable.dice5
                6 -> R.drawable.dice6
                else -> R.drawable.ic_launcher_foreground
            })

            txtView.text = (counter1 + counter2).toString()
        }
    }
}