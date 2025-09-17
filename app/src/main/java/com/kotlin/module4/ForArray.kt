package com.kotlin.module4

fun main(args: Array<String>) {
    var myArray = arrayOf<Int>(1,2,3,4,5,6,7,8,9);
    for (i in myArray){
        if (i%2==0){
            println("$i is even")
        }
        else{
            println("$i is odd")
        }
    }

    for (i in myArray.indices) {
        println("myArray[$i] is = ${myArray[i]}")
    }

}