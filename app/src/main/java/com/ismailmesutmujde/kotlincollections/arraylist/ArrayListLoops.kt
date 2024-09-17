package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {

    val fruits = ArrayList<String>()

    fruits.add("Strawberry")
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Kiwi")
    fruits.add("Cherry")

    for(fruit in fruits) {
        println("Result : $fruit")
    }

    for ((index, fruit) in fruits.withIndex()) {
        println("Result : $index : $fruit")
    }

}