package com.kotlin.module5

fun main(args: Array<String>) {
    println("Enter the Firt num")
    var a :Int  = readLine()!!.toInt();
    println("Enter the second number")
    var b: Int = readLine()!!.toInt()
    var ans : Int = Addfun(a,b);
    println("The sum is : $ans")
}

fun Addfun(x : Int , y : Int) : Int{
    var sum : Int = x+y;
    return sum;
}