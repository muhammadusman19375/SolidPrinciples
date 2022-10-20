package com.example.solidprinciple.DIP.Solution

import android.util.Log

class B: Binterface {
    override fun display() {
        Log.d("TAG","I am from class B")
    }
}