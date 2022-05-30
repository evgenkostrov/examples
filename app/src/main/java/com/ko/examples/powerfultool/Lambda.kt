package com.ko.examples.powerfultool

//fun main() {
//    val sayHello: () -> Unit = { println("Hello!") }
//    sayHello()
//}

//fun main() {
//    val times10 = magnitude(10)
//    val times5 = magnitude(5)
//    println(times10(5))
//    println(times5(2))
//
//}
//fun magnitude(times:Int):(Int)->Int{
//    return{it*times}
//}



//fun main() {
//    val times10 = magnitude(10)
//    val times5 = magnitude(5)
//    println(times10(5))
//    println(times5(2))
//
//}
//fun magnitude(times:Int):(Int)->Int{
//    return{it*times}
//}

/**
 Reduce Code Duplication
 */

fun LayoutBinding.set

/**
 DSL
 html is actually a function call that takes a lambda expression as an argument
 html function takes one parameters which is itself a function
 The type of the function is HTML.()->Unit, which is a function type with receiver
 This means that we need to pass an instance of type HTML (a receiver) to the function,
 and we can call members of that instance inside the function


 */