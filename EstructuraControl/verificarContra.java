import java.util.Scanner;

public class verificacionContra {
    public static void main(String[] args) {
        // Contraseña predefinida
        String contrasenaPredefinida = "miContrasenaSegura";

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una contraseña
        System.out.println("Por favor, ingrese su contraseña:");
        String contrasenaIngresada = scanner.nextLine();

        if (contrasenaIngresada.equals(contrasenaPredefinida)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}