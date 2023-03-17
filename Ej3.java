/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 
de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá 
de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java
 */
package ejercicios.c2;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una palabra o frase de 8 letras");
        String palabra = leer.nextLine();
        
        if (palabra.length() == 8){
            System.out.println("CORRECTO");
        }
        else{
            System.out.println("INCORRECTO");
        }
        
    }
}

