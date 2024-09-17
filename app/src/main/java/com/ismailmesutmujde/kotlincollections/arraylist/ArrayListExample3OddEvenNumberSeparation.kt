package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {

    val numbers = ArrayList<Int>()
    numbers.add(1)
    numbers.add(23)
    numbers.add(32)
    numbers.add(47)
    numbers.add(59)
    numbers.add(100)
    numbers.add(18)
    numbers.add(54)

    val oddNumbers = ArrayList<Int>()
    val evenNumbers = ArrayList<Int>()

    for (n in numbers) {
        val result = n % 2

        if (result == 0) {
            evenNumbers.add(n)
        }
        if (result == 1) {
            oddNumbers.add(n)
        }
    }

    println("Odd Numbers")
    for (o in oddNumbers) {
        println(o)
    }

    println("Even Numbers")
    for (e in evenNumbers) {
        println(e)
    }
}