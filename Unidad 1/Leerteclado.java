// Leer un número del teclado
import java.util.Scanner;
public class Leerteclado {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese un número: ");
        Scanner input = new Scanner(System.in);
        int numero = input.nextInt();
        if (numero % 2 ==0){
            System.out.println("El número " +numero +" es divisible por 2"); 
        }
        else {
            System.out.println("El número " +numero +" NO es divisible por 2");
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String myString1 = sc.nextLine();
        System.out.println("Ingrese su apellido: ");
        String myString2 = sc.nextLine();
        System.out.println("Su nombre completo es: " + myString1 +" " +myString2);
        input.close();
        sc.close();
    }      
}
