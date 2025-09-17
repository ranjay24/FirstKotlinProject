package com.kotlin.module3

fun main(args: Array<String>) {
    println("Enter a number");
    var num1 : Int = readLine()!!.toInt();
    var num2 : Int = readLine()!!.toInt()
    var num3 : Int = readLine()!!.toInt();

    //greater among three numbers
    if(num1>=num2 && num1>=num3){
            println("num 1 is greater among all")
    }
    else if(num2>=num1 && num2>=num3){
        println("num 2 is greater among all")
    }
    else {
        println("num 3 is greater among all")
    }
}