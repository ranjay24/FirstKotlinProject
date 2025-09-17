package com.kotlin.module1

fun main(args: Array<String>) {
    var values = ArrayList<Int>();
    values.add(1);
    values.add(2);
    values.add(2,3);
    values.add(3,43);


    println(values);
    println(values[0]);
    println(values.get(2));
    println("${values[0]}");
    println(values.remove(323)); //will return false as 323 is not present
    println(values.size);

//    to create ArrayList of heterogenious datatype use any generic

    var mixArrylist = ArrayList<Any>();
    mixArrylist.add(32)
    mixArrylist.add("3223");
}
