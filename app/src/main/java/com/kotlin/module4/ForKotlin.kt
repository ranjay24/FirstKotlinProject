package com.kotlin.module4

fun main(args: Array<String>) {
    println("Enter the number of table you want");
    var table : Int = readLine()!!.toInt()
    //using rangeTo
    for (i in 1.rangeTo(10)){
        println("$table x $i = ${table*i}")
    }

    //using downTo
    for (i in 10 downTo 1){
        println("$table x $i = ${table*i}")
    }

    //using rangeTo using step
    for (i in 1.rangeTo(10) step 2){
        println("$table x $i = ${table*i}")
    }

    //using downTo
    for (i in 10 downTo 1 step 2){
        println("$table x $i = ${table*i}")
    }

}