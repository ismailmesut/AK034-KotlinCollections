package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {

    val fruits = ArrayList<String>()

    fruits.add("Strawberry")
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Kiwi")
    fruits.add("Cherry")

    println(fruits.isEmpty())   // false
    println(fruits.count())
    println(fruits.size)
    println(fruits.first())
    println(fruits.last())
    println(fruits.contains("Cherr"))
    println(fruits.max())
    println(fruits.min())

    fruits.sort()
    println(fruits.toString())

    fruits.reverse()
    println(fruits.toString())

    fruits.removeAt(3)
    println(fruits.toString())

    fruits.remove("Kiwi")
    println(fruits.toString())

    fruits.clear()
    println(fruits.toString())

}