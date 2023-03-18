package tarea14;
import java.util.Scanner;

public class Tarea14 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double ventas1,ventas2,ventas3,salario,salario1,salario2,salario3,total,porcentaje;
        
        System.out.println("Ingrese las ventas de los departamentos:");
        ventas1 = entrada.nextDouble();
        ventas2 = entrada.nextDouble();
        ventas3 = entrada.nextDouble();
        
        System.out.println("Ingrese el salario de los vendedores:");
        salario = entrada.nextDouble();
        total = ventas1 + ventas2 + ventas3;
        porcentaje = total * 0.33;
        
        if (ventas1 > porcentaje) {
            salario1 = salario + (salario * 0.2);
        }
        else {
            salario1 = salario;
        }
        
        if (ventas2 > porcentaje) {
            salario2 = salario + (salario * 0.2);   
        }
        else {
            salario2 = salario;
        }
        
        if (ventas3>porcentaje) {
            salario3 = salario + (salario * 0.2);
        }
        else {
            salario3 = salario;
        }
        
        System.out.println("El salario de los vendedores del departamento 1 es "+salario1);
        System.out.println("El salario de los vendedores del departamento 2 es "+salario2);
        System.out.println("El salario de los vendedores del departamento 3 es "+salario3);
    }
    
}
