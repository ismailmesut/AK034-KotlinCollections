package com.ismailmesutmujde.kotlincollections.arraylist

fun main() {
    val p1 = Product(1, "Watch", 150.0)
    val p2 = Product(2, "TV", 1750.0)
    val p3 = Product(3, "Computer", 960.0)

    val products = ArrayList<Product>()
    products.add(p1)
    products.add(p2)
    products.add(p3)

    for(product in products) {
        println("****************************************")
        println("Prodcut id    : ${product.productId}")
        println("Product name  : ${product.productName}")
        println("Product price : ${product.productPrice}")
    }

}