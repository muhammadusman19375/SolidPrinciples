package com.example.solidprinciple.LSP

import android.util.Log

class Admin: iCreate{
    //    override fun createAccount() {
//        Log.d("TAG", "createAccount: "+"admin account is creating")
//    }
//
//    override fun deleteAccount() {
//        throw RuntimeException("admin account cannot be deleted")
//    }
    override fun create() {
        Log.d("TAG", "create: "+"admin account is creating")
    }
}