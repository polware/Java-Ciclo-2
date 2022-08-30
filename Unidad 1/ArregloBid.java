// Ejercicio con un arreglo bidimensional

import java.util.Arrays;

public class ArregloBid {
    public static void main(String[] args) {        
        //int[][] arr = new int[2][2];
        int[][] arr = {
            {3, 6, 9}, 
            {2, 4, 6}, 
            {0, 10, 20}, 
            };
        //System.out.println(Arrays.deepToString(arr));
            /*
            for (int i=0; i<3; i++)
            {
                for (int j=0; j<3; j++)
                {
                    System.out.println("Contenido de fila: " +i +" y columna: " +j +" es: " +arr[i][j]);
                }
            }
        */
        for (int f=0; f<3; f++)
            {
                for (int c=0; c<3; c++)
                    {
                        System.out.print(arr[f][c] +" ");
                    }
                System.out.println("");
            }
    }
}
