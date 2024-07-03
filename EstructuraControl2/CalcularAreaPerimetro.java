import java.util.Scanner;

public class CalcularAreaPerimetro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcionFigura = 0;
        boolean entradaValida = true;

        System.out.println("Seleccione una figura geométrica:");
        System.out.println("1: Círculo");
        System.out.println("2: Rectángulo");
        System.out.print("Ingrese el número de la opción: ");

        if (scanner.hasNextInt()) {
            opcionFigura = scanner.nextInt();
            if (opcionFigura < 1 || opcionFigura > 2) {
                entradaValida = false;
                System.out.println("Opción no válida. Por favor ingrese 1 para Círculo o 2 para Rectángulo.");
            }
        } else {
            entradaValida = false;
            scanner.next();
            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
        }

        if (entradaValida) {
            switch (opcionFigura) {
              case 1 -> {
                  // Cálculos para el círculo
                  System.out.print("Ingrese el radio del círculo: ");
                  double radio = 0.0;
                  if (scanner.hasNextDouble()) {
                      radio = scanner.nextDouble();
                  } else {
                      System.out.println("Entrada no válida. Por favor ingrese un número.");
                      scanner.next(); // Limpiar el buffer de entrada
                      break; // Salir del case si la entrada no es válida
                  }

                  System.out.println("Seleccione qué desea calcular:");
                  System.out.println("1: Área");
                  System.out.println("2: Perímetro");
                  System.out.print("Ingrese el número de la opción: ");
                  int opcionCalculoCirculo = 0;
                  if (scanner.hasNextInt()) {
                      opcionCalculoCirculo = scanner.nextInt();
                  } else {
                      System.out.println("Entrada no válida. Por favor ingrese un número entero.");
                      scanner.next(); // Limpiar el buffer de entrada
                      break; // Salir del case si la entrada no es válida
                  }

                  double resultadoCirculo = switch (opcionCalculoCirculo) {
                      case 1 -> Math.PI * Math.pow(radio, 2);  // Área del círculo
                      case 2 -> 2 * Math.PI * radio;  // Perímetro del círculo
                      default -> {
                          throw new IllegalArgumentException("Opción no válida para círculo");
                      }
                  };

                  System.out.println("El resultado es: " + resultadoCirculo);
                  break;
              }
              case 2 -> {
                  // Cálculos para el rectángulo
                  System.out.print("Ingrese la base del rectángulo: ");
                  double base = 0.0;
                  if (scanner.hasNextDouble()) {
                      base = scanner.nextDouble();
                  } else {
                      System.out.println("Entrada no válida. Por favor ingrese un número.");
                      scanner.next(); // Limpiar el buffer de entrada
                      break; // Salir del case si la entrada no es válida
                  }

                  System.out.print("Ingrese la altura del rectángulo: ");
                  double altura = 0.0;
                  if (scanner.hasNextDouble()) {
                      altura = scanner.nextDouble();
                  } else {
                      System.out.println("Entrada no válida. Por favor ingrese un número.");
                      scanner.next(); // Limpiar el buffer de entrada
                      break; // Salir del case si la entrada no es válida
                  }

                  System.out.println("Seleccione qué desea calcular:");
                  System.out.println("1: Área");
                  System.out.println("2: Perímetro");
                  System.out.print("Ingrese el número de la opción: ");
                  int opcionCalculoRectangulo = 0;
                  if (scanner.hasNextInt()) {
                      opcionCalculoRectangulo = scanner.nextInt();
                  } else {
                      System.out.println("Entrada no válida. Por favor ingrese un número entero.");
                      scanner.next(); // Limpiar el buffer de entrada
                      break; // Salir del case si la entrada no es válida
                  }

                  double resultadoRectangulo = switch (opcionCalculoRectangulo) {
                      case 1 -> base * altura;  // Área del rectángulo
                      case 2 -> 2 * (base + altura);  // Perímetro del rectángulo
                      default -> {
                          throw new IllegalArgumentException("Opción no válida para rectángulo");
                      }
                  };

                  System.out.println("El resultado es: " + resultadoRectangulo);
                  break;
              }
              default -> System.out.println("Opción no válida para figura geométrica");
            }
        }

        scanner.close();
    }
}