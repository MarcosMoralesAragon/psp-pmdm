package ejercicios_03

import java.lang.reflect.Array

fun main() {
    var array1 = arrayOf(3,4,1,5)
    var array2 = arrayOf(5,3,4,1)
    var array3 = arrayOf(5,4,3,1)
    print("El array 1 y el array 2 ")

    if (sonCircularmenteIguales(array1,array2)){
        println("son circularmente iguales")
    } else {
        println("no son circularmente iguales")
    }

    print("El array 1 y el array 3 ")

    if (sonCircularmenteIguales(array1,array3)){
        println("son circularmente iguales")
    } else {
        println("no son circularmente iguales")
    }
}