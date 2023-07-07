fun main() {
    val nomes = listOf("Joaquim", "Pires")

    // retorna os mesmos elementos modificados
    val uppercaseList = nomes.map { it.uppercase() }
    println(uppercaseList)

    // retorna ou não os elementos da lista baseado na função retornar true ou false
    val ints = listOf(1, 2, 3, 4, 5)
    val pares = ints.filter { it % 2 == 0 }
    println(pares)
}