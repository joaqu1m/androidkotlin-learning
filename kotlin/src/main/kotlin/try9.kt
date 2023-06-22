fun main() {
    // herança

    // no kotlin as classes são final por padrão, assim sendo impossível de utilizar herança.
    // para utilizar da herança, tanto uma classe quanto seus métodos devem ser anotados com open

    // utilizando da classe pai aberta:
    val automovel = Try9Automovel(
        "Fusca",
        2099
    )

    println(automovel.acelerar(100))
    println(automovel.toString())

    // utilizando da herdeira, que sobrescreve o método acelerar e toString

    val aviao = Try9Aviao(
        "Jatinho",
        2002
    )

    println(aviao.acelerar(100))
    println(aviao.toString())
}