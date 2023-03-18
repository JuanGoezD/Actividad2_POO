package tarea7;
import java.util.Scanner;

public class Tarea7 {

    public static void main(String[] args) {
        double A, B;
        Scanner entrada = new Scanner(System.in);
        A = entrada.nextDouble();
        B = entrada.nextDouble();
        
        System.out.println("Ingrese los valores de A y B");
        if (A > B){
            System.out.println(A+" es mayor que "+B);
        }
        else if ( A< B){
            System.out.println(B+" es mayor que "+A);
        }
        else {
            System.out.println("Ambos valores son iguales");
        }
        
                

    }
    
}
