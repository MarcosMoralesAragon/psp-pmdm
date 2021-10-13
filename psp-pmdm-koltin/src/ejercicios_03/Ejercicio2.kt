package ejercicios_03

fun main() {
    var arrayDePalabras = arrayOf("Primero", "Segundo", "Tercero" , "Cuarto")
    println("Separado por comas ${separadorDeArrays(arrayDePalabras)} \n")
    println("Separado por intros ${separadorDeArrays(arrayDePalabras, true)}")
}