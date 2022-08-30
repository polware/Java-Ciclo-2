// Validando si es un número primo usando una función.

import java.util.Scanner;
public class Funcion_primo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int num;
        boolean resultado=false;
        System.out.println("Por favor ingrese un número:");
        num = s.nextInt();
        if (num < 0)
            {
                System.out.println("El número es negativo, por favor ingrese uno positivo.");
            }
        else
            {
                resultado = primo(num);
                if (resultado)
                    {
                        System.out.println("El número " +num +" ES un número Primo");
                    }
                else { System.out.println("El número " +num +" NO ES un número Primo"); }
            }
        s.close();
    }

    public static boolean primo(int a)
    {
        boolean esprimo=false;
        int aux=0, contador=0;
        for (int i = 1; i <= a; i++)
        {          
          contador = 0;
          for(aux=i; aux >= 1; aux--)
	        {
                if(i % aux == 0)
	            {
 		            contador = contador + 1;
	            }
	        }	      
        }
        if (contador == 2)
	        {
	            esprimo = true;
	        }
        return esprimo;
    }
}
