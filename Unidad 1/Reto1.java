// Solución alterna del Reto 1:

import java.lang.Math;
import java.util.Scanner;
public class Reto1 {
    public static void main(String[] args) {
        int pTiempo;
        double pCapital, pInteres;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el tiempo de la inversión: ");
        pTiempo = s.nextInt();
        System.out.print("Ingrese el capital invertido en la exportación: ");
        pCapital = s.nextDouble();
        System.out.print("Ingrese el interés aplicado al capital: ");
        pInteres = s.nextDouble();
        String resultado = compararExportacion(pTiempo, pCapital, pInteres);
        salida(resultado);
        s.close();    
        }
        
        static void salida(String resultado) {
            String aux="0.0";            
            if(resultado.equals(aux)){
                System.out.println("Faltan datos para calcular la diferencia en el total de intereses generados para el proyecto.");
            }
            else{
                System.out.println("La diferencia en el total de intereses generados para el proyecto, si escogemos entre evaluarlo a una tasa de interés Compuesto y evaluarlo a una tasa de interés Simple, asciende a la cifra de: $" +resultado);
            }
         }
        
        public static double calcularInteresCompuesto(int pTiempo, double pCapital, double pInteres) {
            return pCapital * (Math.pow((1 + pInteres), pTiempo) - 1);
        }
        
        public static double calcularInteresSimple(int pTiempo, double pCapital, double pInteres) {
            return pCapital * pInteres * pTiempo;
        }
        
        public static String compararExportacion (int pTiempo, double pCapital, double pInteres) {
            double compararExportacion;
            compararExportacion = calcularInteresCompuesto(pTiempo, pCapital, pInteres) - calcularInteresSimple(pTiempo, pCapital, pInteres);            
            String respuesta = Double.toString(compararExportacion);
            return respuesta;
        }
}
