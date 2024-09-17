package com.ismailmesutmujde.kotlincollections.hashset

import com.ismailmesutmujde.kotlincollections.arraylist.Student

fun main() {

    val s1 = Student(1, "Ahmet", "11F")
    val s2 = Student(2, "Zeynep", "10R")
    val s3 = Student(3, "Ceyda","9Z")
    val s4 = Student(4, "Ece", "12A")

    val students = HashSet<Student>()

    students.add(s1)
    students.add(s2)
    students.add(s3)
    students.add(s4)

    for(s in students) {
        println("*************************************")
        println("Student Id     : ${s.studentId}")
        println("Student Name   : ${s.studentName}")
        println("Student Class  : ${s.studentClass}")
    }

}