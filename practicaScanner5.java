
import java.util.Scanner;

public class practicaScanner5 {

    public static void main(String[] args) {
        // Declarar una constante para el año actual
        final int ANIOACTUAL = 2024;

        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su año de nacimiento
        System.out.print("Por favor, ingresa tu año de nacimiento: ");
        int añoNacimiento = scanner.nextInt();

        // Calcular la edad actual del usuario
        int calculoEdad = ANIOACTUAL - añoNacimiento;

        // Determinar si el usuario es mayor de edad y mostrar un mensaje apropiado
        if (calculoEdad >= 18) {
            System.out.println("Eres mayor de edad. Tienes " + calculoEdad + " años.");
        } else {
            System.out.println("Eres menor de edad. Tienes " + calculoEdad + " años.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}