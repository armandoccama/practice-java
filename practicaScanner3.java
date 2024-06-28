import java.util.Scanner;

public class practicaScanner3 {
  public static void main(String[] args) {
    // Declara dos variables y asígnales un valor a cada una de ellas

    int num1 = 10;
    int num2 = 5;
    // Realiza las 5 operaciones básicas posibles en Java
    int suma = num1 + num2;
    int resta = num1 - num2;
    int multiplicacion = num1 * num2;
    int division = num1 / num2;
    int modulo = num1 % num2;
    // Muestra el resultado en consola
    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);

    System.out.println("La resta de " + num1 + " y " + num2 + " es: " + resta);

    System.out.println("La multiplicación de " + num1 + " y " + num2 + " es: " + multiplicacion);

    System.out.println("La división de " + num1 + " entre " + num2 + " es: " + division);

    System.out.println("El módulo de " + num1 + " entre " + num2 + " es: " + modulo);

    // Pide al usuario que ingrese dos números
    Scanner scanner = new Scanner(System.in);
    System.out.print("Por favor ingresa el primer número: ");
    int numero1 = scanner.nextInt();
    System.out.print("Por favor ingresa el segundo número: ");
    int numero2 = scanner.nextInt();
    scanner.close();
    // Realiza la suma de los números ingresados por el usuario
    int sumaUsuario = numero1 + numero2;
    // Muestra el resultado en la consola
    System.out.println("La suma de los números ingresados por el usuario es: " + sumaUsuario);
  }
}