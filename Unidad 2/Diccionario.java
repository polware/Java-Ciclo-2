import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
public class Diccionario {
    public static void main(String[] args) {
        String buscar = "Clase F";
        int valor=0;        
        Dictionary<String, Integer> consumoW = new Hashtable<>();        
        consumoW.put("Clase A", 100);
        consumoW.put("Clase B", 80);
        consumoW.put("Clase C", 60);
        consumoW.put("Clase D", 50);
        consumoW.put("Clase E", 30);
        consumoW.put("Clase F", 10);        
        Enumeration<String> keys1 = consumoW.keys();
        while (keys1.hasMoreElements()) {
            String key = keys1.nextElement();            
           if (key.startsWith(buscar)) {            
                valor = consumoW.get(key);
                System.out.println("Llave: " + key + ", Valor: " + valor);
            }
            else {
                valor = 10;                
            }
        }
        System.out.println("El nuevo valor es: " + valor);

        System.out.println("\nListado de Llaves y Valores:");
        Enumeration<String> keys = consumoW.keys();
        while (keys.hasMoreElements()) {
            System.out.println("Llave: " + keys.nextElement());
        }
        
        Enumeration<Integer> values = consumoW.elements();
        while (values.hasMoreElements()) {
            System.out.println("Valor: " + values.nextElement());
        }
    }
}
