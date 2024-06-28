import java.util.Scanner;

public class practicaScanner4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Pide al usuario que ingrese dos números
        System.out.print("Por favor ingresa el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Por favor ingresa el segundo número: ");
        int num2 = scanner.nextInt();

        // Compara si el primer número ingresado es mayor que el segundo
        String mayor = (num1 > num2) ? "mayor" : "no mayor";
        System.out.println("El primer número es " + mayor + " que el segundo.");

        // Verifica si el primer número ingresado es distinto al segundo número ingresado
        String diferente = (num1 != num2) ? "diferente" : "igual";
        System.out.println("El primer número es " + diferente + " al segundo.");

        // Verifica si el primer número ingresado es divisible por 2
        String divisible = (num1 % 2 == 0) ? "divisible" : "no divisible";
        System.out.println("El primer número es " + divisible + " por 2.");


        // Pide al usuario que ingrese otros dos números
        System.out.print("Por favor ingresa el tercer número: ");
        int num3 = scanner.nextInt();

        System.out.print("Por favor ingresa el cuarto número: ");
        int num4 = scanner.nextInt();
        
        // Valida si el número 1 es mayor que el número 2 y si el número 3 es mayor que
        // el número 4
        String mayor1 = (num1 > num2) ? "mayor" : "no mayor";
        String mayor3 = (num3 > num4) ? "mayor" : "no mayor";
        System.out.println( "El número 1 es " + mayor1 + " que el número 2 y el número 3 es " + mayor3 + " que el número 4.");

        // Valida si el número 1 es mayor que el número 2 o si el número 3 es mayor que

        // el número 4
        String mayorO = ((num1 > num2) || (num3 > num4)) ? "mayor" : "no mayor";

        System.out.println("El número 1 es " + mayorO + " que el número 2 o el número 3 es " + mayorO + " que el número 4.");

        // Cerrar el scanner para evitar fugas de memoria
        scanner.close();
    }
}