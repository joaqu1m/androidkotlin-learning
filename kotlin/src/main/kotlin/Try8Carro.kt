class Try8Carro (
    // Recebe por parâmetro os valores para inicialização da classe.
    // não é necessário, é dependente das regras de negócio do seu código
    nome: String,
    ano: Int
) {

    // Variáveis da própria classe
    // Estas variáveis estão sendo criadas como "val" e sem um valor atribuído,
    // ou seja, este valor precisa necessariamente ser atribuído na inicialização da classe
    private val nome: String
    private val ano: Int

    // Função usada na instanciação da minha classe,
    // para que os atributos vindos do parâmetro sejam associados aos atributos da classe
    init {
        this.nome = nome
        this.ano = ano
    }

    // Aqui estou sobrescrevendo a função .toString(), que é uma função reservada da linguagem.
    // Estou refatorando esta função para retornar uma representação em string do meu objeto Carro
    // A alteração funciona apenas nesta classe
    override fun toString(): String {
        return "Carro $nome, ano: $ano"
    }
}