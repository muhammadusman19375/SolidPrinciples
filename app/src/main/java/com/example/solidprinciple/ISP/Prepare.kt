package com.example.solidprinciple.ISP

import android.util.Log

class Prepare: iManagable {
    override fun prepareSms() {
        Log.d("TAG", "prepareSms: "+"Sms is preparing")
    }

    override fun sendSms() {
        TODO("Not yet implemented")
    }
}