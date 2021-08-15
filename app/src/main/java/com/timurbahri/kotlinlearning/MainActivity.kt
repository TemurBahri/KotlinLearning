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
        //|| veya işareti (or)(alt+çizgi tuşu)
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

        println("---------------Collections)--------------")
        //Collections
        //Arrays

        val myArray = arrayOf("Timur","Bahri","Nila")
        //index
        println(myArray[0])
        myArray[0] ="Timur Bahri"
        println(myArray[0])

        myArray.set(1,"Bahri bahri")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.2,1.3,1.6)
        val mixedArray = arrayOf("Tim",5)
        println( mixedArray[0])
        println( mixedArray[1])

        println("---------------List--------------")


        val myMusician = arrayListOf<String>("Timur","bahri")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(100)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Tim")
        myMixedArrayList.add(22.2)
        myMixedArrayList.add(true)

        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])


        println("-------------- Set --------------")

        val myExampleArray = arrayOf(1,2,3,4,5)
        println("element 1: ${myExampleArray[0]}")
        println("element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        //foreach

        mySet.forEach { println(it) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Timur")
        myStringSet.add("Timur")
        println(myStringSet.size)

        println("-------------- Map --------------")

        val fruitArray = arrayOf("Elma","Muz")
        val caloriesArray = arrayOf(100,500)
        println("${fruitArray[0]} : ${caloriesArray[0]}")

        val fruitCaloriesMap = hashMapOf<String,Int>()
        fruitCaloriesMap.put("Elma",100)
        fruitCaloriesMap.put("Muz",500)
        println(fruitCaloriesMap["Elma"])


        val myHashMap = HashMap<String,String>()

        val myNewMap = hashMapOf<String,Int>("a" to 1 ,"b" to 2,"c" to  3)
        println(myNewMap["c"])

        println("-------------- Operatorler --------------")

        //Operator

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7
        println(n > m)

        println(n > m && 1 > 2 )
        println(n > m || 1 > 2 )

        println(10 + 2)
        println(10 - 2)
        println(10 * 2)
        println(10 / 2)

        println(10 % 4)

        println("-------------- Contoroller IF-ELSE --------------")

        val myNumberAge = 53
        if (myNumberAge < 20) {
            println("< 20")
        } else  if (myNumberAge >=20 && myNumberAge <30){
            println("30 - 40")
        } else if(myNumberAge >=30 && myNumberAge <40) {
            println("40 - 50")
        } else {
            println(">=50")
        }

        println("-------------- Contoroller Switch - When --------------")
        //Switch - When

        val day  = 3
        var dayString = ""

        /*if (day ==1) {
            dayString  ="Monday"
        }else if (day ==2) {
            dayString ="Tuesday"
        } else if (day ==3) {
            dayString ="Wednesday"
        }
        println(dayString)

         */


        when(day) {
            1 -> dayString ="Monday"
            2 -> dayString ="Tuesday"
            3 -> dayString ="Wedneday"
            else -> dayString =""
        }

        println(dayString)

        println("-------------- Döngüler - For Loop --------------")


        val myArrayOfNumbers = arrayOf(12,15,18,21,24,27,30,33)
        var q = myArrayOfNumbers[0] / 3 * 5
        println(q)

        for (number in myArrayOfNumbers) {
            val z = number / 3 *5
            println(z)
        }

        for (i in myArrayOfNumbers.indices ) {
            val k = myArrayOfNumbers[i] / 3 * 5
            println(k)
        }

        for (a in  0..9) {
            println(a)
        }

        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Timur")
        myStringArrayList.add("Bahri")
        myStringArrayList.add("Nila")

        for (str in myStringArrayList){
            println(str)
        }

        myStringArrayList.forEach{ println(it)}



        println("-------------- Döngüler - While Loop --------------")

        var j = 0

        while (j < 11){
            println(j)
            j = j +1
        }




    }

}