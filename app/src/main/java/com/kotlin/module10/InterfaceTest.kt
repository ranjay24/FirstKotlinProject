package com.kotlin.module10

fun main(args: Array<String>) {
    var vehicle = Vehicle()
    println("Name : ${vehicle.name}")
    vehicle.go()
    vehicle.stop()
}