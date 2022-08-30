/* Generar un menu de calculo de areas, debe contener el cuadrado, rectangulo y triangulo
*/
import java.util.Scanner;
public class Calculo_Areas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lado=0, ancho=0, largo=0, base=0, altura=0;
        System.out.print("Escoja una opcion del menu\n\s1 - Cuadrado\n\s2 - Rectangulo\n\s3 - Triangulo\n\s>>> ");
        int opcion = sc.nextInt();
        switch(opcion){
            case 1:
            System.out.print("Ingrese valor de un lado (cm): ");
            lado = sc.nextDouble();
            System.out.println("El área del cuadrado es: "+(lado*lado)+" cm²");break;

            case 2:
            System.out.print("Ingrese valor del largo (cm): ");
            largo = sc.nextDouble();
            System.out.print("Ingrese valor del ancho (cm): ");
            ancho = sc.nextDouble();
            System.out.println("El área del rectangulo es: "+(largo*ancho)+" cm²");break;

            case 3:
            System.out.print("Ingrese valor de la altura (cm): ");
            altura = sc.nextDouble();
            System.out.print("Ingrese valor de la base (cm): ");
            base = sc.nextDouble();
            System.out.println("El área del traingulo es: "+(base*altura/2)+" cm²");break;

            default: System.out.println("La opcion seleccionada es incorrecta.");break;
        }
        sc.close();
    }
}
