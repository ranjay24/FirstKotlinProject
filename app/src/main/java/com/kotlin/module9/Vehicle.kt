package com.kotlin.module9

abstract class Vehicle {
    abstract fun name(name: String) : String

    fun type(type: String) : String{
        return type
    }

    abstract var model : Int
    var speed : Int? = null
}