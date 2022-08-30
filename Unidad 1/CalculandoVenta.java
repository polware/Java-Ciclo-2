// Ejercicio que pide precio de 4 boletos, muestre cuántos se vendieron por cada uno y el valor de la compra

import java.util.Scanner;
import java.util.Arrays;

public class CalculandoVenta {
    public static void main(String[] args) {
        int [][] boletos = new int[4][2];
        int total = 0;
        Scanner input = new Scanner(System.in);        
        for (int i=0; i<4; i++)
            {
                System.out.println("Digite el valor del boleto # " +(i+1) +" : ");
                boletos[i][0] = input.nextInt();
                System.out.println("Digite la cantidad: ");
                boletos[i][1] = input.nextInt();
                total = total + (boletos[i][0] * boletos[i][1]);
            }
        System.out.println("\nResumen de los boletos: ");
        System.out.println(Arrays.deepToString(boletos));
        System.out.println("");
        for (int j=0; j<4; j++)
            {
                System.out.println("El subtotal del boleto # " +(j+1) +" es: $" +(boletos[j][0]*boletos[j][1]));
            }
            System.out.println("\nEl valor total de la venta es: $" +total);
        input.close();
    }
}
