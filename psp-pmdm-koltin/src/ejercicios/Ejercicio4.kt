package ejercicios

fun main() {
    val num1 = 0xAB
    val num2 = 3
    println("AB and 3 = ${num1 and num2}") // 3
    println("AB or 3 = ${num1 or num2}") // AB
    println("AB xor 3 = ${num1 xor num2}") // A8 --> 168 ( decimal )
    println("AB shl 3 = ${num1 shl 3}") // 558 --> 1368 ( decimal )
    println("AB shr 2 = ${num1 shr 2}") //2A --> 42 ( decimal )
}