package Capitulo02

var anoAtual = 2017

open class Animal {
    private var nomePrivado = "Marie" //Nesse caso, disponível somente dentro dessa classe "Animal".
    var nomePublico = "Safadinha"
    protected var anoNascimento = 2014
    internal var tipo = "Mamifero"
    var patas = 4
}

class Cachorro : Animal() {
    fun descobrirIdade() {
        println("A idade da $nomePublico é " + (anoAtual - anoNascimento))
    }
}

fun main(args: Array<String>) {
    val marie = Cachorro()
    marie.descobrirIdade()
    println(marie.tipo)
    println(marie.patas)
}