inline fun List<Int>.filtrar2(filtro: (Int) -> (Boolean)): List<Int> {
    val newList = arrayListOf<Int>()
    for (item in this) {
        if(filtro(item)) {
            newList.add(item)
        }
    }
    return newList
}

fun main() {
    // funções inline

    // ao passar uma lambda como parâmetro para outra função, por debaixo dos panos é criado um objeto que
    // implementa aquela função, e esse objeto é passado como parâmetro. ou seja, os objetos em memória crescem,
    // e quando usado demais, pode afetar o desempenho da aplicação

    // ao adicionar a palavra inline no início de uma função, ela é criada apenas no contexto da chamada, ou seja,
    // ela é descartada logo após isso. temos aqui um exemplo de função inline
}