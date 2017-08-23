package Capitulo02

interface Dirigivel {
    fun acelerar(velocidade: Long)
}

interface Carregavel {
    fun carregar(quantidade: Long)
}

open class Veiculo(open var cor: String, open var ano: Int, open var nome: String) //{

//    init {
//        println("Inicializando dados sobre $nome.")
//    }
//    fun garageOn() {
//        println("Coloca o $nome na Garagem!")
//    }
//
//    fun garageOf() {
//        println("Tira o $nome da Garagem!")
//    }
//}

class Carro(override var cor: String, override var ano: Int, override var nome: String) :
        Veiculo(cor, ano, nome), Dirigivel {
    override fun acelerar(velocidade: Long) {
        println("Esse ${modelo} faz em 10 segundos de 0/$velocidade")
    }

    var modelo: String = "Honda"
}

class Caminhao(override var cor: String, override var ano: Int, override var nome: String, var capacidade: Long) :
        Veiculo(cor, ano, nome), Dirigivel, Carregavel {
    override fun acelerar(velocidade: Long) {
        println("Esse ${modelo} faz em 10 segundos de 0/$velocidade")
    }

    override fun carregar(quantidade: Long) {
        println("Recomendável carregar esse $modelo com $quantidade tonelada(s).")
    }
    var modelo: String = "Volvo"
}

fun main(args: Array<String>) {
    val civic: Dirigivel = Carro("Preta", 2017, "Civic")
    civic.acelerar(100)
//    civic.modelo
//    println("Meu carro novo é: ${civic.modelo} ${civic.nome}, ${civic.ano}, cor ${civic.cor}.")
//    civic.garageOn()

//    println("=========================================================")
//
//    val fit = Carro("Prata", 2007, "Fit")
//    fit.modelo
//    println("Meu carro antigo era: ${fit.modelo} ${fit.nome}, ${fit.ano}, cor ${fit.cor}.")
//    //   fit.garageOf()

    println("=========================================================")

    val fmx = Caminhao("Branca", 2017, "FMX", 2000)
    fmx.modelo
    println("Meu carro de trabalho é: ${fmx.modelo} ${fmx.nome}, ${fmx.ano}, cor ${fmx.cor}, com capacidade de ${fmx.capacidade}.")
    //   fit.garageOn()
    fmx.acelerar(80)
    fmx.carregar(1)

}