import java.util.Scanner;

public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
          // Solicita al usuario que ingrese dos números y almacena estos valores en variables
          System.out.print("Ingresa el primer número: ");
          double numero1 = scanner.nextDouble();
          System.out.print("Ingresa el segundo número: ");
          double numero2 = scanner.nextDouble();

          // Declara una variable para almacenar el resultado de la operación
          double resultado = 0;
          boolean operacionValida = true;

          // Permite al usuario elegir qué operación quiere realizar
          System.out.println("Elige una operación: ");
          System.out.println("1.- Suma");
          System.out.println("2.- Resta");
          System.out.println("3.- Multiplicación");
          System.out.println("4.- División");
          System.out.print("Ingresa el número de la operación que deseas realizar: ");
          int operacion = scanner.nextInt();

          // Utiliza el operador ternario para realizar la operación correspondiente
          resultado = (operacion == 1) ? numero1 + numero2
                    : (operacion == 2) ? numero1 - numero2
                    : (operacion == 3) ? numero1 * numero2
                    : (operacion == 4) ? (numero2 != 0 ? numero1 / numero2 : Double.NaN)
                    : Double.NaN;

          operacionValida = operacion >= 1 && operacion <= 4;

          // Muestra el resultado de la operación en la consola
          if (operacionValida) {
              if (operacion == 4 && numero2 == 0) {
                  System.out.println("Error: División por cero no es permitida.");
              } else {
                  System.out.println("El resultado de la operación es: " + resultado);
              }
          } else {
              System.out.println("Operación no válida.");
          }
        }
        catch (Exception e) {
          System.out.println("error al ingresar datos");
        }
        finally{
          scanner.close();
        }

    }
}