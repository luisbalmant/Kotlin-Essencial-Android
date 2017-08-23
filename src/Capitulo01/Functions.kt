package Capitulo01

import java.util.*

fun main(args: Array<String>) {

    helloWorld()

    println(whatTimesIsIt())

    var total = soma(10, 12)
    println("Total = $total")

}

fun helloWorld(){
    println("Hello World!")
}

fun whatTimesIsIt(): Date {
    return Date()
}
// Recebe 2 inteiros e retorna um número inteiro.
fun soma(a: Int, b: Int): Int{
    return a + b
}