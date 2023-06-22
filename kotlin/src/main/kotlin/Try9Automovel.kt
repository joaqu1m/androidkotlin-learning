open class Try9Automovel (
    nome: String,
    ano: Int
) {
    private val nome: String
    private val ano: Int
    init {
        this.nome = nome
        this.ano = ano
    }

    open fun acelerar(velocidade: Int): String {
        return "Acelerando em $velocidade km/h"
    }

    override fun toString(): String {
        return "Automóvel $nome, ano: $ano"
    }
}