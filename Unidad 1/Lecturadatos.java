
public class Lecturadatos {
    public static void main(String[] args) {
        String linea;

        System.out.println("Ingrese un número: ");
        linea = System.console().readLine();
        int var1;
        var1 = Integer.parseInt(linea);

        System.out.println("Ingrese otro número: ");
        linea = System.console().readLine();
        int var2;
        var2 = Integer.parseInt(linea);

        int total;
        total = (2*var1)+var2;

        System.out.println("\nEl primer número es: " +var1);
        System.out.println("\nEl segundo número es: " +var2);
        System.out.println("\nEl doble del primer número " +var1 +"con la suma de " +var2 +" es igual a: " +total);
    }
}
