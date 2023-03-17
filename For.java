/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e 
imprima el número ingresado seguido de tantos asteriscos como indique su valor
 */
package ejercicios.c2;

import java.util.Scanner;

public class For {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numeros[] = new int[4] ;
        
        //FOR dedicado a tomar los numeros por pantalla
        for (int i = 0 ; i < 4 ; i++) {
            System.out.println("Ingrese un numero (del 1 al 20):");
            numeros[i] = leer.nextInt();
            //WHILE para corroborar que el numero este entre 1 y 20
            while (numeros[i] > 20 || numeros[i] < 1 ){
                System.out.println("Numero no valida,ingrese otro");
                numeros[i] = leer.nextInt();
            }
                
        }
        //FOR dedicado a imprimir los numeros
        for (int i = 0 ; i < 4 ; i++){
            System.out.print(numeros[i] + ":");
            for ( int j = 0 ; j < numeros[i] ; j++){
            System.out.print("*");
           }
            System.out.println("");
        }
                
        
    }
}
