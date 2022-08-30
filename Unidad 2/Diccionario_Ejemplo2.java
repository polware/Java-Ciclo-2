import java.util.*;
public class Diccionario_Ejemplo2 {
    public static void main(String[] args)
    {  
        // Creating an empty Dictionary
        Dictionary<Integer, String> dict = new Hashtable<Integer, String>();
        // Inserting the values into dictionary
        dict.put(10, "Geeks");
        dict.put(15, "4");
        dict.put(20, "Geeks");
        dict.put(25, "Welcomes");
        dict.put(30, "You");  
        // Displaying the Dictionary
        System.out.println("Initial Dictionary is: " + dict);
  
        // Getting the value of 25
        System.out.println("The Value is: " + dict.get(25));
  
        // Getting the value of 10
        System.out.println("The Value is: " + dict.get(10));
    }
}
