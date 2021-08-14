package com.timurbahri.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("---------------Integer--------------")

        var x = 5
        var y = 4

        println(x * y)


        var age = 35

        val result = age / 7 * 5
        println(result)


        var myInteger : Int

        myInteger = 10

        val a : Int = 23

        println(a/2)

        //Double $ Float
        println("---------------Double $ Float--------------")
        val myLong : Long
        myLong = 100
        println(myLong * 2)

        val pi = 3.14
        println(pi * 2)

        val myFloat = 3.14f
        println(myFloat * 2)


        var myAge : Double
        myAge = 8.14
        println(myAge / 2 )


        println("---------------String--------------")

        val myString = "timur bahri"
        val name = "Nila"
        val surname = "Bahri"

        val fullname = name + " " + surname
        println(fullname)

        val larsName : String = "Lars"

        println( myString.capitalize())

        println("---------------Boolean--------------")

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true
        //< küçüktür
        //> büyüktür
        //<= küçük eşittir
        //>= büyük eşittir
        //== eşittir
        //!= eşit değildir
        //&& ve işareti (and)
        //|| boru işareti (or)(alt+soru işareti tuşu)
        println(3<5)
        println(6<3)
        println(3==3)
        println(4 !=5)

        println("---------------Birbirine çevirmek (Conversion)--------------")

        var myNamber = 5
        var myLongNumber = myNamber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputInteger = input.toInt()
        println(inputInteger * 2)
    }
}