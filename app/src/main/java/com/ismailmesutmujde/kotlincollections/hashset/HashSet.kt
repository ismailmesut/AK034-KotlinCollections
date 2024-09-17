package com.ismailmesutmujde.kotlincollections.hashset

fun main() {
    val fruits = setOf("Strawberry", "Banana", "Apple", "Kiwi")

    val provinces = mutableSetOf("Bursa", "İstanbul", "Ankara", "İzmir")

    val numbers = HashSet<Int>()
    numbers.add(10)
    numbers.add(20)
    numbers.add(30)
    println(numbers.toString())

    numbers.add(21)
    println(numbers.toString())
    println(numbers.elementAt(1))

    println(numbers.size)
    println(numbers.count())
    println(numbers.isEmpty())
    println(numbers.contains(25))

    for (n in numbers) {
        println(n)
    }

    for ((i, n) in numbers.withIndex()) {
        println("$i. -> $n")
    }

    numbers.remove(10)
    println(numbers.toString())

    numbers.clear()
    println(numbers.toString())
}
