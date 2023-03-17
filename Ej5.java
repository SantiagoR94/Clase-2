/*
Escriba un programa en el cual se ingrese un valor limite positivo, 
y a continuacion solicite numeros al usuario hasta que la suma de los
numeros introducidos supere el limite inicial.
 */
package ejercicios.c2;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        int num,limite;
        
        //Se declara el limite
        System.out.println("Ingrese un limite:");
        limite = leer.nextInt();
        
        //Se piden numeros por teclado hasta superar a ese limite
        do {
            System.out.println("Ingrese un numero para sumar hasta llegar a " + limite + ":");
            num = leer.nextInt();
            
            suma = suma + num;
        }
        while (suma < limite);
        
        System.out.println("Se sumo un total de " + suma);
        
    }
    
}
