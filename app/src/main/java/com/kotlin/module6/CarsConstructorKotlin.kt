package com.kotlin.module6

fun main(args : Array<String>){
    var myCars = Cars()
    myCars.name = "G-Wagon"
    myCars.model = 2025
    println("The name of the car is ${myCars.name} and the model is of year ${myCars.model}")
    var myCars2 = Cars()
    myCars2.name = "Ferrari"
    myCars2.model = 2020
    println("The name of the car is ${myCars2.name} and the model is of year ${myCars2.model}")


    var myNewCar = CarsWithValue("BMW",2019)
    println("My new Car name is ${myNewCar.name} and the model is ${myNewCar.model}")
    println(myNewCar.add(23,323))
}