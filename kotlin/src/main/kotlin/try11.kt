fun main() {
    // object companion

    // serve principalmente para criar constantes ou métodos estáticos no seu objeto

    // é um singleton, ou seja, não precisamos criar uma instância da classe Try11CarroService
    // assim, não precisamos instanciar nada para requisitar os carros

    val carros = Try11CarroService.getCarros()
    for (c in carros) {
        println(c)
    }
}