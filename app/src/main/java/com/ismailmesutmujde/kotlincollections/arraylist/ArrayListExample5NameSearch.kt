package com.ismailmesutmujde.kotlincollections.arraylist

import java.util.ArrayList
import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    val names = ArrayList<String>()

    names.add("ahmet")
    names.add("mehmet")
    names.add("zeynep")
    names.add("sedat")
    names.add("ercan")
    names.add("berna")
    names.add("gamze")

    println("Enter name to search")
    val name = input.next()

    for (n in names) {
        if (n == name) {
            println("NAME AVAILABLE")
            break
        } else {
            println("NAME NOT AVAILABLE")
            break
        }
    }

}