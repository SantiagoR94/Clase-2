/*
Escriba un programa que pida una frase o palabra y valide si la primera letra
de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir 
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se debera
imprimir “INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ejercicios.c2;
import java.util.Scanner;

public class Ej4 {

   
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra que comience con A:");
        String palabra = leer.nextLine();
        
        if(palabra.substring(0,1).equalsIgnoreCase("A")) 
            System.out.println("CORRECTO");
        else 
            System.out.println("INCORRECTO");
          
    }
    
}
