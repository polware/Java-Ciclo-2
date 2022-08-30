class calculator{        
    public int suma(int x, int y) 
        { 
            return x + y; 
        } 
    
    public int resta(int x, int y) 
        { 
            return x - y; 
        } 
    
    public int multiplicacion(int x, int y)
        {
            return x * y;
        }
    
    public float division(float x, float y)
        {
            //float z = (float) x / y;
            return x / y;
        } 
}

public class Calculadora_2 {    
    public static void main(String[] args) {
        calculator caluculator_object = new calculator();
        System.out.println("Por favor ingrese dos números: ");
    
        int a = Integer.parseInt(System.console().readLine());
        int b = Integer.parseInt(System.console().readLine());
    
        System.out.println("¿Cuál operación desea realizar?");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
    
        int n = Integer.parseInt(System.console().readLine());
    
        switch (n) {
          case 1:
            System.out.println("El resultado de la suma es: " +caluculator_object.suma(a, b));
            break;
    
          case 2:
            System.out.println("El resultado de la resta es: " +caluculator_object.resta(a, b));
            break;
    
          case 3:
            System.out.println("El resultado de la multiplicación es: " +caluculator_object.multiplicacion(a, b));
            break;
    
          case 4:
            System.out.println("El resultado de la división es: " +caluculator_object.division(a, b));
            break;
        }
      }
}
