package com.kotlin.module3

fun main(args: Array<String>) {
    println("Enter day number of a week");
    var dayNum : Int = readLine()!!.toInt()

    when(dayNum){
        1-> println("Monday");
        2-> println("Tuesday");
        3->println("Wednesday");
        4->println("Thursday");
        5->println("Friday");
        6->println("Saturday");
        7->println("Sunday");
        else -> println("Invalid dayNum");
    }

}