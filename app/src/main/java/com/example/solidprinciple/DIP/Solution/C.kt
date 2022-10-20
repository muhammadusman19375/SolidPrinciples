package com.example.solidprinciple.DIP.Solution

import android.util.Log

class C: Cinterface {
    override fun display() {
        Log.d("TAG", "I am from class C")
    }
}