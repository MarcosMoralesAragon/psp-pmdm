package pruebaInicial;

import java.util.Locale;
import java.util.Scanner;

public class Ej1_Palindromos {
    public static void main(String[] args) {
        System.out.println("Detector de palindromos, introduzca su palabra");
        System.out.print("> ");
        Scanner in = new Scanner(System.in);
        String palabra = in.nextLine();

        // La palabra se pone toda en minúscula para comprobarla sin errores
        palabra = palabra.toLowerCase(Locale.ROOT);
        String[] palabraSeparada = palabra.split("");
        boolean palindromo = true;

        /*
        Se crea un bucle que divide por la mitad el tamaño de la palabra para comprobar que la ultima palabra
        y la primera coinciden y asi sucesivamente ( usando la variable i que se incrementa ) en caso de que la palabra
        tenga longitud impar la palabra situada en la mitad no se comprueba ya que esta en la misma posición
        independientemente de la orientación
         */
        for (int i=0 ; i < palabraSeparada.length/2 ; i++){
            if (!palabraSeparada[i].equals(palabraSeparada[palabraSeparada.length - i - 1])){
                palindromo = false;
                break;
            }
        }
        System.out.println(palindromo);
    }
}
