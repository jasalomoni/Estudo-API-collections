package one.digitalinnovation.collections

fun main() {
    val nomes = Array<String>(4){""}

    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "Augusto"
    nomes[3] = "Zeca"

    for (valor in nomes) {
        println(valor)
    }
    println("============")
    val nomes2 = arrayOf("Maria", "João", "Augusto", "Zeca")
    nomes2.sort()
    nomes2.forEach {
        println(it)
    }
}