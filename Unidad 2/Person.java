import java.util.HashMap;

public class Person {
    private String surname;
    private String name;

    public Person (String surname, String name){
        this.surname = surname;
        this.name = name;        
    }

    public static void main(String[] args){
        HashMap<Person, String> personMap = new HashMap<>();
        Person person1 = new Person("Smith", "John");
        Person person2 = new Person("Hawking", "Stephen");

        personMap.put(person1, "person1");
        System.out.println("Valor de la persona 1: ");
        System.out.println(personMap.get(person1));
        System.out.println("Valor de la persona 2: ");
        System.out.println(personMap.get(person2));        
    }
}
