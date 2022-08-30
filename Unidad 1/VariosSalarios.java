// Ejercicio que lee el sueldo de N número de trabajadores y calcula el mayor de todos.

import java.util.Scanner;

public class VariosSalarios {
    public static void main(String[] args) {
        int nt;        
        double sueldo=0, mayor=0;        
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número de trabajadores: ");
        nt = s.nextInt();
        for (int i=0; i < nt; i++)
            {
                System.out.println("Ingrese el sueldo # " +i+1 +": ");
                sueldo = s.nextDouble();
                if (sueldo>mayor)
                    { mayor = sueldo; }
            }
        mayor = (Math.round(mayor));
        System.out.println("El sueldo mayor es: " +mayor);
        s.close();
    }    
}
