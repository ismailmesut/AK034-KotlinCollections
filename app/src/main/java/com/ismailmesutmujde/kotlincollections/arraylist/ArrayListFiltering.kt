package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {
    val s1 = Student(1, "Ahmet", "11F")
    val s2 = Student(2, "Zeynep","10R")
    val s3 = Student(3, "Ceyda", "12A")
    val s4 = Student(4, "Mehmet", "9Z")
    val s5 = Student(5, "Yasin", "11F")

    val students = ArrayList<Student>()

    students.add(s1)
    students.add(s2)
    students.add(s3)
    students.add(s4)
    students.add(s5)

    //val resultList = students.filter { it.studentId > 2 }
    //val resultList = students.filter { (it.studentName).contains("a") }
    val resultList = students.filter { it.studentClass == "11F" }
    for(s in resultList) {
        println("**************************************")
        println("Student Id    : ${s.studentId}")
        println("Student Name  : ${s.studentName}")
        println("Student Class : ${s.studentClass}")
    }
}