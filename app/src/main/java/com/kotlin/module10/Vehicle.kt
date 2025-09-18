package com.kotlin.module10

class Vehicle : Cango, CanStop{
    override val name: String
        get() = "Ferrari"

    override fun stop() {
        println("Vehicles can stop")
    }
}