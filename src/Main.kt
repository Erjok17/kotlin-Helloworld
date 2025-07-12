
// Learning Kotlin Basics

//🔧 Kotlin Practice Exercise: Greeting & Math Utility App
//🎯 Objective:
//Create a small Kotlin program that:
//
//Uses a package declaration.
//
//Uses imports (either custom alias or built-in Kotlin functions).
//
//Accepts user input.
//
//Uses variables to store and process data.
//
//Defines and uses functions.
//
//Has a proper main() entry point.
//
//📝 Exercise Instructions:
//You are to create a program that asks the user for:
//
//Their name
//
//Two integers
//
//Then it should:
//
//Greet the user by name.
//
//Show the sum, difference, product, and quotient of the two integers.
//
//Use functions for each of the math operations.
//
//Organize it with a package at the top.
//
//Use print() and println() properly.
//
//Include one import alias for fun (you can alias kotlin.math.abs as absolute and call it later).
//
//🧪 Sample Output
//yaml
//Copy
//Edit
//Enter your name:
//>> Juju
//Hello, Juju!
//
//Enter first number:
//>> 10
//Enter second number:
//>> 4
//
//Sum: 14
//Difference: 6
//Product: 40
//Quotient: 2.5
//Absolute Difference: 6
//💡 Function Signatures You Should Create:
//kotlin
//Copy
//Edit
//fun add(a: Int, b: Int): Int
//fun subtract(a: Int, b: Int): Int
//fun multiply(a: Int, b: Int): Int
//fun divide(a: Int, b: Int): Double
//✅ Bonus Points if You:
//Use string templates ("Hello, $name!")
//
//Use inferred types (val result = add(...))
//
//Use as to rename an import (e.g., import kotlin.math.abs as absolute)


package com.practice.mathapp

import kotlin.math.abs as absolute  // Using alias

fun add(a: Int, b: Int): Int = a + b

fun subtract(a: Int, b: Int): Int = a - b

fun multiply(a: Int, b: Int): Int = a * b

fun divide(a: Int, b: Int): Double = a.toDouble() / b

fun main() {
 println("Enter your name:")
 val name = readln()
 println("Hello, $name!\n")

 print("Enter first number:\n>> ")
 val num1 = readln().toInt()

 print("Enter second number:\n>> ")
 val num2 = readln().toInt()

 val sum = add(num1, num2)
 val difference = subtract(num1, num2)
 val product = multiply(num1, num2)
 val quotient = divide(num1, num2)
 val absDifference = absolute(difference)

 println("\nResults:")
 println("Sum: $sum")
 println("Difference: $difference")
 println("Product: $product")
 println("Quotient: $quotient")
 println("Absolute Difference: $absDifference")
}