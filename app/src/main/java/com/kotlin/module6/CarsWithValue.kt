package com.kotlin.module6

class CarsWithValue constructor(var name : String , var model : Int) {
    //to write a peice of code we can only write that in init method
    init {
    println("My new Car name is ${name} and the model is ${model}")
    }
    fun add(a :Int, b : Int) : Int{
        return a+b;
    }
}