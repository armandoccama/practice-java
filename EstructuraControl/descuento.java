import java.util.Scanner;

public class descuento {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto:");
        double precio = scanner.nextDouble();

        // Verificar si aplica descuento y calcular el nuevo precio si es necesario
        if (precio >= 100) {
            double descuento = precio * 0.1; // 10% de descuento
            double precioConDescuento = precio - descuento;
            System.out.println("Se aplicó un descuento del 10%.");
            System.out.println("Nuevo precio con descuento: $" + precioConDescuento);
        } else {
            System.out.println("El precio original del producto es: $" + precio);
            System.out.println("No aplica descuento.");
        }

        scanner.close();
    }
}