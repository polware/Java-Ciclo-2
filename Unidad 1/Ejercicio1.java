/* Realizar la suma, la resta, la división y la multiplicación de dos números leídos por teclado y mostrar en pantalla “La <operación> de <número 1>
y <número 2> es igual a <resultado> ”
*/
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
    int num1, num2;
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese el primer número: ");
    num1 = s.nextInt();
    System.out.println("Ingrese el segundo número: ");
    num2 = s.nextInt();
    float div = (float) num1/num2;
    System.out.println("\nLa operación de SUMA entre " +num1 +" y " +num2 +" es igual a: " +(num1+num2));
    System.out.println("La operación de RESTA entre " +num1 +" y " +num2 +" es igual a: " +(num1-num2));
    System.out.println("La operación de MULTIPLICACIÓN entre " +num1 +" y " +num2 +" es igual a: " +(num1*num2));
    System.out.println("La operación de DIVISIÓN entre " +num1 +" y " +num2 +" es igual a: " +div);
    s.close();
    }
}
