package com.kotlin.module9

fun main(args: Array<String>) {
    var car = Car(model = 2022)
    car.speed = 300
    println("Name is ${car.name("BMW")}")
}