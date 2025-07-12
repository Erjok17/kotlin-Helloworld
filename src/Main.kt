
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

import kotlin.math.abs as absolute

// Calculator class to organize operations
class Calculator {
 fun add(a: Int, b: Int): Int = a + b
 fun subtract(a: Int, b: Int): Int = a - b
 fun multiply(a: Int, b: Int): Int = a * b
 fun divide(a: Int, b: Int): Double =
  if (b != 0) a.toDouble() / b else Double.NaN

 fun abs(value: Int): Int = absolute(value)
}

// Function to display the menu
fun showMenu() {
 println(
  """
        -------------------------
        Select an operation:
        1. Addition
        2. Subtraction
        3. Multiplication
        4. Division
        5. Absolute Difference
        6. Quit
        -------------------------
        """.trimIndent()
 )
}

// Function to read an integer safely
fun readInt(prompt: String): Int {
 while (true) {
  print(prompt)
  val input = readlnOrNull()
  try {
   return input?.toInt() ?: throw NumberFormatException()
  } catch (e: NumberFormatException) {
   println("Invalid number. Please try again.")
  }
 }
}

// Function to pause and wait for user to continue
fun pause() {
 println("Press Enter to continue...")
 readln()
}

fun main() {
 val calc = Calculator()

 println("🔢 Welcome to the Kotlin Math Utility App! 🔢")
 print("Enter your name: ")
 val name = readln()
 println("Hello, $name! Let's begin.\n")

 var running = true
 while (running) {
  showMenu()
  val choice = readInt("Enter your choice (1–6): ")

  if (choice == 6) {
   println("Goodbye, $name! 👋")
   running = false
   continue
  }

  val num1 = readInt("Enter the first number: ")
  val num2 = readInt("Enter the second number: ")

  when (choice) {
   1 -> {
    val result = calc.add(num1, num2)
    println("Result: $num1 + $num2 = $result")
   }

   2 -> {
    val result = calc.subtract(num1, num2)
    println("Result: $num1 - $num2 = $result")
   }

   3 -> {
    val result = calc.multiply(num1, num2)
    println("Result: $num1 × $num2 = $result")
   }

   4 -> {
    val result = calc.divide(num1, num2)
    if (result.isNaN()) {
     println("Cannot divide by zero.")
    } else {
     println("Result: $num1 ÷ $num2 = $result")
    }
   }

   5 -> {
    val result = calc.abs(num1 - num2)
    println("Absolute difference: |$num1 - $num2| = $result")
   }

   else -> println("Invalid choice. Please select a number between 1 and 6.")
  }

  pause()
  println("\n-------------------------\n")
 }

 println("Thank you for using the Kotlin Math Utility App, $name! 🎉")
}
