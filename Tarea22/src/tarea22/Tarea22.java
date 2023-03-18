package tarea22;
import java.util.Scanner;

public class Tarea22 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double horas_trabajadas,salario_basico,salario_mensual;
        String nombre;
        
        nombre = entrada.nextLine();
        salario_basico = entrada.nextDouble();
        horas_trabajadas = entrada.nextDouble();
        salario_mensual = salario_basico * horas_trabajadas;
        
        if (salario_mensual > 450000)  {
            System.out.println("El nombre del empleado es "+nombre+", y su salario es de $"+salario_mensual);
        }
        else  {
            System.out.println("El nombre del empleado es "+nombre);
        }
        
    }
    
}
