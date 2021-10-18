package ejercicios_03

fun detectorDeTipo( a: Any): String {
    // .javaClass hace nos devuelve una cadena no simplificada del valor del parametro, pero añadiendo .simpleName
    // simplificamos la cadena evitando el uso de un when para cada tipo de caracter
    return a.javaClass.simpleName;
}
fun <T> separadorDeArrays(array: Array<T>, boolean: Boolean = false): String{
    var cadena = ""
    if(!boolean){
        array.forEachIndexed{index, item ->
            if(index != 0){
                cadena += ", $item"
            } else{
                cadena += "$item"
            }
        }
    } else if (boolean){
        array.forEachIndexed{index, item ->
            cadena += "\n\n$item"}
    }
    return cadena
}

fun <T> separadorDeArraysParaEj4(array: Array<T>, boolean: Boolean = false): String{
    var cadena = ""

    array.forEachIndexed { index, item -> }

    if(!boolean){
        array.forEachIndexed{index, item ->
            if(index != 0){
                cadena += "\t $item"
            } else{
                cadena += "$item"
            }
        }
    } else if (boolean){
        array.forEachIndexed{index, item ->
            cadena += "\n\n\n$item"}
    }
    return cadena
}
fun sonCircularmenteIguales(array1: Array<Int>, array2: Array<Int>):Boolean{
    var i = 0;
    var j = array2.lastIndexOf(array1[0]);

    while ((i < array1.size) && (array1[i] == array2[j])){
        j = (j+1)%array2.size;
        i++;
    }

    return i == array1.size
}