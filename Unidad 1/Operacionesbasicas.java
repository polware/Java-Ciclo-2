// Mostrar en pantalla los resultados de las 4 operaciones básicas a partir de dos números.
import java.util.Scanner;
public class Operacionesbasicas {    
    public static void main(String[] args) {        
        int osuma, oresta, omultiplicacion;
        float odivision;
        int a, b;        
        a = leer_numero("a");
        b = leer_numero("b");
        osuma = suma(a,b);
        oresta = resta(a,b);
        omultiplicacion = multiplicacion(a,b);
        odivision = division(a,b);
        imprimir_resultados(osuma, oresta, omultiplicacion, odivision);
    }
    public static int leer_numero(String nombre_numero)
        {
            Scanner s = new Scanner(System.in);
            int numero;
            System.out.println("Ingrese un número para la variable " +nombre_numero +" : ");
            numero = s.nextInt();
            s.close();
            return numero;
        }
    
    public static int suma(int a, int b)
        {
            int suma;
            suma = a + b;
            return suma;
        }
    
    public static int resta(int a, int b)
        {
            int resta;
            resta = a - b;
            return resta;
        }
    
    public static int multiplicacion(int a, int b)
        {
            int multiplicacion;
            multiplicacion = a * b;
            return multiplicacion;
        }
    
    public static float division(float a, float b)
        {
            float division=0;
            if (b != 0)
                {
                    division = (float) (a / b);                                        
                }            
            return division;
        }
    
    public static void imprimir_resultados(int sum, int res, int mult, float div)
        {
            System.out.println("\nLos resultados de las operaciones son las siguientes: \n");

            System.out.println("El resultado de la suma es: " +sum);
            System.out.println("El resultado de la resta es: " +res);
            System.out.println("El resultado de la multiplicación es: " +mult);
            if (div == 0)
                {
                    System.out.println("No es posible dividir por cero.");
                }
            else { System.out.println("El resultado de la división es: " +div);  }            
        }
}
