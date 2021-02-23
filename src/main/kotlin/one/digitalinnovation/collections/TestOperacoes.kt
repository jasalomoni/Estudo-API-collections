package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1500.0, 5200.0, 4100.0)

    println("Maior salário: " + salarios.maxOrNull())
    println("Menor salário: " + salarios.minOrNull())
    println("Média salárial: " + salarios.average())

    println("=============================")
    val salarioMaior4200 = salarios.filter { it > 4200.0 }

    salarioMaior4200.forEach { println(it) }

    println("=============================")
    println(salarios.count { it in 2000.0..6000.0 })

    println("=============================")
    println(salarios.find { it == 4100.0 })
    println(salarios.find { it == 100.0 })

    println("=============================")
    println(salarios.any { it == 4100.0 })
    println(salarios.any { it == 4200.0 })
}