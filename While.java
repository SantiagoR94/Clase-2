/*
Escriba un programa que valide si una nota está entre 0 y 10,
sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ejercicios.c2;

import java.util.Scanner;

public class While {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nota = 20;
        
        while (nota < 0 || nota > 10){
            System.out.println("Ingrese la nota:");
            nota = leer.nextInt();
           if (nota < 0 || nota > 10)
                System.out.println("Nota no valida");
        }
        
        System.out.println("Nota valida");
    }
    
}
