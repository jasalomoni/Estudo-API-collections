package one.digitalinnovation.collections

fun main() {
    val num = 10
    var var1 = 0
    var var2 = 1
    var tot = 0
    var total: Double = 0.0
    var perc: Double = 0.0
    val values = IntArray(num+1)

    values.forEachIndexed { index, i ->
        if (index == 0) {
            values[index] = var1
            println(var1)
        }else{
            if (index == 1) {
                values[index] = var2
                println(var2)
            }else{
                tot = var1 + var2
                println(tot)
                var1 = var2
                var2 = tot
            }
        }
    }
    println(values.any { it == num })

    val fatura = doubleArrayOf(1.0, 3.0, 9.0, 5.0, 4.0, 10.0)

    fatura.forEach { valor ->
        total += valor
        println(total)
    }
    fatura.forEach { valor ->
        perc = (valor / total) * 100
        println("Faturamento: $valor Percentual: $perc")
    }
    println("Faturamento total: $total")
}