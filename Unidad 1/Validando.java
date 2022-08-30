import java.util.Scanner;
public class Validando {
    
    public static String saludar(String nombre)
        {   String saludo = "Bienvenido al sistema: " +nombre;
            return saludo;        
        }
    
        public static String error(String nombre)
        {
            String error = "ERROR: No pudimos validar tus datos " +nombre +" \nPor favor contacte al Administrador." ;
            return error;
        }

        public static void verificar(String usuario, String contraseña)
        {
            String usuarioValido = "JuanC";
            String contraseñaValida = "Super";
            if (usuarioValido.equals(usuario) && contraseñaValida.equals(contraseña))
                {   System.out.println("\n#############################");
                    System.out.println(saludar(usuario));
                    return;
                }
            else if (usuarioValido.equals(usuario) || contraseñaValida.equals(contraseña))
                {
                    System.out.println("ERROR: Contraseña incorrecta para el usuario: " +usuario);        
                }
            else
                {
                    System.out.println(error(usuario));
                }
        }
    public static void main(String[] args)
        {
            Scanner s = new Scanner(System.in);
            String usuario, contraseña;            
            System.out.println("Por favor ingrese su usuario: ");
            usuario = s.nextLine();
            System.out.println("Por favor ingrese su contraseña: ");
            contraseña = s.nextLine();            
            verificar(usuario, contraseña);            
            s.close();
        }
}
