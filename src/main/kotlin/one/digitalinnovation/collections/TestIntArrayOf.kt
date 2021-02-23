package one.digitalinnovation.collections

fun main() {
    val values = intArrayOf(1, 3, 9, 5, 4, 10)

    values.forEach {
        println(it)
    }

    println("================")
    values.sort()
    values.forEach {
        println(it)
    }
}