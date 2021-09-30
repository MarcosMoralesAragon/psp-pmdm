package ejercicios

fun main() {
    val bocatasJamon:Double = 1.5
    val refresco:Double = 1.05
    val cerveza:Double = 0.75

    val cuenta = (bocatasJamon * 5) + (refresco * 3) + (cerveza * 2)

    println("Por sus 5 bocatas, 3 refrescos y 2 cervezas debe pagar un total de $cuenta €")
}