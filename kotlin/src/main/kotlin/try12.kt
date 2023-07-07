fun main() {
    // singletons

    // para criar um singleton no kotlin, é necessário utilizar da palavra object no lugar de class

    val carros = Try12CarroService.getCarros()

    for(c in carros) {
        println(c)
    }
}