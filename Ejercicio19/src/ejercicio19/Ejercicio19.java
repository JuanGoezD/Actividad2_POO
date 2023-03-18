package ejercicio19;
import java.util.Scanner;

public class Ejercicio19 {

    public static void main(String[] args) {
        double lado, area, perimetro, altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado:");
        lado = entrada.nextDouble();
        area = (lado * lado)/2;
        perimetro = lado * 3;
        altura = Math.sqrt(Math.pow(lado,2)-Math.pow(lado/2,2));
        System.out.println("El area del triangulo es: "+area);
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("La altura del triangulo es: "+altura);
        
    }
    
}
