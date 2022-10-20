package com.example.solidprinciple.ISP.Solution

import android.util.Log

class Prepare:prepareSms {
    override fun prepare() {
        Log.d("TAG", "prepare: "+"Sms is preparing")
    }
}