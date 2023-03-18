package ejercicio18;
import java.util.Scanner;

public class Ejercicio18 {

    public static void main(String[] args) {
        System.out.println("Ingrese el codigo del empleado:");
        Scanner entrada = new Scanner(System.in);
        String codigo = entrada.nextLine();
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombres = entrada.nextLine();
        
        System.out.println("Ingrese el número de horas trabajadas en el mes:");
        int HorasTrabajadas = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la hora de trabajo:");
        double ValorHora = entrada.nextDouble();
        
        System.out.println("Ingrese el porcentaje de retencion en la fuente:");
        double retencion = entrada.nextDouble();
        
        double SalarioBruto = ValorHora*HorasTrabajadas;
        double SalarioNeto = SalarioBruto-((SalarioBruto*retencion)/100);
        
        System.out.println("El código del empleado es: "+codigo);
        System.out.println("Su nombre es: "+nombres);
        System.out.println("Su salario bruto es: $"+SalarioBruto);
        System.out.println("Su salario neto es: $"+SalarioNeto);
         
    }
    
}
