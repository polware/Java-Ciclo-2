import java.util.Scanner;
public class Numeroprimo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        int num;
        System.out.println("Por favor ingrese un número:");
        num = s.nextInt();
        if (num < 0)
            {
                System.out.println("El número es negativo, por favor ingrese uno positivo.");
            }
        else
            {
                int aux=0, contador=0;
                for (int i = 1; i <= num; i++)
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
	                System.out.println("El número " +num +" SI ES Primo.");
	            }
                else { System.out.println("El número " +num +" NO ES Primo."); }
            }
        s.close();
    }
}
