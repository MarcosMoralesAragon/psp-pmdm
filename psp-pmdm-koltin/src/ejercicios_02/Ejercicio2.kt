package ejercicios_02

fun main() {
    var nota: Double = 5.00
    when{
        nota < 5 && nota >= 0 -> {println("Suspenso")}
        nota >=5 && nota < 6 -> { println("Aprobado")}
        nota >=6 && nota < 7 -> {println("Bien")}
        nota >= 7 && nota < 9 -> {println("Notable")}
        nota >=9 && nota <= 10 -> {println("Sobresaliente")}
        else -> { println("Dato erroneo")}
    }
}