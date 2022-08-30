import java.util.*;

public class Lista_Array {
  public static void main(String args[]){  
    //Creando la lista de frutas
    List<String> list1=new ArrayList<String>();  
    list1.add("Mango");  
    list1.add("Manzana");  
    list1.add("Banano");  
    list1.add("Peras");  
    //Sorting the list  
    Collections.sort(list1);  
     //Recorremos la Lista para imprimirla
    for(String fruit:list1)  
      System.out.println(fruit);  
    
    System.out.println("\nOrdenando números:");  
    //Creando la lista de números
    List<Integer> list2=new ArrayList<Integer>();  
    list2.add(21);  
    list2.add(11);  
    list2.add(51);  
    list2.add(1);  
    //Ordenando la lista
    Collections.sort(list2);  
     //Recorremos la lista
    for(Integer number:list2)  
      System.out.println(number);  
   }  
}
