package pruebaInicial;

import java.util.ArrayList;
import java.util.Scanner;

public class Ej2_Primos {
    public static void main(String[] args) {
        System.out.println("Introduzca la cantidad de primos que quiere generar");
        System.out.print("> ");
        Scanner in = new Scanner(System.in);
        int cantidad = in.nextInt();

        ArrayList primo = new ArrayList();
        int esPrimo = 0;
        
        for (int i = 0; cantidad > 0; i++){
            if (i == 1 || i == 2 || i == 3 || i == 5 || i == 7){
                primo.add(i);
                cantidad --;
            } else {
                if( i % 2  != 0){
                    esPrimo++;
                }
                if( i % 3  != 0){
                    esPrimo++;
                }
                if( i % 5  != 0){
                    esPrimo++;
                }
                if( i % 7  != 0){
                    esPrimo++;
                }
                if (esPrimo == 4){
                    primo.add(i);
                    cantidad --;
                }
            }
            esPrimo = 0;
        }
        System.out.println(primo);
    }
}
