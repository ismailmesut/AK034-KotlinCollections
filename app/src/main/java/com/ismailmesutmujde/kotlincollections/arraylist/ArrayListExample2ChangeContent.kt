package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {

    val numbers = ArrayList<Int>()

    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)
    numbers.add(5) // [1,2,3,4,5] --> [2,4,6,8,10]

    for ((index, number) in numbers.withIndex()) {
        val result = number * 2
        numbers[index] = result
    }

    for (n in numbers) {
        println(n)
    }
}