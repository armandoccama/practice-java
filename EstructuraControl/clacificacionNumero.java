import java.util.Scanner;

public class clacificacionNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita al usuario que ingrese un número
        System.out.print("Ingresa un número: ");
        double numero = scanner.nextDouble();

        // Determina si el número es positivo, negativo o cero
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cierra el escáner
        scanner.close();
    }
}