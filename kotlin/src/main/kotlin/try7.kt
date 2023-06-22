fun soma7(a: Int, b: Int = 2): Int = a + b

fun testeVarargs(vararg args: String): List<String> {
    println(args)
    val list = ArrayList<String>()
    for(s in args)
        list.add(s)
    // Varargs encontrados:
    return list
}

fun <T> testeGenerico(vararg args: T): List<T> {
    val list = ArrayList<T>()
    for(s in args)
        list.add(s)
    return list
}

fun main() {
    // default arguments

    // funções podem ter valores padrões para paramêtros que você não deseja passar

    println(soma7(5))
    println(soma7(5, 5))

    // named arguments

    // ao passar valores, você pode especificar o valor que quer passar escrevendo seu nome na chamada da fun

    println(soma7(a = 5))

    // varargs
    // tipo especial de parâmetro de função, normalmente definido no final de tudo
    // pode receber um ou mais parâmetros

    println(testeVarargs("opa", "soinvoesnvoewn", "owenw21"))

    // tipo genérico
    // serve para que voce nao precise definir a tipagem dos itens que entram na funçao
    // é usado para funcoes realmente mais genericas
    // é definido como T

    println(testeGenerico("opa", "asaaaaaa"))
    println(testeGenerico(2, 4))
    println(testeGenerico(2, "a"))
}