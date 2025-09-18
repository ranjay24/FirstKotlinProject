package com.kotlin.module8

class Car : Vehicle() {
    override fun start(){
        println("Car has started")
    }
    override fun accelerate(){
        println("Car has accelerate")
    }
    override fun stop(){
        println("Car has stop")
    }

    //Now if we want to do overriding without override key word we can use super key word look how
    fun superstart(){
        super.start()
    }
}