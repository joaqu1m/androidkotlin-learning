fun main() {
    // Conversões de tipos: As e Is

    // O operador As é utilizado para converter de um tipo para outro
    // Ele lança uma ClassCastException caso essa conversão não possa ser realizada
    // A utilização do operador as? (cast seguro) retorna null ao em vez de lançar uma exceção

    // O operador Is é utilizado para verificar se a variável é do tipo informado

    val palavra = "banana"

    println(palavra as String)

    println(palavra as? Int)

    if (palavra is String) println("$palavra é uma string")
}