package com.ismailmesutmujde.kotlincollections.arraylist

import java.util.ArrayList
import java.util.Scanner

fun main() {

    val input = Scanner(System.`in`)
    val lessonScoresList = ArrayList<LessonScores>()

    while (true) {

        println("Enter Lesson Name :")
        val lesson = input.next()

        println("Enter Lesson Score : ")
        val score = input.nextInt()

        val newScore = LessonScores(lesson, score)
        lessonScoresList.add(newScore)

        println("(1) to exit - other numbers to continue")
        val exit = input.nextInt()

        if(exit == 1) {
            println("*******************************")
            var sum = 0
            for (ls in lessonScoresList) {
                println("${ls.lesson} : ${ls.score}")
                sum = sum + ls.score
            }

            val average = sum /lessonScoresList.size
            println("*******************************")
            println("AVERAGE : ${average}")

            if (average >= 50) {
                println("YOU PASSED")
            } else {
                println("YOU COULDN'T PASS")
            }

            println("Exit done")
            break
        }
    }

}