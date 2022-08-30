import java.util.Arrays;

public class Anagram {
    
    public static void main(String args[])
    {
        String arr1[] = { "bored", "cat" };
        String arr2[] = { "act", "robed" };
        
        if (areAnagram(arr1, arr2))
            System.out.println("The two arrays ARE anagram.");
        else
            System.out.println("The two arrays are NOT anagram.");
    }

    static boolean areAnagram(String[] array1, String[] array2)
    {
        boolean result = false;
        char str1[], str2[];
        int size1, size2, aux = 0, sum = 0;
        int t_arr1 = array1.length;
        int t_arr2 = array2.length;
        for (int c = 0; c < t_arr1; c++){
            str1 = array1[c].toCharArray();            
            size1 = str1.length;
            Arrays.sort(str1);
            for (int d = 0; d < t_arr2; d++){
                str2 = array2[d].toCharArray();
                size2 = str2.length;
                Arrays.sort(str2);
                if (size1 == size2) {
                    for (int i = 0; i < size1; i++)
                        if (str1[i] == str2[i])
                            aux += 1;
                }
                if(aux == size2){
                    sum +=1;
                }                    
            }
            aux = 0;
        }
        System.out.println(sum);
        if(sum == t_arr1 || sum == t_arr2)
            result = true;
         
        return result;
    }
}
