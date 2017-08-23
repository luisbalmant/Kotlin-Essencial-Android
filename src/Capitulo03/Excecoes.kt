package Capitulo03

val divisor = 100

fun main(args: Array<String>) {

//    print("Digite um número: ")
//    val numero: Int = readLine()!!.toInt()
//    val divisao: Int = 100 / numero
//    println("A divisão é $divisao")

    try {
        print("Digite um número: ")
        val numero: Int = readLine()!!.toInt()
        val divisao: Int = divisor / numero
        println("A divisão de $divisor por $numero é $divisao")
    } catch (e: Exception) {
        println("Erro: ${e.message}")
    } finally {
        println("Programa finalizado!")
    }

}