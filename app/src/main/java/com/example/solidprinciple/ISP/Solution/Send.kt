package com.example.solidprinciple.ISP.Solution

import android.util.Log

class Send: sendSms {
    override fun send() {
        Log.d("TAG", "send: "+"Sms is sending")
    }
}