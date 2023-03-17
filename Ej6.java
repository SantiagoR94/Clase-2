/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:El usuario deberá elegir una opción y 
el programa deberá mostrar el resultado por pantalla y luego volver al menú.
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta 
que, si el usuario selecciona la opción 5, en vez de salir del programa 
directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el 
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package ejercicios.c2;
import java.util.Scanner;


public class Ej6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion; String salir = "N";
        
        System.out.println("Primer numero:");
        int num1 = leer.nextInt();
        
        System.out.println("Segundo numero:");
        int num2 = leer.nextInt();
        
        do{
            System.out.println("¿Que desea hacer con los numeros?");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            opcion = leer.nextInt();
            
            switch (opcion){
                    case 1:
                        System.out.println("La suma de los numeros da: " + (num1 + num2));
                        continue;
                    case 2:
                        System.out.println("El primer numero menos el segundo numero da: " + (num1 - num2));
                        continue;
                    case 3:
                        System.out.println("La multiplicacion de los numeros da: " + (num1 * num2));
                        continue;
                    case 4:
                        System.out.println("La division de los numeros da: " + ((float)num1 / num2));
                        continue;
                    case 5:
                        System.out.println("Está seguro de que desea salir del programa? (S/N)");
                        salir = leer.next();
                        continue;
                    default:
                        System.out.println("Opcion no valida");
            }
        }
        while (salir.equalsIgnoreCase("N"));
    }
    
}
