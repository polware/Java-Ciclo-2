// Check whether two strings are anagram of each other

import java.util.*;

public class CodeChallenge3 {
    
    public static boolean isAnagram(String a, String b)
    {
        // Comprueba si la longitud de ambos arrays es igual
        if (a.length() != b.length()) {
            return false;
        }
        // Crea un HashMap que contiene el carácter como clave, y el Entero como valor.
        // Guardamos el carácter como Clave y el recuento de caracteres como valor.
        HashMap<Character, Integer> map = new HashMap<>();
        // Loop over all character of String a and put in HashMap.
        for (int i = 0; i < a.length(); i++) {
            // Check if HashMap already contain current character or not
            if (map.containsKey(a.charAt(i))) {
                // If contains increase count by 1 for that character
                map.put(a.charAt(i),
                        map.get(a.charAt(i)) + 1);
            }
            else {
                // else put that character in map and set
                // count to 1 as character is encountered
                // first time
                map.put(a.charAt(i), 1);
            }
        }
        // Now loop over String b
        for (int i = 0; i < b.length(); i++) {
            // Check if current character already exists in
            // HashMap/map
            if (map.containsKey(b.charAt(i))) {
                // If contains reduce count of that character by 1 to indicate that current
                // character has been already counted as idea here is to check if in last count of
                // all characters in last is zero which means all characters in String a are
                // present in String b.
                map.put(b.charAt(i),
                        map.get(b.charAt(i)) - 1);
            } else {
                  return false;
            }
        }
        // Extract all keys of HashMap/map
        Set<Character> keys = map.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : keys) {
            if (map.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }
    public static void main(String[] args)
    {
        String str1 = "bored cat";
        String str2 = "act robed";        
        boolean result = isAnagram(str1, str2);
        System.out.println(result);
        if (isAnagram(str1, str2))
            System.out.print("Las dos cadenas son anagramas.");
        else
            System.out.print("Las dos cadenas NO SON anagramas.");
    }
}
