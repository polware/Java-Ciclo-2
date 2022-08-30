import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        String nombre;        
        double horas, sueldo;
        Scanner s = new Scanner(System.in);        
        System.out.println("Ingrese nombre del trabajador: ");
        nombre = s.nextLine();
        System.out.println("Ingrese las horas que trabajó en el mes: ");
        horas = s.nextDouble();
        sueldo = horas * 30000;
        System.out.println("\nEl sueldo mensual del trabajador " +nombre +" corresponde al valor de $" +sueldo);
        s.close();
    }
}
