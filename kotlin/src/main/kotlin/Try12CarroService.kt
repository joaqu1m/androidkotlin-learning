object Try12CarroService {
    fun getCarros(): List<Try12Carro> {
        val carros = mutableListOf<Try12Carro>()
        for (i in 1..3) {
            val c = Try12Carro("Carro $i")
            carros.add(c)
        }
        return carros
    }
}