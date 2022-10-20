package com.example.solidprinciple.SRP.Solution

import android.util.Log

class Divide {
    fun divide(value1: Int,value2: Int){
        var divide: Int = value1 / value2
        Log.d("TAG", "divide: "+divide)
    }
}