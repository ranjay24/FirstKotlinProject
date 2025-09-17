package com.kotlin.module1

fun main(args: Array<String>) {
    var IplTeams = arrayOf("RCB", "CSK", "MI", "DC", "SRH", "KKR", "GT")
//In Kotlin array can contain Heterogeneous values
    println(IplTeams[3])  // Output: DC
    println(IplTeams[0])  // Output: RCB
    println(IplTeams.get(1))  // Output: CSK
    val oldValue = IplTeams.set(2, "123")  // Replaces "MI" with "123"
    val intValue = IplTeams.get(2).toIntOrNull()  // Converts "MI" to an Int
    println(intValue)  // Prints 123 because "123" is a valid integer
}
