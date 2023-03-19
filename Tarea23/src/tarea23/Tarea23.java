package tarea23;
import java.util.Scanner;

public class Tarea23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a,b,c,solucion1,solucion2,discriminante;
        
        System.out.println("Ingrese un valor de a:");
        a = entrada.nextDouble();
        System.out.println("Ingrese un valor de b:");
        b = entrada.nextDouble();
        System.out.println("Ingrese un valor de c:");
        c = entrada.nextDouble();
        
        discriminante = Math.pow(b,2) - 4 * a * c;
        
        if (discriminante > 0)  {
        solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        
        System.out.println("Las soluciones reales de la ecuacion son x1 = "+solucion1+" y x2 = "+solucion2);
            }
        else if (discriminante == 0)  {
            double solucion = -b / (2 * a);
            System.out.println("La solucion de la ecuacion es x = "+solucion);
        }
        else  {
            System.out.println("La ecuacion no tiene soluciones reales");
        }
        
    }
    
}
