public class OperacionMatematica {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese dos números: ");    
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
        float result;

        System.out.println("¿Cuál operación desea realizar?");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");    
        int opcion = Integer.parseInt(System.console().readLine());
    
        switch (opcion) {
          case 1:
            result = a + b;
            System.out.println("El resultado de la suma es: " +result);
            break;
    
          case 2:
            result = a - b;
            System.out.println("El resultado de la resta es: " +result);
            break;
    
          case 3:
            result = a * b;
            System.out.println("El resultado de la multiplicación es: " +result);
            break;
    
          case 4:
            result = (float) a / b;
            System.out.println("El resultado de la división es: " +result);
            break;
            
          default: System.out.println("Nota: Por favor ingrese un valor entre 1 y 4.");
        }      
    }        
}