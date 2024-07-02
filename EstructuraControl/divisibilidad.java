import java.util.Scanner;

public class divisibilidad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un número:");
        int numero = scanner.nextInt();

        if (numero % 3 == 0 && numero % 5 == 0) {
            System.out.println("El número es divisible por 3 y por 5.");
        } else if (numero % 3 == 0) {
            System.out.println("El número es divisible por 3.");
        } else if (numero % 5 == 0) {
            System.out.println("El número es divisible por 5.");
        } else {
            System.out.println("El número no es divisible ni por 3 ni por 5.");
        }

        scanner.close();
    }
}