fun filtrar(list: List<Int>, filtro: (Int) -> (Boolean)): List<Int> {
    val newlist = arrayListOf<Int>()
    for (item in list) {
        if(filtro(item)) {
            newlist.add(item)
        }
    }
    return newlist
}

// Nessa função eu usei uma função anônima como default function do segundo parâmetro da minha High-Order Function
fun filtrarDefault(
    list: List<Int> = listOf(),
    filtro: (Int) -> (Boolean) = fun (numero: Int) = numero > 3
): List<Int> {
    val newlist = arrayListOf<Int>()
    for (item in list) {
        if (filtro(item)) {
            newlist.add(item)
        }
    }
    return newlist
}

fun numerosPares(numero: Int) = numero % 2 == 0
fun numerosMaiorQue3(numero: Int) = numero > 3

fun main() {
    // no kotlin existe um conceito chamado de high-order function.
    // basicamente, são funções que podem ser passadas por parâmetro para outras funções e retornadas pelas mesmas

    val ints = listOf<Int>(1, 2, 3, 4, 5)
    println(ints)
    var list = filtrar(ints, ::numerosPares)
    println(list)
    // A sintaxe ::funcao é usada para passar um fun como parâmetro
    list = filtrar(ints, ::numerosMaiorQue3)
    println(list)
    // Esse mesmo código pode ser feito com uma lambda function:
    list = filtrar(ints, { numero: Int -> numerosMaiorQue3(numero) })
    println(list)
    // Que pode ser abreviada utilizando o parâmetro genérico it (quando houver apenas um parâmetro recebido pela fun)
    list = filtrar(ints, { numerosMaiorQue3(it) })
    println(list)
    // E que pode ser abreviada assim, caso seja o último parâmetro a ser informado
    list = filtrar(ints) { numerosMaiorQue3(it) }
    println(list)

    // Desta maneira, nossas funções numerosPares e numerosMaiorQue3 podem se tornar anônimas,
    // já que são pequenas e que estariam sendo usadas apenas uma vez

    list = filtrar(ints) { it % 2 == 0 }
    println(list)
    list = filtrar(ints) { it > 3 }
    println(list)
}
