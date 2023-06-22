class Try9Aviao (
    nome: String,
    ano: Int
): Try9Automovel (
    nome,
    ano
) {
    override fun acelerar(velocidade: Int): String {
        return "Acelerando demais da conta, em $velocidade km/h"
    }

    override fun toString(): String {
        return "Nada para ver aqui"
    }
}