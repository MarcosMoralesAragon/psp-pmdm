package ejercicios

fun main() {
    val a = readLine()!!.toInt()
    val aBisisesto:Boolean = (a%4 == 0) && !(a%100 == 0);
    print(aBisisesto)
}