import java.util.Scanner;

public class practicaScanner2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario que ingrese su nombre
    System.out.print("Por favor ingresa tu nombre: ");
    String nombre = scanner.nextLine();

    // Solicitar al usuario que ingrese su edad
    System.out.print("Por favor ingresa tu edad: ");
    int edad = scanner.nextInt();

    // Imprimir el nombre y la edad del usuario
    System.out.println("Su nombre es " + nombre + " y su edad es " + edad + " años.");

    // Cerrar el scanner para evitar fugas de memoria
    scanner.close();
  }
}

//asegura que los recursos asociados con el objeto Scanner sean
//liberados adecuadamente, lo que contribuye a un mejor manejo de recursos y
//previene problemas de rendimiento en el programa.