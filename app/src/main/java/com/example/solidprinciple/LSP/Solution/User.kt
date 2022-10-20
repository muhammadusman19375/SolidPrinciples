package com.example.solidprinciple.LSP.Solution

import android.util.Log

class User: iCreate, iDelete {

    //    override fun createAccount() {
//        Log.d("TAG", "createAccount: "+"User account is creating")
//    }
//
//    override fun deleteAccount() {
//        Log.d("TAG", "deleteAccount: "+"user account is deleting")
//    }
    override fun create() {
        Log.d("TAG", "create: "+"user account is creating")
    }

    override fun delete() {
        Log.d("TAG", "delete: "+"user account is deleting")
    }
}