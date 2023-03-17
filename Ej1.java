/*
Crear un programa que dado un número determine si es par o impar.
 */
package ejercicios.c2;
import java.util.Scanner;

public class Ej1 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int num = leer.nextInt();
        
        if (num%2 == 0)
            System.out.println("Su numero es par");
        else
            System.out.println("Su numero es impar");
        
    }
    
}
