class Caja {
    double ancho, alto, largo;
    //Observe este constructor.
    //Toma un objeto de tipo Caja.
    //Este constructor usa un objeto para inicializar otro.
    Caja(Caja ob)
    {
        ancho = ob.ancho;
        alto = ob.alto;
        largo = ob.largo;
    }
    //constructor utilizado cuando todas
    //las dimensiones están especificadas    
    Caja (double w, double h, double d) {
        ancho = w;
        alto = h;
        largo = d;
    }
    double volumen() {
        return ancho * alto * largo;
    }
}

public class Objeto_Caja {
        public static void main(String args[]) {
            Caja miCaja = new Caja(10, 20, 15);
            // creando una copia de miCaja
            Caja miclon = new Caja(miCaja);
            double vol;
            // obtener volumen de miCaja
            vol = miCaja.volumen();
            System.out.println("Volumen de mi Caja es " + vol);
            // obtener volumen de miclon
            vol = miclon.volumen();
            System.out.println("Volumen de mi miclon es " + vol);
        }
}
