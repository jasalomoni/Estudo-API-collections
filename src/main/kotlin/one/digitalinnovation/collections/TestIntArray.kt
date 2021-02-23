package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 4
    values[2] = 7
    values[3] = 5
    values[4] = 2

    //usando FOR normal
    for(valor in values) {
        println(valor)
    }
    println("================")

    //usando FOREACH padrão com a variável IT
    values.forEach {
        println(it)
    }
    println("================")

    //usando FOREACH com variável criada (lambda)
    values.forEach { valor ->
        println(valor)
    }
    println("================")

    //listando valores da tabela a partir do indice
    for (indice in values.indices) {
        println(values[indice])
    }
    println("================")

    //classificando os valores da tabela
    values.sort()
    for(valor in values) {
        println(valor)
    }
}