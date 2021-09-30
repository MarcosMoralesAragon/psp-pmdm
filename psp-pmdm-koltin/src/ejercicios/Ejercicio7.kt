package ejercicios

fun main() {
    val rango: IntProgression = 11..50 step 2
    val estaEnRango22:Boolean = (22 in rango)
    val estaEnRango39:Boolean = (39 in rango)

    println("Que el 22 esta en este rango es : $estaEnRango22")
    println("Que el 39 esta en este rango es : $estaEnRango39")
}