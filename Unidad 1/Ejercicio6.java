import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        int estatura, peso;
        String genero;
        Scanner s = new Scanner(System.in);
        System.out.println("Por favor digite el género sexual (H/M): ");
        genero = s.nextLine();
        System.out.println("Por favor digite la estatura (centímetros): ");
        estatura = s.nextInt();        
        if (genero.equals("H") || genero.equals("h"))
            {
                peso = estatura - 110;
                System.out.println("\nEl peso ideal para el género " +genero +" debe ser: " +peso +" kg.");
            }
        else if (genero.equals("M") || genero.equals("m"))
            {
                peso = estatura - 120;
                System.out.println("\nEl peso ideal para el género " +genero +" debe ser: " +peso +" kg.");
            }
        s.close();
    }
}
