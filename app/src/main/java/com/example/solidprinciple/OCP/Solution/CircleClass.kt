package com.example.solidprinciple.OCP.Solution

import android.util.Log

class CircleClass: Shape {
    override fun area() {
        var pi: Double = 3.14
        var r: Int = 2
        var area = pi*r*r
        Log.d("TAG", "circleArea: "+area)
    }
}