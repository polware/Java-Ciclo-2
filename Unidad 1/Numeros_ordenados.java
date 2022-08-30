public class Numeros_ordenados {
    public static void main(String[] args) {
        System.out.println("Vámos a ordenar 3 números introducidos");
        System.out.println("--------------------------------------");
    
        System.out.print("Introduce el primer número: ");
        int num1 = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el segundo número: ");
        int num2 = Integer.parseInt(System.console().readLine());
        int aux = 0;
    
        if (num2 < num1) {
          aux = num1;
          num1 = num2;
          num2 = aux;
        }
    
        System.out.print("Introduce el tercer número: ");
        int num3 = Integer.parseInt(System.console().readLine());
    
        if ((num3) < (num1)) {
          aux = num1;
          num1 = num3;
          num3 = num2;
          num2 = aux;
        } else if ((num3) < (num2)) {
          aux = num2;
          num2 = num3;
          num3 = aux;
        }
    
        System.out.print("Números introducidos ordenados: ");
        System.out.print(num1 + ", " + num2 + ", " + num3);
      }
}
