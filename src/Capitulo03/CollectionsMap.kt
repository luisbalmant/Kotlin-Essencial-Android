package Capitulo03

fun main(args: Array<String>) {
    var map = hashMapOf("Chave 1" to 1, "Chave 2" to 2, "Chave 3" to 3)
//    map.put("Chave 4" to 4) => errado, nesse caso não se o usa o "to"
    map.put("Chave 4", 4) // usa-se vírgula

    map.remove("Chave 3")

    for (chave in map.keys){
        println("$chave: ${map.get(chave)}")
    }
}