package com.ismailmesutmujde.kotlincollections.arraylist

class Student(var studentId:Int, var studentName:String, var studentClass:String) {

    override fun hashCode(): Int {
        return this.studentId
    }

    override fun equals(other: Any?): Boolean {
        if (this.studentId == (other as Student).studentId) {
            return true
        } else {
            return false
        }
    }

}