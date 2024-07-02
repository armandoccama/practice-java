import java.util.Scanner;

public class determinacionEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad:");
        int edad = scanner.nextInt();

        // Determinar la categoría de edad y mostrar el mensaje correspondiente
        if (edad < 18) {
            System.out.println("Eres menor de edad.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres adulto.");
        } else {
            System.out.println("Eres un adulto mayor.");
        }

        // Cerrar el Scanner
        scanner.close();
    }
}