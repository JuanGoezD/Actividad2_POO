package tarea15;
import java.util.Scanner;

public class Tarea15 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double peso1,peso2,peso3,peso4;
        
        System.out.println("Ingrese el peso de las esferas:");        
        peso1 = entrada.nextDouble();
        peso2 = entrada.nextDouble();
        peso3 = entrada.nextDouble();
        peso4 = entrada.nextDouble();
        
        if ((peso1 == peso2) && (peso1 == peso3))  {
            if (peso4>peso1)  {
                System.out.println("La esfera 4 es la diferente y es de mayor peso");
            }
            else {
                System.out.println("La esfera 4 es la diferente y es de menor peso");
            }
        }
        else if ((peso1 == peso2) && (peso1 == peso4))  {
            if (peso3 > peso1)  {
                System.out.println("La esfera 3 es la diferente y es de mayor peso");
            }
            else  {
                System.out.println("La esfera 3 es la diferente y es de menor peso");
            }
        }
        else if ((peso1 == peso3) && (peso1 == peso4))  {
            if (peso2 > peso1)  {
                System.out.println("La esfera 2 es la diferente y es de mayor peso");
            }
            else  {
                System.out.println("La esfera 2 es la diferente y es de menor peso");
            }
        }
        else  {
            if (peso1 > peso2)  {
                System.out.println("La esfera 1 es la diferente y es de mayor peso");
            }
            else  {
                System.out.println("La esfera 1 es la diferente y es de menor peso");
            }
        }
        
    }
    
}
