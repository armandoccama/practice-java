import java.util.Scanner;

public class FiguraGeometrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean entradaValida = true;

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Cuadrado");
        System.out.println("3: Triángulo");
        
        System.out.print("Ingrese el número de la opción: ");

        if(scanner.hasNextInt()){
          opcion = scanner.nextInt();
        }else {
            entradaValida = false;  // La entrada no es válida, cambiar la bandera
            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            scanner.next();  // Limpiar la entrada incorrecta
        }

        String figura = "";
        double area = 0;

        if (entradaValida) {  // Verificar si la entrada es válida antes de ejecutar el switch
            area = switch (opcion) {
                case 1 -> {
                    figura = "Círculo";
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    yield Math.PI * Math.pow(radio, 2);
                }
                case 2 -> {
                    figura = "Cuadrado";
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    yield Math.pow(lado, 2);
                }
                case 3 -> {
                    figura = "Triángulo";
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    yield (base * altura) / 2;
                }
                default -> {
                    System.out.println("Opción inválida. Por favor ingrese un número del 1 al 3.");
                    yield 0;
                }
            };
        }

        if (area != 0) {
            System.out.println("El área del " + figura + " es: " + area);
        }
        
        scanner.close();
    }
}