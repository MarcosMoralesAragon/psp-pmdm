package ejercicios

fun main() {
    val a = 10
    val b = 9
    val c = a%b
    val d = (c+1)/2

    println("${!((a>b) and (c==d))}") // False
    println("${(a > b) and ( c != d)}") // False
    println("${!(a != (b+1))}") // True
    println("${((a*b) % 2) > ((c+1) / 2)}") // True
}