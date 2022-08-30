import java.util.Scanner;
public class Ejercicio4 {    
    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese número para calcular su tabla de multiplicación: ");
        numero = s.nextInt();
        System.out.println("\nLa tabla de multiplicación del número " +numero +" es:");
        for(int i = 1; i <= 10; ++i)
        {
            System.out.printf("%d X %d = %d \n", numero, i, numero * i);
        }
    s.close();
    }
}
