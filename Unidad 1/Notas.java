import java.util.Scanner;

// Ejercicio que tome nombre y edad, y concatenar la salida

public class Notas {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        String nombre;
        double edad;
        System.out.println("Ingrese el nombre: ");
        nombre = s.nextLine();
        System.out.println("Ingrese la edad: ");
        edad = s.nextDouble();
        System.out.println("El nombre es: " +nombre +" y la edad es: " +edad);
        s.close();
    }
}
