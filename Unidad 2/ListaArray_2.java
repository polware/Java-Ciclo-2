import java.util.*;

public class ListaArray_2 {
    public static void main(String[] args) {  
        //Creando lista para libros
        List<Libro> list=new ArrayList<Libro>();  
        //Creamos los libros en la lista
        Libro b1 = new Libro(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        Libro b2 = new Libro(102,"Communicación de Datos y Networking","Forouzan","Mc Graw Hill",4);  
        Libro b3 = new Libro(103,"Sistema Operativo","Galvin","Wiley",6);  
        //Agregamos libros a la lista
        list.add(b1);  
        list.add(b2); 
        list.add(b3);
        System.out.println("ID | Nombre | Autor | Editor | Cantidad");
        //Recorremos la Lista
        for(Libro b:list){  
            System.out.println(b.id+" - "+b.nombre+" - "+b.autor+" - "+b.editor+" - "+b.cantidad);
        }  
    }  
}
class Libro {
    int id;  
    String nombre, autor, editor;  
    int cantidad;  
    public Libro(int id, String nombre, String autor, String editor, int cantidad) {  
        this.id = id;  
        this.nombre = nombre;  
        this.autor = autor;  
        this.editor = editor;  
        this.cantidad = cantidad;  
    }  
}
