import java.util.Scanner;

public class MenuOpciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean entradaValida = true;
        // Mostrar menú
        System.out.println("Seleccione una opción:");
        System.out.println("1: Guardar");
        System.out.println("2: Cargar");
        System.out.println("3: Salir");
        
        // Solicitar al usuario que ingrese una opción
        System.out.print("Ingrese el número de la opción: ");
        // opcion = scanner.nextInt();

        if(scanner.hasNextInt()){
          opcion = scanner.nextInt();
        }else {
            entradaValida = false;  // La entrada no es válida, cambiar la bandera
            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            scanner.next();  // Limpiar la entrada incorrecta
        }
        if (entradaValida) {
          // Estructura switch para manejar las opciones
          switch (opcion) {
              case 1:
                  System.out.println("Opción seleccionada: Guardar");
                  break;
              case 2:
                  System.out.println("Opción seleccionada: Cargar");
                  break;
              case 3:
                  System.out.println("Opción seleccionada: Salir");
                  break;
              default:
                  System.out.println("Opción inválida. Por favor ingrese un número del 1 al 3.");
                  break;
          }
        
        }
        // Cerrar el objeto Scanner
        scanner.close();
    }
}