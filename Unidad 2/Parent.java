
// Clase ejemplo de Herencia - Inheritance

public class Parent {
    
    protected int age;

    public static void main(String[] args) {    
        Parent parent = new Parent();
        Child child = new Child();

        parent.age = 35;
        child.age = 12;
        child.gender = "chico";
        child.askGender();
        int compareAge = child.compare(parent);
        System.out.println(compareAge);
    }
}

class Child extends Parent {
    String gender;

    @Override
    protected void finalize() throws Throwable {
        try {
 
            System.out.println("inside Child's finalize()");
        }
        catch (Throwable e) { 
            throw e;
        }
        finally { 
            System.out.println("Calling finalize method of the Child class");
            //super.finalize();
        }          
    }

    int compare(Parent parent){
        try {
            if(age >= parent.age){
                throw new IllegalStateException("El hijo no puede ser mayor que el Padre: ");                
            }
            return age - parent.age;
        } finally {
            System.out.println("Edad del hijo: " +age);
        }
    }
    
    String askGender(){
        String aux1 = "chico";
        String aux2 = "chica";
        if(gender.equals(aux1)) {
                gender = "Masculino";
                System.out.println("El género es: " +gender);
            }            
        else if(gender.equals(aux2)) {
            gender = "Femenino";
            System.out.println("El género es: " +gender);
        }            
        else gender = "No definido";

        return gender;    
    }
}

class Son extends Child{
    @Override
    final String askGender(){
        return gender = "";
    }
}

class Daugther extends Child{
    @Override
    final String askGender() {
        return gender = "";
    }
}