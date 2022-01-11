package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() } // added an event listener which executes a function when the button is clicked
        rollDice()
    }

    // create a class name Dice
    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random() // return statement to generate random number
        }
    }

    private fun rollDice() {
        val diceImage: ImageView = findViewById(R.id.imageView) // find image view by ID and store it in dice image
        val drawableResource = when (Dice(6).roll()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        // set image resource according to the random number generated
        diceImage.setImageResource(drawableResource)
        diceImage.contentDescription = (Dice(6).roll()).toString()
    }
}
