package ejercicios_02

fun main() {
    var edad: Int = 66
    var estado: String = ""

    when {
        edad < 18 -> { estado = "Menor de edad" }
        (edad >= 18) && (edad <= 65) -> { estado = "Activo" }
        edad > 65 -> { estado = "Jubilado" }
    }

    println("A la edad $edad , su estado es : $estado")

}