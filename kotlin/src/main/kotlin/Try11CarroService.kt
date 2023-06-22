class Try11CarroService {
    companion object {
        fun getCarros(): List<Try11Carro> {
            val carros = mutableListOf<Try11Carro>()
            for (i in 1..3) {
                val c = Try11Carro("Carro $i")
                carros.add(c)
            }
            return carros
        }
    }
}