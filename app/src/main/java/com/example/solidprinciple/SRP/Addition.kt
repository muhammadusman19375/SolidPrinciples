package com.example.solidprinciple.SRP

import android.util.Log

class Addition {
    fun add(value1: Int, value2: Int) {
        var sum: Int = value1 + value2
        Log.d("TAG", "add: "+sum)
    }
}