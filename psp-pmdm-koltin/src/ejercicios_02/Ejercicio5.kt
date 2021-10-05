package ejercicios_02

fun main() {
    var numero:Int = 1234
    var numeroReverse = 0;

    var numeroParaWhile : Int = numero

    while(numeroParaWhile > 0){
        numeroReverse = numeroReverse * 10  + numeroParaWhile%10
        numeroParaWhile /= 10
    }
    println("Numero invertido $numeroReverse")
}