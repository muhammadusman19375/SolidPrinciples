package com.example.solidprinciple.OCP

import android.util.Log

class RectangleClass: Shape {
    override fun area() {
        var pi: Double = 3.14
        var r: Int = 2
        var area = pi*r*r*r
        Log.d("TAG", "rectangleArea: "+area)
    }
}