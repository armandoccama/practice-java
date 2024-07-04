import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConManejoDeExcepciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingrese el segundo número: ");
            int numero2 = scanner.nextInt();

            int resultado = numero1 - numero2;

            System.out.println("El resultado de la resta es: " + resultado);
        } catch (InputMismatchException e) {
            // Manejar la excepción de entrada inválida
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}