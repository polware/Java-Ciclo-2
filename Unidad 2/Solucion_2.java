// Solución elaborada por el tutor para el RETO # 2:
class PrecioTotal1{
    // Atributos
    private double totalElectrodomesticos, totalTelevisiones, totalLavadoras;
    private Electrodomestico1[] listaElectrodomesticos;    
    // Constructor
    PrecioTotal1(Electrodomestico1[] pElectrodomesticos) {
            listaElectrodomesticos = pElectrodomesticos;            
    }
    // Metodos
    public void mostrarTotales() {
        // Mostramos los resultados
        totalElectrodomesticos = 0;
        for (int i=0; i < listaElectrodomesticos.length; i++){
            totalElectrodomesticos += listaElectrodomesticos[i].calcularPrecio();
            if(listaElectrodomesticos[i] instanceof Lavadora1){
                totalLavadoras += listaElectrodomesticos[i].calcularPrecio();
            }
            else if(listaElectrodomesticos[i] instanceof Television1){
                totalTelevisiones += listaElectrodomesticos[i].calcularPrecio();
            }
        }
        System.out.println("La suma del precio de los electrodomésticos es de " +totalElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " +totalLavadoras);
        System.out.print("La suma del precio de las televisiones es de " +totalTelevisiones);
    }
}
class Electrodomestico1{
        // Constantes
        protected final static Double PRECIO_BASE = 100.0;
        protected final static Integer PESO_BASE = 5;
        protected final static char CONSUMO_W = 'F';
        //Atributos
        protected double precioBase;
        protected Integer peso;
        protected char consumoW;
        // Constructores
        public Electrodomestico1(){
            this(PRECIO_BASE, PESO_BASE, CONSUMO_W);
        }

        public Electrodomestico1(Double precioBase, Integer peso){
            this(precioBase, peso, CONSUMO_W);
        }

        public Electrodomestico1(Double precioBase, Integer peso, char consumoW){
            this.precioBase = precioBase;
            this.peso = peso;
            this.consumoW = consumoW;
            comprobarconsumoW(consumoW);
        }
        // Metodos
        public void comprobarconsumoW(char consumoW){
            if (consumoW >= 65 && consumoW <= 70){
                this.consumoW = consumoW;
            }
            else {
                this.consumoW = CONSUMO_W;
            }            
        }

        public Double calcularPrecio(){
            double adicion = 0;
            switch(consumoW)
            {
                case 'A':                    
                    adicion += 100;                    
                break;
                
                case 'B':                    
                    adicion += 80;                    
                break;

                case 'C':                    
                    adicion += 60;                                        
                break;

                case 'D':                    
                    adicion += 50;                    
                break;

                case 'E':                    
                    adicion += 30;                    
                break;
                    
                case 'F':                    
                    adicion += 10;                    
                break;

                default:
                    adicion += 10;
            }
            
            if(peso >= 0 && peso < 19){
                adicion += 10;
            }
            else if(peso >= 19 && peso < 49){
                adicion += 50;
            }
            else if(peso >= 49 && peso < 79){
                adicion += 80;
            }
            else if(peso >= 79){
                adicion += 100;
            }
            return precioBase + adicion;
        }
}

class Lavadora1 extends Electrodomestico1{
        // Constantes
        protected final static Integer CARGA_BASE = 5;
        //Atributos
        private Integer carga;
        // Constructores
        public Lavadora1(){
            this(PRECIO_BASE, PESO_BASE, CONSUMO_W, CARGA_BASE);
        }
        
        public Lavadora1(Double precioBase, Integer peso){
            this(precioBase, peso, CONSUMO_W, CARGA_BASE);
        }

        public Lavadora1(Double precioBase, Integer peso, char consumoW, Integer carga){
            super(precioBase, peso, consumoW);
            this.carga = carga;
        }
        // Métodos
        public Double calcularPrecio(){
            double precio = super.calcularPrecio();
            if(carga > 30){
                precio += 50;
            }
            return precio;
        }
}

class Television1 extends Electrodomestico1{
        // Constantes
        protected final static Integer PULGADAS_BASE = 20;
        //Atributos
        private Integer pulgadas;
        private boolean sintonizadorTDT;

        public Television1(){
            this(PRECIO_BASE, PESO_BASE, CONSUMO_W, PULGADAS_BASE, false);
        }

        public Television1(Double precioBase, Integer peso){
            this(precioBase, peso, CONSUMO_W, PULGADAS_BASE, false);
        }
        
        public Television1(Double precioBase, Integer peso, char consumoW, Integer pulgadas, boolean sintonizadorTDT){
            super(precioBase, peso, consumoW);
            this.pulgadas = pulgadas;
            this.sintonizadorTDT = sintonizadorTDT;
        }
        // Métodos
        public Double calcularPrecio(){
            double precio = super.calcularPrecio();
            if(pulgadas > 40){
                precio = precio + (precioBase * 0.3);
            }            
            if (Boolean.TRUE.equals(sintonizadorTDT)){
                precio += 50;
            }
            return precio;
        }
}
// Fin de la solución
public class Solucion_2 {
    public static void main(String[] args) {
        /*
        // Prueba 1        
        Electrodomestico1 electrodomesticos[]=new Electrodomestico1[5];
        electrodomesticos[0]=new Electrodomestico1(200.0, 60, 'C');
        electrodomesticos[1]=new Lavadora1(150.0, 30);
        electrodomesticos[2]=new Television1(500.0, 80, 'E', 42, false);
        electrodomesticos[3]=new Electrodomestico1();
        electrodomesticos[4]=new Electrodomestico1(600.0, 20, 'D');
        PrecioTotal1 solucion1 = new PrecioTotal1(electrodomesticos);
        solucion1.mostrarTotales();
        System.out.println();
        */
        // Prueba 2
        Electrodomestico1 electrodomesticos2[]=new Electrodomestico1[10];
        electrodomesticos2[0]=new Electrodomestico1(200.0, 60, 'C');
        electrodomesticos2[1]=new Lavadora1(150.0, 30);
        electrodomesticos2[2]=new Television1(500.0, 80, 'E', 42, false);
        electrodomesticos2[3]=new Electrodomestico1();
        electrodomesticos2[4]=new Electrodomestico1(600.0, 20, 'D');
        electrodomesticos2[5]=new Lavadora1(300.0, 40, 'Z', 40);
        electrodomesticos2[6]=new Television1(250.0, 70);
        electrodomesticos2[7]=new Lavadora1(400.0, 100, 'A', 15);
        electrodomesticos2[8]=new Television1(200.0, 60, 'C', 30, true);
        electrodomesticos2[9]=new Electrodomestico1(50.0, 10);
        PrecioTotal1 solucion2 = new PrecioTotal1(electrodomesticos2);
        solucion2.mostrarTotales();
        System.out.println();
        
        }
}
