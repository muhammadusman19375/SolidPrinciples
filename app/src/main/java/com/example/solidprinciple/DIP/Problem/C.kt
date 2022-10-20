package com.example.solidprinciple.DIP.Problem

import android.util.Log

class C: B() {
    fun displayC(){
        Log.d("TAG", "displayC: "+"I am from class C")
    }
}