package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 5200.0, 4100.0)

    println("Maior salário: " + salarios.max())
    println("Menor salário: " + salarios.min())
    println("Média salárial: " + salarios.average())

    println("=============================")
    val salarioMaior4200 = salarios.filter { it > 4200.0 }

    salarioMaior4200.forEach { println(it) }

}