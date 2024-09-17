package com.ismailmesutmujde.kotlincollections.arraylist

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)

    var counter = 1

    val students = ArrayList<Student>()

    while (true) {

        println("Enter Student Name")
        val studentName = input.next()
        println("Enter Student Class")
        val studentClass = input.next()

        val newStudent = Student(counter, studentName, studentClass)
        counter = counter + 1

        students.add(newStudent)

        println("(1) to exit - other numbers to continue")
        val exit = input.nextInt()
        if (exit == 1) {

            for (student in students) {
                println("***************************************")
                println("Student Id    : ${student.studentId}")
                println("Student Name  : ${student.studentName}")
                println("Student Class : ${student.studentClass}")
            }

            println("Exit done")
            break
        }
    }
}