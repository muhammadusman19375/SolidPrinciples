package com.example.solidprinciple.DIP.Problem

import android.util.Log


open class A {
    fun displayA(){
        Log.d("TAG", "displayA: "+"I am from class A")
    }
}