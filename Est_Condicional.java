/*
Considera que estás desarrollando una web para una empresa que fabrica 
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un
valor entre 1 y 4.
 */
package ejercicios.c2;

import java.util.Scanner;

public class Est_Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de motor (1/2/3/4)");
        int tipoMotor = leer.nextInt();
        
        switch (tipoMotor){
                case 1:
                    System.out.println("La bomba es una bomba de agua");
                    break;
                case 2:
                    System.out.println("La bomba es una bomba de gasolina");
                    break;
                case 3:
                    System.out.println("La bomba es una bomba de hormigon");
                    break;
                case 4:
                    System.out.println("La bomba es una bomba de pasta alimenticia");
                    break;
                default:
                    System.out.println("No existe una bomba con este valor");
                    break;
        
        }

    }
    
}
