package com.kotlin.module1

fun main(args: Array<String>) {
    var age = setOf<Any>("Kotlin",2,2.5,2.5,3);
    println(age.size);
    println(age.last());
}