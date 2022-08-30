// Ejercicio básico sobre una clase
import java.util.Scanner;
public class Clase_Main {
    String color = "Verde";
    String tamaño = "Grande";
    String estado = "Solido";
    String textura = "Suave";
    String superficie = "Plana";

    static void myMetodo(){
        System.out.println("\nProbando el Método");
    }

    public static void cambio(String nColor){
        Clase_Main nAtributo = new Clase_Main();
        nAtributo.color = nColor;
        System.out.println("El nuevo color es: " +nAtributo.color);
    }

    public static void main (String[] args){
            Clase_Main myObjeto = new Clase_Main();
            Scanner input = new Scanner(System.in);
            System.out.print("Digite el nuevo Estado: ");
            myObjeto.estado = input.nextLine();
            System.out.println("\nListado de los Atributos:");
            System.out.println(myObjeto.color);
            System.out.println(myObjeto.tamaño);
            System.out.println(myObjeto.estado);
            System.out.println(myObjeto.textura);
            System.out.println(myObjeto.superficie);
            myMetodo();
            cambio("negro");
            input.close();
    }    
}
