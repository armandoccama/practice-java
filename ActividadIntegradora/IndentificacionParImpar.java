import java.util.Scanner;

public class IndentificacionParImpar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        // Determina si el número ingresado es par o impar utilizando el operador ternario
        String resultado = (numero % 2 == 0) ? "par" : "impar";

        // Muestra el resultado en la consola
        System.out.println("El número " + numero + " es " + resultado + ".");

    }
}