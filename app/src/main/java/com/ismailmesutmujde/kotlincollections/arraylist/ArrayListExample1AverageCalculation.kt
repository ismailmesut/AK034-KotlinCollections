package com.ismailmesutmujde.kotlincollections.arraylist

fun main(){

    val numbers = ArrayList<Double>()

    numbers.add(30.0)
    numbers.add(40.0)
    numbers.add(60.0)
    numbers.add(10.0)
    numbers.add(100.0)
    numbers.add(60.0)

    var sum = 0.0

    for (n in numbers) {
        sum = sum + n
    }

    println("Average : ${sum / numbers.size}")

}