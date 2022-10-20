package com.example.solidprinciple.SRP

import android.util.Log

class Calculator {

    fun add(value1: Int, value2: Int) {
        var sum: Int = value1 + value2
        Log.d("TAG", "add: "+sum)
    }
    fun substract(value1: Int, value2: Int) {
        var sum: Int = value1 - value2
        Log.d("TAG", "substract: "+sum)
    }
    fun divide(value1: Int, value2: Int) {
        var sum: Int = value1 / value2
        Log.d("TAG", "divide: "+sum)
    }
    fun multiply(value1: Int, value2: Int) {
        var sum: Int = value1 * value2
        Log.d("TAG", "multiply: "+sum)
    }

}