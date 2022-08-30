// A partir de un sueldo aplicar aumento del 20% si salario es menor a 5.000 y un 12% en caso contrario. Imprimir la salida.

import java.util.Scanner;
public class SueldoTrabajador {
    public static void main(String[] args) {
        String nombre;        
        double nuevosueldo;
        Scanner s = new Scanner(System.in);        
        System.out.println("\nIngrese el nombre del trabajador: ");
        nombre = s.nextLine();
        System.out.println("Ingrese el sueldo: ");
        double sueldo = s.nextFloat();
        if (sueldo >= 5000)
            {
                nuevosueldo = sueldo*1.12;
                System.out.println("\nEl nombre del trabajador es: " +nombre);
                System.out.println("El salario es " +sueldo +" y tiene incremento del 12% por valor: " +nuevosueldo);
            }
        else { nuevosueldo = sueldo*1.20;
               System.out.println("\nEl nombre del trabajador es: " +nombre);
               System.out.println("El salario es " +sueldo +" y tiene incremento del 20% por valor: " +nuevosueldo);
             }
        s.close();
    }
}
