package com.kotlin.module8

fun main(args: Array<String>) {
    var vehicle = Vehicle()
    vehicle.start()
    vehicle.accelerate()
    vehicle.start()

    var car = Car()
    car.start()
    car.accelerate()
    car.stop()
    car.superstart()

}