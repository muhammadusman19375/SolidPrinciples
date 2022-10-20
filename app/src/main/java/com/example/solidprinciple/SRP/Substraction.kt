package com.example.solidprinciple.SRP

import android.util.Log

class Substraction {
    fun substract(value1: Int,value2: Int){
        var substract: Int = value1 - value2
        Log.d("TAG", "add: "+substract)
    }
}