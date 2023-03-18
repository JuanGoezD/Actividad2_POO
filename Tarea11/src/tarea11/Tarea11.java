package tarea11;
import java.util.Scanner;

public class Tarea11 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int a,b,c,mayor;
        
        System.out.println("Ingrese los valores a comparar:");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        if ((a > b) && (a>c)) {
            mayor = a;
        }
        else if ((b>a) && (b > c)) {
            mayor = b;
        }
        else {
            mayor = c;
        }
        System.out.println("El mayor valor entre "+a+","+b+" y "+c+", es el "+mayor);
    }
    
}
