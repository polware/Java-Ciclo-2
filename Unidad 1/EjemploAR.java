// Ejercicio con Arrays, con la suma de sus elementos

public class EjemploAR {
    public static void main(String[] args) {        
        // Arreglo de 4 elementos        
        int [] n = {15, 7, 5, 2};
        int temp;
        System.out.println("Los valores del Array son: ");
        for (int i=0; i<=3; i++)
        {
            System.out.println("\nEl valor en la posición " +i +" es: " +n[i]);
            temp = n[i] + n[3];
            System.out.println("La suma del elemento " +n[i] +" más el elemento: " +n[3] +" es igual a: " +temp);
        }
    }
}
