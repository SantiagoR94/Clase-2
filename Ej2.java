/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package ejercicios.c2;
import java.util.Scanner;

public class Ej2 {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = leer.nextLine();
        
        if (palabra.equals("eureka"))
            System.out.println("Palabra correcta!");
        else
            System.out.println("Palabra incorrecta :(");
        
        
    }
    
}
