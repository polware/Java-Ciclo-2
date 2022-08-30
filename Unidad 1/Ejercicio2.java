import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        String nombre;
        double [] notas = new double[3];
        System.out.println("Ingrese nombre de alumno(a): ");
        nombre = s.nextLine();
        double sumatoria = 0, promedio;
        for (int i=0; i<3; i++)
            {
                System.out.println("Ingrese la nota de la evaluación # " +(i+1));
                notas[i] = s.nextDouble();
                sumatoria = sumatoria + notas[i];
            }
        promedio = sumatoria / 3;        
        promedio = Math.round(promedio * 100.0) / 100.0;
        System.out.println("\nEl promedio obtenido es: " +promedio);        
        if (promedio >= 3)
            {
                System.out.println("\nEl/la alumno(a) " +nombre +" APROBÓ la materia.");
            }
        else { System.out.println("\nEl/la alumno(a) " +nombre +" NO APROBÓ la mateira."); }
        s.close();
    }
}
