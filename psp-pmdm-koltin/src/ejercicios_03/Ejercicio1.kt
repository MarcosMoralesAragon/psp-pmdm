package ejercicios_03

fun main() {
    var numero:Int = 11
    var byte:Byte = 1
    var palabra = "a"
    var short:Short = 11
    var boolean = true;

    println("El tipo es ${detectorDeTipo(numero)}")
    println("El tipo es ${detectorDeTipo(byte)}")
    println("El tipo es ${detectorDeTipo(short)}")
    println("El tipo es ${detectorDeTipo(palabra)}")
    println("El tipo es ${detectorDeTipo(boolean)}")

}