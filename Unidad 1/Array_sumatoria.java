// A partir de un array unidimensional de 4 elementos, mostrarlo a partir de una función y hacer el incremento
// (la suma de sus elementos)
import java.util.Scanner;

public class Array_sumatoria {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float [] arreglo = new float[4];
        for (int i=0; i<=3; i++)
            {
                System.out.print("Ingrese valor para posición # " +(i+1) +" del arreglo: ");
                arreglo[i] = s.nextFloat();                
            }
        imprimir_arreglo(arreglo);
        sumatoria(arreglo);
        s.close();
    }

    public static float imprimir_arreglo(float array[])
        {
            System.out.println("\nEl contenido del arreglo es:");
            for (int i=0; i<4; i++)
                {
                    System.out.print("[" +array[i] +"] ");
                }
            return 0;
        }
    
    public static float sumatoria(float array[])
        {
            float sumatoria = 0;                
            for (int i=0; i<=3; i++)
                {
                    sumatoria = sumatoria + array[i];                        
                }
            System.out.print("\nLa sumatoria del arreglo es: " +sumatoria);
            return 0;
        }
}
