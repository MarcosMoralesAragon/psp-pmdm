package pruebaInicial;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej3_Grafica {
    public static void main(String[] args) {

        int[] cantidadDeRepeticiones = new int[10];

        Scanner in = new Scanner(System.in);
        int numeroPorTeclado = 0;
        do{
            System.out.println("Introduce numeros entre");
            numeroPorTeclado = in.nextInt();
            if(numeroPorTeclado > -1){
                cantidadDeRepeticiones[numeroPorTeclado] = cantidadDeRepeticiones[numeroPorTeclado] + 1;
            }
        }while (numeroPorTeclado > -1);

        System.out.println("");

        for ( int y = maxValueArray(cantidadDeRepeticiones); y > 0 ; y--){
            for (int x = 0; x < 10; x++){
                if (cantidadDeRepeticiones[x] == y){
                    cantidadDeRepeticiones[x] = cantidadDeRepeticiones[x] - 1;
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
        System.out.println("0 1 2 3 4 5 6 7 8 9");
    }
    private static int maxValueArray(int[] array){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }
}
