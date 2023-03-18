package tarea10;
import java.util.Scanner;

public class Tarea10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numero_inscripcion,nombre;
        double patrimonio,estrato,matricula;
        
        System.out.println("Ingrese el numero de inscripcion:");
        numero_inscripcion = entrada.nextLine();
        System.out.println("Ingrese el nombre:");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el patrimonio:");
        patrimonio = entrada.nextDouble();
        System.out.println("Ingrese el estrato:");
        estrato = entrada.nextDouble();
        matricula = 50000;
        
        if ((patrimonio > 2000000) && (estrato > 3)) {
            matricula = matricula + 0.03 * patrimonio;
        }
        System.out.println("EL estudiante con numero de inscripcion " + numero_inscripcion + " y nombre " + nombre + " debe pagar: $" + matricula);
        
        
        
        
        
        
        

    }
    
}
