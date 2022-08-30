// Desarrollo del RETO # 2 de la Unidad 2:
import java.util.*;
class PrecioTotal{
    // Atributos
    double totalElectrodomesticos=0, totalTelevisiones=0, totalLavadoras=0;
    String s1 = "Electrodomestico";
    String s2 = "Lavadora";
    String s3 = "Television";
    // Constructor
    PrecioTotal(Electrodomestico[] pElectrodomesticos) {
            int tam = pElectrodomesticos.length;
            Electrodomestico[] arreglo;
            for(int i=0; i < tam; i++){
                String nombre = pElectrodomesticos[i].getClass().getSimpleName();
                if(Objects.equals(nombre, s1)){
                    arreglo = new Electrodomestico[tam];
                    arreglo[i] = pElectrodomesticos[i];
                    totalElectrodomesticos = totalElectrodomesticos + arreglo[i].calcularPrecio();
                }
                else if(Objects.equals(nombre, s2)){
                    arreglo = new Lavadora[tam];
                    arreglo[i] = pElectrodomesticos[i];
                    totalLavadoras = totalLavadoras + arreglo[i].calcularPrecio();
                }
                else if(Objects.equals(nombre, s3)){
                    arreglo = new Television[tam];
                    arreglo[i] = pElectrodomesticos[i];
                    totalTelevisiones = totalTelevisiones + arreglo[i].calcularPrecio();
                }                
            }
            totalElectrodomesticos = totalElectrodomesticos + totalTelevisiones + totalLavadoras;
    }
    // Metodos
    public void mostrarTotales() {
        // Mostramos los resultados
        System.out.println("La suma del precio de los electrodomésticos es de " +totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " +totalLavadoras);
        System.out.print("La suma del precio de las televisiones es de " +totalTelevisiones);
    }
}
class Electrodomestico{
        // Constantes y Atributos
        public double precioBase;
        public int peso, adicion;
        public char consumoW;
        // Constructores
        Electrodomestico(){
            this.precioBase = 100.0;
            this.peso = 5;
            this.consumoW = 'F';
            this.adicion = comprobarconsumoW(consumoW);
        }               
        Electrodomestico(Double precioBase, Integer peso){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = 'F';
            adicion = comprobarconsumoW(consumoW);
        }
        Electrodomestico(Double precioBase, Integer peso, char consumoW){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = consumoW;
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
class Lavadora extends Electrodomestico{
        // Constantes y Atributos
        public int carga;
        // Constructores
        Lavadora(){
            this.precioBase = 100.0;
            this.peso = 5;
            this.consumoW = 'F';
            this.carga = 5;
            adicion = comprobarconsumoW(consumoW);
        }
        Lavadora(Double precioBase, Integer peso){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = 'F';
            this.carga = 5;
            adicion = comprobarconsumoW(consumoW);
        }
        Lavadora(Double precioBase, Integer peso, char consumoW, Integer carga){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = consumoW;
            this.carga = carga;
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
class Television extends Electrodomestico{
        // Constantes y Atributos
        public int pulgadas;
        public boolean sintonizadorTDT;
        Television(){
            this.precioBase = 100.0;
            this.peso = 5;
            this.consumoW = 'F';
            this.pulgadas = 20;
            this.sintonizadorTDT = false;
            adicion = comprobarconsumoW(consumoW);
        }
        Television(Double precioBase, Integer peso){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = 'F';
            this.pulgadas = 20;
            adicion = comprobarconsumoW(consumoW);
        }
        Television(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintonizadorTDT){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = consumoW;
            this.pulgadas = pulgadas;
            this.sintonizadorTDT = sintonizadorTDT;
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
public class Reto_2 {
    public static void main(String[] args) {
        // Prueba 1        
        Electrodomestico electrodomesticos[]=new Electrodomestico[5];
        electrodomesticos[0]=new Electrodomestico(200.0, 60, 'C');
        electrodomesticos[1]=new Lavadora(150.0, 30);
        electrodomesticos[2]=new Television(500.0, 80, 'E', 42, false);
        electrodomesticos[3]=new Electrodomestico();
        electrodomesticos[4]=new Electrodomestico(600.0, 20, 'D');
        PrecioTotal solucion1 = new PrecioTotal(electrodomesticos);
        solucion1.mostrarTotales();
        System.out.println();
        /*
        // Prueba 2
        Electrodomestico electrodomesticos2[]=new Electrodomestico[10];
        electrodomesticos2[0]=new Electrodomestico(200.0, 60, 'C');
        electrodomesticos2[1]=new Lavadora(150.0, 30);
        electrodomesticos2[2]=new Television(500.0, 80, 'E', 42, false);
        electrodomesticos2[3]=new Electrodomestico();
        electrodomesticos2[4]=new Electrodomestico(600.0, 20, 'D');
        electrodomesticos2[5]=new Lavadora(300.0, 40, 'Z', 40);
        electrodomesticos2[6]=new Television(250.0, 70);
        electrodomesticos2[7]=new Lavadora(400.0, 100, 'A', 15);
        electrodomesticos2[8]=new Television(200.0, 60, 'C', 30, true);
        electrodomesticos2[9]=new Electrodomestico(50.0, 10);
        PrecioTotal solucion2 = new PrecioTotal(electrodomesticos2);
        solucion2.mostrarTotales();
        System.out.println();
        */
        }
}
