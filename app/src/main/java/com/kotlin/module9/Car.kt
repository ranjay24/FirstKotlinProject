package com.kotlin.module9

class Car(override var model: Int) : Vehicle() {
    override fun name(name: String): String {
       return name
    }
}