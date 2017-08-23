package Capitulo01

fun main(args: Array<String>) {

    var array = arrayOf("SP", "RJ", "PR")

    println(array[1])

    var mix = arrayOf("SP", 20, "ES", 50)

    var inteiros = intArrayOf(30, 40, 50, 60, 70)

    for ((index, inteiro) in inteiros.withIndex()){
        println("Index $index - Inteiro $inteiro")
    }

    var outrosEstados = arrayOf("PA", "BA", "SC")

    var todosEstados = array + outrosEstados

    for (estado in todosEstados){
        println("Estado $estado")
    }

    var str = "Uma String"

    println(str[2])
}