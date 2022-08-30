// > java Planet.java 175
public enum Planet {
        MERCURIO (3.303e+23, 2.4397e6),
        VENUS   (4.869e+24, 6.0518e6),
        TIERRA   (5.976e+24, 6.37814e6),
        MARTE    (6.421e+23, 3.3972e6),
        JUPITER (1.9e+27,   7.1492e7),
        SATURNO  (5.688e+26, 6.0268e7),
        URANO  (8.686e+25, 2.5559e7),
        NEPTUNO (1.024e+26, 2.4746e7);
    
        private final double mass;   // in kilograms
        private final double radius; // in meters
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }
        private double mass() { return mass; }
        private double radius() { return radius; }
    
        // universal gravitational constant  (m3 kg-1 s-2)
        public static final double G = 6.67300E-11;
    
        double surfaceGravity() {
            return G * mass / (radius * radius);
        }
        double surfaceWeight(double otherMass) {
            return otherMass * surfaceGravity();
        }
        public static void main(String[] args) {
            if (args.length != 1) {
                System.err.println("Cómo correr la clase: java Planet.java <su_peso>");
                System.exit(-1);
            }
            double earthWeight = Double.parseDouble(args[0]);
            double mass = earthWeight/TIERRA.surfaceGravity();
            for (Planet p : Planet.values())
               System.out.printf("Su peso en %s es %f%n",
                                 p, p.surfaceWeight(mass));
        }
}
