import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionSegura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número entero: ");
            int numerador = scanner.nextInt();

            System.out.print("Ingrese el segundo número entero: ");
            int denominador = scanner.nextInt();

            int resultado = numerador / denominador;

            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            // Manejar la excepción de división por cero
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
            System.out.println("Error: Se detectó un valor inválido ingresado por teclado.");
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}