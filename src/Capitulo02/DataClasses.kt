package Capitulo02

class Livro(val titulo: String, val autor: String, val ano: Int)


/**
 * Para criar uma data class, basta inserir a palavra data antes, como abaixo:
 */
data class DataLivro(val titulo: String, val autor: String, val ano: Int)

//-------------
fun main(args: Array<String>) {
    // Livros da classe normal:
    val livro = Livro("AndroidPro", "Filipe Cordeiro", 2017)
    val livro2 = Livro("AndroidPro", "Filipe Cordeiro", 2017)

    // Livros da data class
    val dataLivro = DataLivro("AndroidPro", "Filipe Cordeiro", 2017)
    val dataLivro2 = DataLivro("AndroidPro", "Filipe Cordeiro", 2017)

    println("\nLivros da classe normal")
    println(livro)
    println(livro2)
    println("Os livros são iguais? " + livro.equals(livro2))

    println("\nLivros da data class")
    println(dataLivro)
    println(dataLivro2)
    println("Os livros são iguais? " + dataLivro.equals(dataLivro2))
}