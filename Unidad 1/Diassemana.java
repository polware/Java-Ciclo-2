// Programa dado un día de la semana de lunes a viernes y una hora con minutos, nos calcule cuántos minutos faltan para el fin de semana.
// A las 18:00 horas del viernes finaliza el fin de semana
import java.util.Scanner;
public class Diassemana {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String dia;        
        int hora, minutos, minutostotales = 6840, minutosdia = 1440;
        System.out.println("Ingrese un día de la semana (lunes - viernes): ");
        dia = s.nextLine();
        System.out.print("Ingrese la hora (formato 24H): ");
        hora = s.nextInt();
        System.out.print("Ingrese los minutos: ");
        minutos = s.nextInt();
        switch(dia)
            {
                case "lunes":                    
                    minutos = (hora * 60) + minutos;
                    minutos = minutostotales - minutos;
                    System.out.println("Los minutos que faltan para alcanzar el fin de semana son: " +minutos);              
                break;
                
                case "martes":                    
                    minutos = minutosdia + ((hora * 60) + minutos);            
                    minutos = minutostotales - minutos;
                    System.out.println("Los minutos que faltan para alcanzar el fin de semana son: " +minutos);
                break;

                case "miercoles":                    
                    minutos = (minutosdia * 2) + ((hora * 60) + minutos);            
                    minutos = minutostotales - minutos;
                    System.out.println("Los minutos que faltan para alcanzar el fin de semana son: " +minutos);
                break;

                case "jueves":                    
                    minutos = (minutosdia * 3) + ((hora * 60) + minutos);
                    minutos = minutostotales - minutos;
                    System.out.println("Los minutos que faltan para alcanzar el fin de semana son: " +minutos);
                break;

                case "viernes":                    
                    minutos = (minutosdia * 4) + ((hora * 60) + minutos);
                    minutos = minutostotales - minutos;
                    System.out.println("Los minutos que faltan para alcanzar el fin de semana son: " +minutos);
                break;

                default:
                    System.out.println("El día ingresado está fuera del rango Lunes-Viernes");
            }        
        s.close();
    }
}
