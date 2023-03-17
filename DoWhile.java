/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero 
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números 
leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso
de la sentencia break.
 */
package ejercicios.c2;
import java.util.Scanner;
public class DoWhile {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int contador = 0; int suma = 0;
        int num;
        
        do{
            System.out.println("Ingrese un numero positivo:");
            num = leer.nextInt();
            contador ++;
            if (num == 0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            else if (num<0){
                System.out.println("Numero no valido");
            }
            else{
                suma = suma + num;
            }

        }
        while (contador !=20);
        
        System.out.println("La suma de todos los numeros ingresados es = " + suma);
    }

}
