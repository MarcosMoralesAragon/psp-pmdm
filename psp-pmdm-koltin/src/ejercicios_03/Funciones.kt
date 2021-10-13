package ejercicios_03

fun detectorDeTipo( a: Any): String {
    // .javaClass hace nos devuelve una cadena no simplificada del valor del parametro, pero añadiendo .simpleName
    // simplificamos la cadena evitando el uso de un when para cada tipo de caracter
    return a.javaClass.simpleName;
}
fun <T> separadorDeArrays(array: Array<T>, boolean: Boolean = false): String{
    var cadena = ""
    if(boolean == false){
        array.forEachIndexed{index, item ->
            if(index != 0){
                cadena += ", $item"
            } else{
                cadena += "$item"
            }}
    } else if (boolean == true){
        array.forEachIndexed{index, item ->
            cadena += "\n\n$item"}
    }
    return cadena
}

fun <T> separadorDeArraysParaEj4(array: Array<T>, boolean: Boolean = false): String{
    var cadena = ""
    if(boolean == false){
        array.forEachIndexed{index, item ->
            if(index != 0){
                cadena += "\t $item"
            } else{
                cadena += "$item"
            }}
    } else if (boolean == true){
        array.forEachIndexed{index, item ->
            cadena += "\n\n\n$item"}
    }
    return cadena
}
fun sonCircularmenteIguales(array1: Array<Int>, array2: Array<Int>):Boolean{
    var esCircular = false;
    var coinciden = 0;
    var contadorPrimerArray = 0;
    var contadorSegundoArray = 0;

    while(contadorPrimerArray < array1.size){
        contadorSegundoArray = contadorPrimerArray + 1;
        if (contadorSegundoArray == array2.size){
            contadorSegundoArray = 0;
        }
        if(array1[contadorPrimerArray] == array2[contadorSegundoArray]){
            coinciden++;
        }
        contadorPrimerArray++;
    }
    if (coinciden == array1.size){
        esCircular = true
    }
    return esCircular
}