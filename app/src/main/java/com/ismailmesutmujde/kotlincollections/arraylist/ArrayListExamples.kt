package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {

    val list = ArrayList<String>()
    val list2 : ArrayList<Int> = ArrayList<Int>()

    val fruits = ArrayList<String>()
    fruits.add("Strawberry")
    fruits.add("Banana")
    fruits.add("Apple")
    fruits.add("Kiwi")
    fruits.add("Cherry")

    println(fruits.toString())

    val str = fruits.get(2)
    println(str)

    val str1 = fruits[4]
    println(str1)

    fruits.add("Tangerine")
    println(fruits.toString())

    fruits[2] = "Pineapple"
    println(fruits.toString())

    fruits.add(3,"Orange")
    println(fruits.toString())

}