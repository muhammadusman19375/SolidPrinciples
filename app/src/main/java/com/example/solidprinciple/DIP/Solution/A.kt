package com.example.solidprinciple.DIP.Solution

import android.util.Log

class A: Binterface {
    override fun display() {
        Log.d("TAG","I am from class A")
    }
}