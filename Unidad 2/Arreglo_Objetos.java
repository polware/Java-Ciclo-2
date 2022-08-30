// Java program to demonstrate initializing
// an array of objects using constructor
public class Arreglo_Objetos {  
    public static void main(String args[])
    {  
        // Declaring an array of student
        Student[] arr;
  
        // Allocating memory for 2 objects
        // of type student
        arr = new Student[2];
  
        // Initializing the first element
        // of the array
        arr[0] = new Student(1701289270, "Satyabrata");
  
        // Initializing the second element
        // of the array
        arr[1] = new Student(1701289219, "Omm Prasad");
  
        // Displaying the student data
        System.out.println(
            "Datos del estudiante en el Arreglo 0: ");
        arr[0].display();
  
        System.out.println(
            "Datos del estudiante en el Arreglo 1: ");
        arr[1].display();
    }
}  
// Creating a student class with
// id and name as a attributes
class Student {  
    public int id;
    public String name;
  
    // Student class constructor
    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
  
    // display() method to display
    // the student data
    public void display()
    {
        System.out.println("El ID del estudiante es: " + id + " "
                           + "y el nombre es: "
                           + name);
        System.out.println();
    }
}
