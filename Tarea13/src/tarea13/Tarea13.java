package tarea13;
import java.util.Scanner;

public class Tarea13 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double valor_compra,valor_pago,descuento;
        String color;
        
        System.out.println("Ingrese el color(en mayusculas):");
        color = entrada.nextLine();
        System.out.println("Ingrese el valor de la compra:");
        valor_compra = entrada.nextDouble();

        if (color.equals("BLANCO")) {
            descuento = 0;
        }
        else if (color.equals("VERDE")) {
            descuento = 0.1;
        }
        else if (color.equals("AMARILLO")) {
            descuento = 0.25;
        }
        else if (color.equals("AZUL")) {
            descuento = 0.5;
        }
        else {
            descuento = 1;
        }
        valor_pago = valor_compra - (descuento * valor_compra);
        
        System.out.println("El cliente debe pagar: $"+valor_pago+" y tuvo un porcentaje de descuento del "+descuento*100+"%");
    } 
}
