package com.ismailmesutmujde.kotlincollections.arraylist

import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    val employees = ArrayList<Employee>()

    for (i in 1..5){

        println("$i. Employee Name : ")
        val name = input.next()

        println("$i. Employee Address Province : ")
        val province = input.next()

        println("$i. Employee Address Borough :")
        val borough = input.next()


        val adress = Address(province,borough)
        val employee = Employee(i,name,adress)

        employees.add(employee)
    }

    for (e in employees) {
        println("*************************************************************")
        println("Employee Id                : ${e.employeeId}")
        println("Employee Name              : ${e.employeeName}")
        println("Employee Adress Province   : ${e.employeeAddress.province}")
        println("Employee Adress Borough    : ${e.employeeAddress.borough}")
    }


}