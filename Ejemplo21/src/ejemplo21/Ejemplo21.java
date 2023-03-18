package ejemplo21;
import java.util.Scanner;

public class Ejemplo21 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double lado1,lado2,lado3,perimetro,semiperimetro,area;
        
        System.out.println("Ingrese el valor de los lados:");
        lado1 = entrada.nextDouble();
        lado2 = entrada.nextDouble();
        lado3 = entrada.nextDouble();
        
        perimetro = lado1 + lado2 + lado3;
        semiperimetro = perimetro / 2;
        area = Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("El semiperimetro del triangulo es: "+semiperimetro);
        System.out.println("La area del triangulo es: "+area);
        
        

    }
    
}
