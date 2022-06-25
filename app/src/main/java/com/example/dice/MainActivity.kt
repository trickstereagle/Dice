package com.example.dice
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            val resultImage1:ImageView=findViewById(R.id.roll_result1)
            rollDice(resultImage1)
            val resultImage2:ImageView=findViewById(R.id.roll_result2)
            rollDice(resultImage2)
        }
    }

    private fun rollDice(resultImage:ImageView) {
        val myResult = Dice().roll()
        val resourceID = when(myResult){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        resultImage.setImageResource(resourceID)
        resultImage.contentDescription=myResult.toString()
    }
}