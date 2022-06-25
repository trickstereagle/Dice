package com.example.dice

class Dice {
    val sides=6
    fun roll():Int{
        return (1..6).random()
    }
}