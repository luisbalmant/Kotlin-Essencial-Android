package Capitulo03

fun main(args: Array<String>) {
    var arrayList = arrayListOf("Luís", "Bárbara", "Fred")
    println("\nA matilha atual é $arrayList.")
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    arrayList.add("Dexter")
    println("Por um tempo a matilha foi $arrayList")
    arrayList.remove("Dexter")
    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    println("Propriedade size: " + arrayList.size)
    println("Propriedade isEmpty: " + arrayList.isEmpty())

    println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-")

    println("A matilha é composta por ${arrayList.size} integrantes que são:")
    println("O papai é o ${arrayList[0]}")
    println("A mamãe é a ${arrayList[1]}")
    arrayList.add("Dexter")
    println("O neném é o ${arrayList[2]}, que botou o ${arrayList[3]} para correr")
}