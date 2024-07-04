import java.util.Scanner;

public class ConversionCadenaAEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese una cadena que represente un número entero: ");
            String cadena = scanner.nextLine();
            // Convertir la cadena en un número entero
            int numero = Integer.parseInt(cadena);

            System.out.println("El número entero es: " + numero);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            // Manejar la excepción de formato numérico
            System.out.println("Error: La cadena ingresada no es un número entero válido." +  e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            // Manejar cualquier otra excepción
            System.out.println("Error: Se produjo un error inesperado. " + e.getMessage());
        } finally {
            // Cerrar el scanner
            scanner.close();
        }
    }
}