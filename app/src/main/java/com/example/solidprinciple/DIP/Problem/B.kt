package com.example.solidprinciple.DIP.Problem

import android.util.Log


open class B: A() {
    fun displayB(){
        Log.d("TAG", "displayB: "+"I am from class B")
    }
}