package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOne.setOnClickListener{
            rollDice()
        }

    }
    private fun rollDice(){
        val dice =Dice (numSides=6)

        val dR = when (dice.diceRoll())
        {
            1->R.drawable.dice1
            2->R.drawable.dice2
            3->R.drawable.dice3
            4->R.drawable.dice4
            5->R.drawable.dice5
            else->R.drawable.dice_six
        }
        binding.imageView.setImageResource(dR)
    }
}
class Dice(private val numSides : Int){
    fun diceRoll():Int
    {
        return(1..numSides).random()
    }
}


