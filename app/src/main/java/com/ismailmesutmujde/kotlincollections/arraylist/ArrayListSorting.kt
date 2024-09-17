package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {
    val p1 = Persons(1,"Ahmet")
    val p2 = Persons(2,"Zeynep")
    val p3 = Persons(3,"Berna")

    val personsArrayList = ArrayList<Persons>()

    personsArrayList.add(p1)
    personsArrayList.add(p2)
    personsArrayList.add(p3)

    println("Before")

    for(p in personsArrayList) {
        println("${p.personId} - ${p.personName}")
    }

    println("Numerical Sorting from Smallest to Largest")
    val sortingArrayList1 = personsArrayList.sortedWith(compareBy { it.personId })

    for (p in sortingArrayList1) {
        println("${p.personId} - ${p.personName}")
    }

    println("Numerical Sorting from Largest to Smallest")
    val sortingArrayList2 = personsArrayList.sortedWith(compareByDescending { it.personId })
    for (p in sortingArrayList2) {
        println("${p.personId} - ${p.personName}")
    }

    println("Sorting Letters from Smallest to Largest")
    val sortingArrayList3 = personsArrayList.sortedWith(compareBy { it.personName })

    for (p in sortingArrayList3) {
        println("${p.personId} - ${p.personName}")
    }

    println("Sorting Letters from Largest to Smallest")
    val sortingArrayList4 = personsArrayList.sortedWith(compareByDescending { it.personName })
    for (p in sortingArrayList4) {
        println("${p.personId} - ${p.personName}")
    }

}