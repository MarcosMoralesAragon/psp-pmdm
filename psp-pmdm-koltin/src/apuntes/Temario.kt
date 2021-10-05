package apuntes

/**
 * La funcion recibe dos parámetros , uno un rango de tipo entero y una funcion que a su vez recibe un valor del tipo
 * entero y devuelve nada (Unit)
 */
fun iterar(datos: IntRange,foo: (num:Int,) -> Unit){
    datos.map {
        println("Número $it")
        foo(it)
    }
}
class foo {
    var nombre:String = "lala"
}
open class Personaje(var nombre: String, var vida: Int) {
    open fun morir() = println("Estas muerto")
}

class Mago(nombre: String, vida: Int, var habilidades: String):Personaje(nombre,vida){
    override fun morir() = println("El mago esta muerto")

}

class Elfo(nombre: String, vida: Int) : Personaje(nombre, vida) {
    override fun morir() = println("El elfo esta muerto")
}
fun main(){
    // Operador Elvis
    val cadena:String? = null ;
    println("La cadena contiene: ${cadena?: "El valor es nulo"} \n")

    // Operador when
    println("\n")
    val numero:Int = 13;
    when(numero){
        in 1..10 -> { println("El valor esta entre 1 y 10") }
        in 10..20 -> { println("El valor esta entre 2 y 20") }
        else -> { println("Numero no esta en el rango") }
    }

    //
    var num:Int = 0;
    val rango = 1..3;

    val function = fun(num: Int) { println("Función: $num")}

    iterar(rango,function);
    iterar(rango,{num:Int -> println("Segundo caso")})

    // Clases
    println("\n")
    val personaje: Personaje = Personaje("Antonio Medula", 100);
    println(personaje.nombre)
    println(personaje.vida)
    personaje.vida = 50
    println(personaje.vida)

    val mago: Mago = Mago("Gandalf", 50, "Bola de fuego")
    val elfo: Elfo = Elfo("Legolas", 75)
    elfo.morir()
    mago.morir()
}