package Capitulo01

fun main(args: Array<String>) {
    var idade: Int = 25

    if (idade < 18){
        println("Não pode beber e nem tirar CNH")
    } else if (idade < 21) {
        println("Não pode beber, mas pode tiar CNH")
    } else if (idade < 25){
        println("Pode beber e tirar CNH")
    } else {
        println("Está liberado!")
    }

//    var str: String = if (idade < 18) "Menor de Idade" else "Maior de idade"
//    println(str)

    println("Idade Verificada")

    var str: String = if (idade < 18) {
        "Menor de Idade"
    } else {
        "Maior de idade"
    }
    println(str)
}