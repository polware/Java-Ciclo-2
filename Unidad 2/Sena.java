import java.util.*;

public class Sena {
    public static void main(String[] args) {    
        String nombre;
        int clave, antiguedad;
        
        System.out.println("***********************************************************");
        System.out.println("** Bienvenido al sistema vacacional de Coca-Cola Company **");
        System.out.println("***********************************************************");
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite el nombre del trabajador: ");
        nombre = sc.nextLine();
        
        System.out.println("¿Cuántos años de servicio tiene el trabajador?");
        antiguedad = Integer.parseInt(System.console().readLine());
        System.out.println("¿Cuál es la clave de su departamento?");
        clave = Integer.parseInt(System.console().readLine());
        
        switch (clave) {
            case 1:
            if(antiguedad == 1)
                System.out.println("El trabajador: " +nombre +"\nTiene derecho a 6 días.");
                else if (antiguedad >=2 && antiguedad <= 6)
                    System.out.println("El trabajador: " +nombre +"\nTiene derecho a 14 días.");
                else if (antiguedad >= 7)
                    System.out.println("El trabajador: " +nombre +"\nTiene derecho a 20 días.");
                else
                    System.out.println("Todavía no tiene derecho a vacaciones.");
            break;
    
            case 2:
                if(antiguedad == 1)
                System.out.println("El trabajador: " +nombre +"\nTiene derecho a 7 días.");
                else if (antiguedad >=2 && antiguedad <= 6)
                    System.out.println("El trabajador: " +nombre +"\nTiene derecho a 15 días.");
                else if (antiguedad >= 7)
                    System.out.println("El trabajador: " +nombre +"\nTiene derecho a 22 días.");
                else
                    System.out.println("Todavía no tiene derecho a vacaciones.");
            break;
    
            case 3:
                if(antiguedad == 1)
                System.out.println("El trabajador: " +nombre +"\nTiene derecho a 10 días.");
                else if (antiguedad >=2 && antiguedad <= 6)
                    System.out.println("El trabajador: " +nombre +"\nTiene derecho a 20 días.");
                else if (antiguedad >= 7)
                    System.out.println("El trabajador: " +nombre +"\nTiene derecho a 30 días.");
                else
                    System.out.println("Todavía no tiene derecho a vacaciones.");
            break;
            
            default: System.out.println("Error: la clave de departamento no existe.");
        }
        sc.close();
    }
}
