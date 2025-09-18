package com.kotlin.module7

fun main(args: Array<String>) {
    var car = Car()
    car.type = "Car"
    car.model = "Ferrari"
    car.maxSpeed = 320
    car.show()

    var motor  = MoterCycle()
    motor.type = "MotorCycle"
    motor.model= "Royal Enfield"
    motor.maxSpeed = 200
    motor.show()
}