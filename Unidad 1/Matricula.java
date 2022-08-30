import java.util.Scanner;

/* Ejercicio de la matrícula de un alumno con sus 4 notas, y nos muestra el promedio (>=5), muestre
si aprobó o no aprobó
*/

public class Matricula {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int matricula;
        double [] nota = new double[4];
        System.out.println("Ingrese la matrícula: ");
        matricula = s.nextInt();
        double sumatoria = 0, promedio;
        for (int i=0; i<=3; i++)
            {
                System.out.println("Ingrese la nota # " +i +" del estudiante:");
                nota[i] = s.nextDouble();
                sumatoria = sumatoria + nota[i];
            }
        promedio = sumatoria / 4;
        System.out.println("\nEl promedio del alumno es: " +promedio);        
        if (promedio >= 5)
            {
                System.out.println("\nEl alumno con matrícula " +matricula +" aprobó el curso.");
            }
        else { System.out.println("\nEl alumno con matrícula " +matricula +" no aprobó el curso."); }
        s.close();
    }
}
