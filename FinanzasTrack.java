// Módulo de Gestión de Usuarios y Autenticación para FinanzasTrack
import java.util.ArrayList;
import java.util.Scanner;

// Clase Usuario
class Usuario {
    private String nombre;
    private String correo;
    private String contrasena;

    // Constructor
    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    // Getters y Setters
    public String getCorreo() {
        return correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getNombre() {
        return nombre;
    }
}

// Clase Autenticacion
class Autenticacion {
    private ArrayList<Usuario> usuarios;

    public Autenticacion() {
        usuarios = new ArrayList<>();
    }

    // Método para registrar usuarios
    public void registrarUsuario(String nombre, String correo, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo)) {
                System.out.println("    ");
                System.out.println("Correo ya registrado. Intente con otro correo.");
                return;
            }
        }
        usuarios.add(new Usuario(nombre, correo, contrasena));
        System.out.println("    ");
        System.out.println("Usuario registrado con exito.");
    }

    // Método para iniciar sesión
    public boolean iniciarSesion(String correo, String contrasena) {
        for (Usuario u : usuarios) {
            if (u.getCorreo().equals(correo) && u.getContrasena().equals(contrasena)) {
                System.out.println("    ");
                System.out.println("Bienvenido, " + u.getNombre() + "!");
                return true;
            }
        }
        System.out.println("        ");
        System.out.println("Credenciales incorrectas. Intente de nuevo.");
        return false;
    }
}

// Clase Principal para FinanzasTrack
public class FinanzasTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Autenticacion sistema = new Autenticacion();
        
        while (true) {
            System.out.println("           ");
            System.out.println("BIENVENIDOS A FINANZASTRACK");
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Registrar usuario");
            System.out.println("2. Iniciar sesion");
            System.out.println("3. Registrar transaccion (Ingresos/Gastos)");
            System.out.println("4. Definir presupuesto");
            System.out.println("5. Generar reporte financiero");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opcion: ");
            System.out.println("           ");
            
            int opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese su correo: ");
                    String correo = sc.nextLine();
                    System.out.print("Ingrese su contrasena: ");
                    String contrasena = sc.nextLine();
                    sistema.registrarUsuario(nombre, correo, contrasena);
                    break;
                case 2:
                    System.out.print("Ingrese su correo: ");
                    String correoLogin = sc.nextLine();
                    System.out.print("Ingrese su contrasena: ");
                    String contrasenaLogin = sc.nextLine();
                    sistema.iniciarSesion(correoLogin, contrasenaLogin);
                    break;
                case 3:
                    System.out.println("Funcionalidad de registro de transacciones proximamente...");
                    break;
                case 4:
                    System.out.println("Funcionalidad de gestion de presupuestos proximamente...");
                    break;
                case 5:
                    System.out.println("Funcionalidad de generacion de reportes proximamente...");
                    break;
                case 6:
                    System.out.println("Gracias por usar FinanzasTrack. ¡Hasta luego!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}
