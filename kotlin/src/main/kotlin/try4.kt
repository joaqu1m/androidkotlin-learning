fun main() {
    // null safety

    // o kotlin só permite que variáveis tenham valores nulos se isso for explicitamente indicado no código

    // isso é para ajudar o programador a ter mais controle sobre o código

    // ela é indicada pelo operador ? logo após a tipagem
    var palavra: String? = "banana"
    println(palavra)
    palavra = null
    println(palavra)

    // outro operador ? (chamado de safe call) serve para ignorar a chamada caso o objeto seja nulo
    // isso serve para não travar o código caso o valor seja nulo
    println("olha a ${palavra?.length}")

    // para forçar que a referência do objeto seja acessada, podemos usar o operador !!
    // este operador é para ser usado em último caso, já que apenas uma validação de null já pode resolver o problema
}