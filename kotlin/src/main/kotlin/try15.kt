fun String.ascii(): String {
    var s = ""
    for(c in this) {
        s += c.code
    }
    return s
}

fun List<Int>.filtrar(filtro: (Int) -> (Boolean)): List<Int> {
    val newList = arrayListOf<Int>()
    for (item in this) {
        if(filtro(item)) {
            newList.add(item)
        }
    }
    return newList
}

fun main() {

    // extensoes

    // criando uma extensão da classe String para conseguir adicionar mais métodos sem herança

    println("banana".ascii())

    // uma maneira mais moderna de escrever esse tipo de coisa:

    val ints = listOf(1, 2, 3, 4, 5)
    println(ints)
    var list = ints.filtrar { it % 2 == 0 }
    println(list)

    list = ints.filtrar { it > 3 }
    println(list)
}