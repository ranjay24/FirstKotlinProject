package com.kotlin.module7

open class Vehicle {
    var type : String? = null
    var model: String? = null
    var maxSpeed : Int? = null

    fun  show(){
        println("Type is $type")
        println("model is $model")
        println("maxSpeed is $maxSpeed")
    }
}