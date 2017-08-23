package Capitulo03

enum class Direcao{
    NORTE, SUL, LESTE, OESTE
}

class Bussola{
    var direcao: Direcao = Direcao.LESTE
}

fun main(args: Array<String>) {

    var bussola = Bussola()

    println("\nDireção inicial:")

    println(bussola.direcao)

    println("\nMudando direção:")

    bussola.direcao = Direcao.NORTE

    println(bussola.direcao)

}