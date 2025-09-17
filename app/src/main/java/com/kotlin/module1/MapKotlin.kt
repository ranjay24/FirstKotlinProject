package com.kotlin.module1

fun main(args: Array<String>) {
    var age  = mapOf<String, Int>("Digvijay" to 28,"Ranjay" to 22,"Nilesh" to 22,"Sujeet" to 20,"Vineet" to 15);
    println(age["Ranjay"])

    println("-----------------------------")
    var mutablemap = mutableMapOf<String, Int>("Digvijay" to 28,"Ranjay" to 22,"Nilesh" to 22,"Sujeet" to 20,"Vineet" to 15);
    mutablemap.put("Unknown",32);
    println(mutablemap.get("Unknown"))
}