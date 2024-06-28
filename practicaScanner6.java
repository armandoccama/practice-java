import java.util.Scanner;

public class practicaScanner6 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el valor de la base del rectángulo
        System.out.print("Ingresa el valor de la base del rectángulo: ");
        double baseRectangulo = scanner.nextDouble();

        // Pedir al usuario que ingrese el valor de la altura del rectángulo
        System.out.print("Ingresa el valor de la altura del rectángulo: ");
        double alturaRectangulo = scanner.nextDouble();

        // Calcular y almacenar el perímetro del rectángulo
        double perimetroRectangulo = 2 (baseRectangulo + alturaRectangulo);

        // Mostrar el resultado del perímetro por consola con un mensaje adecuado
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);

        // Calcular y almacenar el área del rectángulo
        double areaRectangulo = baseRectangulo * alturaRectangulo;

        // Mostrar el resultado del área por consola con un mensaje adecuado
        System.out.println("El área del rectángulo es: " + areaRectangulo);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}