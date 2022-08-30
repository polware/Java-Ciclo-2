import java.util.*; 
public class ArregloLista_2D {
   public static void main(String[] args)  { 
        int num = 3;
        // declare an arrayList of ArrayLists or 2D ArrayList
        ArrayList<ArrayList<Integer>> intList = new ArrayList<ArrayList<Integer>>(num); 
 
        // Create individual elements or ArrayLists and add them to intList as elements
        ArrayList<Integer> list_elem1 = new ArrayList<Integer>(); 
        list_elem1.add(10); 
        intList.add(list_elem1); 
 
        ArrayList<Integer> list_elem2 = new ArrayList<Integer>(); 
        list_elem2.add(20); 
        list_elem2.add(30);
        intList.add(list_elem2); 
 
        ArrayList<Integer> list_elem3 = new ArrayList<Integer>(); 
        list_elem3.add(40); 
        list_elem3.add(50); 
        list_elem3.add(60); 
        intList.add(list_elem3); 
 
        System.out.println("Contenido del ArrayList en 2D:");
        //print the 2D ArrayList or nested ArrayList
       for (int i = 0; i <intList.size(); i++) { 
           for (int j = 0; j <intList.get(i).size(); j++) { 
                 System.out.print(intList.get(i).get(j) + " "); 
            } 
         System.out.println(); 
        } 
    } 
}
