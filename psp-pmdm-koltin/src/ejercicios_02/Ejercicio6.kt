package ejercicios_02

fun main() {
    var altura = 4;
    var i = 1

    while (i <= altura){
        var altura2 = altura;
        var cadena = "";
        while (altura2 > 0){
            if(altura2 > i){
                cadena += " "
                altura2--;
            } else {
                if (i == 1){
                    cadena += "1"
                }else{
                    cadena += cadenaNumerosImprimir(i)
                }
                break
            }
        }
        println(cadena)
        i++
    }
}
fun cadenaNumerosImprimir(i: Int): String {
    var cantidadDeRestas = 0
    var cadena = ""
    var irestas = i
    var i2 = i
    while (irestas > 1){
        cadena += (i2 - (irestas - 1))
        cantidadDeRestas++;
        irestas--;
    }
    while (cantidadDeRestas != 0){
        cadena = cadena + (i2 - (irestas-1))
        cantidadDeRestas--
        irestas++
    }
    cadena += 1
    return cadena
}