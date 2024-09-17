package com.ismailmesutmujde.kotlincollections.hashmap

fun main() {
    val numbers = mapOf<Int,String>(1 to "One", 2 to "Two")
    val rates = mutableMapOf(1.5 to "Rate1", 3.4 to "Rate2")
    val provinces = HashMap<Int,String>()

    provinces.put(16,"BURSA")
    provinces.put(34,"İSTANBUL")

    println(provinces.toString())

    provinces.put(16,"NEW BURSA")
    println(provinces.toString())

    println(provinces.get(34))

    println(provinces.size)
    println(provinces.count())

    println(provinces.isEmpty())
    println(provinces.containsKey(16))
    println(provinces.containsValue("İSTANBUL"))

    for((key, value) in provinces) {
        println("${key} : ${value}")
    }

    provinces.remove(16)
    println(provinces.toString())

    provinces.clear()
    println(provinces.toString())
}