package tarea12;
import java.util.Scanner;

public class Tarea12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        String nombres;
        double valor_hora,horas_trabajadas,horas_extra,HEE8,salario;
        
        System.out.println("Ingrese los nombres del trabajador:");
        nombres = entrada.nextLine();
        System.out.println("Ingrese las horas trabajadas:");
        horas_trabajadas = entrada.nextDouble();
        System.out.println("Ingrese el valor de la hora:");
        valor_hora = entrada.nextDouble();
        
        if (horas_trabajadas > 40) {
            horas_extra = horas_trabajadas - 40;
            if (horas_extra > 8) {
                HEE8 = horas_extra - 8;
                salario = (40 * valor_hora) + (16 * valor_hora) + (HEE8 * 3 * valor_hora);
            }
            else {
                salario = (40 * valor_hora) + (horas_extra * 2 * valor_hora);
            }
            }
        else {
            salario = horas_trabajadas * valor_hora;
        }
        System.out.println("Al trabajador "+nombres+" le corresponde un pago de $"+salario);
                
    }
    
}
