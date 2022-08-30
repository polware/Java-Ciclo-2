public class Herencia {
    public static void main(String args[])
    { 
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}
// Clase base
class Bicycle {    
    public int gear;
    public int speed; 
    // Constructor de la clase Bicycle
    public Bicycle(int gear, int speed)
    {
        this.gear = gear;
        this.speed = speed;
    } 
    // Los 3 métodos de la clase:
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
 
    public void speedUp(int increment)
    {
        speed += increment;
    }
 
    // Método toString() para imprimir
    public String toString()
    {
        return ("El número de cambios son: " + gear + "\n"
                + "La velocidad de la bicileta es: " + speed);
    }
}
 
// Clase derivada
class MountainBike extends Bicycle { 
    // La subclase MountainBike agrega un nuevo campo
    public int seatHeight;
 
    // Constructor de la subclase MountainBike
    public MountainBike(int gear, int speed,
                        int startHeight)
    {
        // Invocamos constructor de la clase base- Bicycle
        super(gear, speed);
        seatHeight = startHeight;
    } 
    // Se agrega otro método en la subclase MountainBike
    public void setHeight(int newValue)
    {
        seatHeight = newValue;
    } 
    // Anulamos el método toString() para mostrar la info adicional    
    @Override public String toString()
    {
        return (super.toString() + "\nLa altura del sillín es: "
                + seatHeight);
    }
}
