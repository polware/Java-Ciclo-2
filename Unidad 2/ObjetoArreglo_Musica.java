
public class ObjetoArreglo_Musica {
    public static void main(String args[]) {             
            CDlist[] arr;
            String autor, titulo;
            int pista;
            arr = new CDlist[3];
            for(int i=0; i < 3; i++){
                System.out.print("Por favor ingrese el número de pista: ");
                pista = Integer.parseInt(System.console().readLine());
                System.out.print("Por favor ingrese el nombre del autor: ");
                autor = System.console().readLine();
                System.out.print("Por favor ingrese el título de la canción: ");
                titulo = System.console().readLine();
                arr[i] = new CDlist(pista, autor, titulo);
            }            
            for(int i=0; i < 3; i++){
                System.out.println("Contenido de la lista MP3 No. " +i +" es:");
                arr[i].display();
            }
        }
}
class CDlist {
    public int numPista;
    public String autor, titulo;
    // Constructor
    CDlist(int pista, String autor, String titulo)
    {
        this.numPista = pista;
        this.autor = autor;
        this.titulo = titulo;
    }  
    // display() method to display data    
    public void display()
    {
        System.out.println("Número de pista: " +numPista + " Autor: "+autor +" Nombre de la canción: "+titulo);
        System.out.println();
    }
}
