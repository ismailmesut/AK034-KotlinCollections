package com.ismailmesutmujde.kotlincollections.hashmap

import com.ismailmesutmujde.kotlincollections.arraylist.Student

fun main() {

    val s1 = Student(1, "Ahmet", "11F")
    val s2 = Student(2, "Zeynep", "10R")
    val s3 = Student(3, "Ceyda", "12A")

    val students = HashMap<Int,Student>()
    students.put(s1.studentId, s1)
    students.put(s2.studentId, s2)
    students.put(s3.studentId, s3)

    for((studentId, obj) in students) {
        println("*********************************")
        println("Student Id    : ${studentId}")
        println("Student Name  : ${obj.studentName}")
        println("Student Class : ${obj.studentClass}")
    }
}