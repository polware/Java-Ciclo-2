// Desarrollo del RETO # 2 de la Unidad 2:
import java.util.*;
class PrecioTotal2{
    // Atributos
    double totalElectrodomesticos=0, totalTelevisiones=0, totalLavadoras=0;
    String s1 = "Electrodomestico2";
    String s2 = "Lavadora2";
    String s3 = "Television2";
    // Constructor
    PrecioTotal2(Electrodomestico2[] pElectrodomesticos) {
            int tam = pElectrodomesticos.length;
            for(int i=0; i < tam; i++){
                String nombre = pElectrodomesticos[i].getClass().getSimpleName();
                if(Objects.equals(nombre, s1)){
                    Electrodomestico2 electro = new Electrodomestico2(pElectrodomesticos[i]);
                    totalElectrodomesticos = totalElectrodomesticos + electro.calcularPrecio();
                }
                else if(Objects.equals(nombre, s2)){
                    Lavadora2 lava = new Lavadora2(pElectrodomesticos[i]);
                    totalLavadoras = totalLavadoras + lava.calcularPrecio();
                }
                else if(Objects.equals(nombre, s3)){
                    Television2 tv = new Television2(pElectrodomesticos[i]);
                    totalTelevisiones = totalTelevisiones + tv.calcularPrecio();
                }
            }
            totalElectrodomesticos = totalElectrodomesticos + totalTelevisiones + totalLavadoras;
    }
    // Metodos
    public void mostrarTotales2() {
        // Mostramos los resultados
        System.out.println("La suma del precio de los electrodomésticos es de " +totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " +totalLavadoras);
        System.out.print("La suma del precio de las televisiones es de " +totalTelevisiones);
    }
}
class Electrodomestico2{
        // Constantes y Atributos
        public double precioBase;
        public int peso, pulgadas, carga, adicion;
        public char consumoW;
        public boolean sintonizadorTDT;
        // Constructores
        public Electrodomestico2(){
            precioBase = 100.0;
            peso = 5;
            consumoW = 'F';
            carga = 5;
            pulgadas = 20;
            sintonizadorTDT = false;
            adicion = comprobarconsumoW(consumoW);
        }
        public Electrodomestico2(Electrodomestico2 ob){
            precioBase = ob.precioBase;
            peso = ob.peso;
            consumoW = ob.consumoW;
            carga = ob.carga;
            pulgadas = ob.pulgadas;
            sintonizadorTDT = ob.sintonizadorTDT;
            adicion = comprobarconsumoW(consumoW);
        }
        public Electrodomestico2(Double precio, Integer p){
            precioBase = precio;
            peso = p;
            consumoW = 'F';
            adicion = comprobarconsumoW(consumoW);
        }
        public Electrodomestico2(Double precio, Integer p, char cons){
            precioBase = precio;
            peso = p;
            consumoW = cons;
            adicion = comprobarconsumoW(consumoW);
        }
        public Electrodomestico2(Double precio, Integer p, char cons, Integer crg){
            // Clase Extendida Lavadora
            precioBase = precio;
            peso = p;
            consumoW = cons;
            carga = crg;
            adicion = comprobarconsumoW(consumoW);
        }
        public Electrodomestico2(Double precio, Integer p, char cons, Integer pul, boolean TDT){
            // Clase Extendida Television
            precioBase = precio;
            peso = p;
            consumoW = cons;
            pulgadas = pul;
            sintonizadorTDT = TDT;
            adicion = comprobarconsumoW(consumoW);
        }
        // Metodos
        public int comprobarconsumoW(char consumoW){
            adicion=0;
            boolean encont = false;
            Dictionary<Character, Integer> dicc = new Hashtable<Character, Integer>();
            dicc.put('A', 100);
            dicc.put('B', 80);
            dicc.put('C', 60);
            dicc.put('D', 50);
            dicc.put('E', 30);
            dicc.put('F', 10);
            Enumeration<Character> llaves = dicc.keys();
            while (llaves.hasMoreElements()) {
                Character key = llaves.nextElement();
                if(key.equals(consumoW)){
                    adicion = dicc.get(key);
                    encont = true;
                }
            }
            if (Boolean.FALSE.equals(encont)){
                adicion = adicion + 10;
            }
            return adicion;
        }
        public Double calcularPrecio(){
            if(peso >= 0 && peso < 19){
                adicion = adicion + 10;
            }
            else if(peso >= 19 && peso < 49){
                adicion = adicion + 50;
            }
            else if(peso >= 49 && peso < 79){
                adicion = adicion + 80;
            }
            else if(peso >= 79){
                adicion = adicion + 100;
            }
            return precioBase + adicion;
        }
}
class Lavadora2 extends Electrodomestico2{
        // Constantes y Atributos
        // Constructores
        public Lavadora2(){
            carga = 5;
            adicion = comprobarconsumoW(consumoW);
        }
        public Lavadora2(Electrodomestico2 ob){
            precioBase = ob.precioBase;
            peso = ob.peso;
            consumoW = ob.consumoW;
            carga = ob.carga;
            adicion = comprobarconsumoW(consumoW);
        }
        public Lavadora2(Double precioBase, Integer peso){
            super(precioBase, peso);
            consumoW = 'F';
            carga = 5;
            adicion = comprobarconsumoW(consumoW);
        }
        public Lavadora2(Double precioBase, Integer peso, char consumoW, Integer carga){
            super(precioBase, peso, consumoW, carga);
            adicion = comprobarconsumoW(consumoW);
        }
        // Métodos
        public Double calcularPrecio(){
            if(peso >= 0 && peso < 19){
                adicion = adicion + 10;
            }
            else if(peso >= 19 && peso < 49){
                adicion = adicion + 50;
            }
            else if(peso >= 49 && peso < 79){
                adicion = adicion + 80;
            }
            else if(peso >= 79){
                adicion = adicion + 100;
            }
            if(carga > 30){
                adicion = adicion + 50;
            }
            return precioBase + adicion;
        }
}
class Television2 extends Electrodomestico2{
        // Constantes y Atributos
        public Television2(){
            pulgadas = 20;
            sintonizadorTDT = false;
            adicion = comprobarconsumoW(consumoW);
        }
        public Television2(Electrodomestico2 ob){
            precioBase = ob.precioBase;
            peso = ob.peso;
            consumoW = ob.consumoW;
            pulgadas = ob.pulgadas;
            sintonizadorTDT = ob.sintonizadorTDT;
            adicion = comprobarconsumoW(consumoW);
        }
        public Television2(Double precioBase, Integer peso){
            super(precioBase, peso);
            consumoW = 'F';
            pulgadas = 20;
            adicion = comprobarconsumoW(consumoW);
        }
        public Television2(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintonizadorTDT){
            super(precioBase, peso, consumoW, pulgadas, sintonizadorTDT);
            adicion = comprobarconsumoW(consumoW);
        }
        // Métodos
        public Double calcularPrecio(){
            if(peso >= 0 && peso < 19){
                adicion = adicion + 10;
            }
            else if(peso >= 19 && peso < 49){
                adicion = adicion + 50;
            }
            else if(peso >= 49 && peso < 79){
                adicion = adicion + 80;
            }
            else if(peso >= 79){
                adicion = adicion + 100;
            }
            if(pulgadas > 40){
                precioBase = precioBase + (precioBase * 0.3);
            }
            if (Boolean.TRUE.equals(sintonizadorTDT)){
                adicion = adicion + 50;
            }
            return precioBase + adicion;
        }
}
// Fin de la solución
public class App {
    public static void main(String[] args) {
        /*
        // Prueba 1
        Electrodomestico2 electrodomesticos[]=new Electrodomestico2[5];
        electrodomesticos[0]=new Electrodomestico2(200.0, 60, 'C');
        electrodomesticos[1]=new Lavadora2(150.0, 30);
        electrodomesticos[2]=new Television2(500.0, 80, 'E', 42, false);
        electrodomesticos[3]=new Electrodomestico2();
        electrodomesticos[4]=new Electrodomestico2(600.0, 20, 'D');
        PrecioTotal2 solucion1 = new PrecioTotal2(electrodomesticos);
        solucion1.mostrarTotales2();
        System.out.println();
        */
        // Prueba 2
        Electrodomestico2 electrodomesticos2[]=new Electrodomestico2[10];
        electrodomesticos2[0]=new Electrodomestico2(200.0, 60, 'C');
        electrodomesticos2[1]=new Lavadora2(150.0, 30);
        electrodomesticos2[2]=new Television2(500.0, 80, 'E', 42, false);
        electrodomesticos2[3]=new Electrodomestico2();
        electrodomesticos2[4]=new Electrodomestico2(600.0, 20, 'D');
        electrodomesticos2[5]=new Lavadora2(300.0, 40, 'Z', 40);
        electrodomesticos2[6]=new Television2(250.0, 70);
        electrodomesticos2[7]=new Lavadora2(400.0, 100, 'A', 15);
        electrodomesticos2[8]=new Television2(200.0, 60, 'C', 30, true);
        electrodomesticos2[9]=new Electrodomestico2(50.0, 10);
        PrecioTotal2 solucion2 = new PrecioTotal2(electrodomesticos2);
        solucion2.mostrarTotales2();
        System.out.println();
        
        }
}
