import java.util.Scanner;
import java.util.Random;
public class Ejercicio5 {
    public static void main(String[] args) {
        int numero, encontrado=0;
        Random rand = new Random();
        int aleatorio = rand.nextInt(101);
        Scanner s = new Scanner(System.in);
        while (encontrado == 0)
        {
            System.out.println("Ingrese un número para adivinar el valor aleatorio: ");
            numero = s.nextInt();
            if (numero < aleatorio)
                {
                    System.out.println("El número que buscas es mayor. ¡Sigue intentado! ");
                    System.out.println("");
                    encontrado = 0;
                }
            else if (numero > aleatorio)
                {   System.out.println("El número que buscas es menor. ¡Sigue intentado! ");
                    System.out.println("");
                    encontrado = 0;
                }
            else if (numero == aleatorio)
                {
                    System.out.println("\nHas encontrado el número aleatorio: " +numero);
                    encontrado = 1;
                }
        }        
        s.close();
    }
}
