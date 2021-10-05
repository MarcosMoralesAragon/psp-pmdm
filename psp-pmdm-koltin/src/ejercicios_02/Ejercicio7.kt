package ejercicios_02

fun main() {
    val arrayEjercicio = arrayOf("campamento","cardinales","polen",null,"hoja","hermana","relatividad", null)
    for ( i in arrayEjercicio.indices){
        if (arrayEjercicio[i] != null){
            println("La cadena ${arrayEjercicio[i]} tiene de longuitud: ${arrayEjercicio[i].toString().length}")
        }
    }
}