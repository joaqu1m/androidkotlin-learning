fun main() {
    // data classes

    // classes que contém apenas informações

    // automaticamente implementam as funções:
    // equals(); hashcode(); toString(); copy(); get/set

    val c1 = Try10Carro("Fusca", 2099)
    val c2 = Try10Carro("Fiat Uno", 2099)
    val c3 = Try10Carro("Fusca", 2099)

    println(c1.nome)

    // Isso chama automaticamente o método equals(), por baixo dos panos
    println(c1 == c2)
    println(c1 == c3)

    // Valor hash dessa instância, geralmente usado em estrutura de dados
    println(c1.hashCode())

    // Método copy copia todos os atributos de uma instância e te permite editar qualquer um no processo
    val c4 = c1.copy(nome = "Carrão")

    println(c4)

}