package com.kotlin.module2

import androidx.core.util.rangeTo

fun main(args: Array<String>) {
    var myCharRange  = 'a'.rangeTo('j');
    var myChar  = 'c' in myCharRange;
    println(myChar)
}