fun parOuImpar(num: Int): String {
    // o ternário pode ser feito com os próprios if e else
    return if (num % 2 == 0) "par" else "impar"
}

fun enviarEmail(usuario: String, titulo: String? = null): String {
    val s = titulo?: "Bem-vindo"
    return "$s $usuario"
}

fun main() {
    // operador ternário e elvis

    println(parOuImpar(1))
    println(parOuImpar(2))

    println(enviarEmail("Joaquim"))
    println(enviarEmail("Joaquim", "Tudo bem?"))

    // o operador ?: (elvis) é a definição de "se o valor não for nulo, use-o. se for, use outro da minha escolha"

}