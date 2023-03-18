package tarea24;
import java.util.Scanner;

public class Tarea24 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double esfera1,esfera2,esfera3;
        
        System.out.println("Ingrese el valor de la primera esfera");
        esfera1 = entrada.nextDouble();
        System.out.println("Ingrese el valor de la segunda esfera");
        esfera2 = entrada.nextDouble();
        System.out.println("Ingrese el valor de la tercera esfera");
        esfera3 = entrada.nextDouble();
        
        if ((esfera1>esfera2) && (esfera1>esfera3))  {
            System.out.println("La esfera de mayor peso es la esfera 1");
        }
        else if ((esfera2>esfera1)&&(esfera2)>esfera3)  {
            System.out.println("La esfera de mayor peso es la esfera 2");
        }
        else  {
            System.out.println("La esfera de mayor peso es la esfera 3");
        }

    }
    
}
