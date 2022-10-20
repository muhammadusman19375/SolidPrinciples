package com.example.solidprinciple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//.........................Signle responsibility principle...............................
//        var addition = Addition()
//        addition.add(2,3)
//
//        var substract = Substraction()
//        substract.substract(15,12)

//        var calculatorObj = Calculator()
//        calculatorObj.add(10,5)
//        calculatorObj.substract(10,5)
//        calculatorObj.divide(10,5)
//        calculatorObj.multiply(10,5)
//........................................................................................


//............................Open Closed principle.......................................
//        var circleClass = CircleClass()
//        circleClass.area()
//
//        var rectangleClass = RectangleClass()
//        rectangleClass.area()
//.........................................................................................


//...........................Liskov Substitution Principle.................................
//        var user = User()
//        user.createAccount()
//        user.deleteAccount()
//
//        var admin = Admin()
//        admin.createAccount()
//        admin.deleteAccount()


//        var user = User()
//        user.create()
//        user.delete()
//
//        var admin = Admin()
//        admin.create()
//.............................................................................................


//...........................Interface Segregation Principle...................................
//        var prepare = Prepare()
//        prepare.prepareSms()
//
//        var send = Send()
//        send.sendSms()
//...............................................................................................


//...........................Dependency Inversion Principle......................................
//        var classCObj = C()
//
//        classCObj.displayA()
//        classCObj.displayB()
//        classCObj.displayC()

//        var classObjA = A()
//        classObjA.display()
//
//        var classObjB = B()
//        classObjB.display()
//
//        var classObjC = com.example.solidprinciple.DIP.Solution.C()
//        classObjC.display()
//................................................................................................


    }
}