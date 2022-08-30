public class Condicional {
    public static void main(String[] args) {
        System.out.println("Ciclo FOR de los números del 1 al 10:");
        for(int i=1;i<=10;i++){  
            //System.out.println(i);
            System.out.print(i+" ");
        }
        int j= 1, result;
        System.out.println("La tabla de multiplicación del 2: ");
        while(j<=10){
            result = 2 * j;
            System.out.println(result);
            j++;
        }
        int resultado=0, num= 2021;
        for(int i=1; i<=3; i++){
            //resultado = resultado + num;
            resultado += num;
        }
        System.out.println("La triple suma del número 2021 es igual a: " +resultado);
    }   
}
