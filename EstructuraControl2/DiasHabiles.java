import java.util.Scanner;

public class DiasHabiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia=0;
        boolean entradaValida=true;

        System.out.print("Ingrese un número del 1 al 7 (1 para lunes, 2 para martes, ..., 7 para domingo): ");
        // int dia = scanner.nextInt();

        if(scanner.hasNextInt()){
          dia = scanner.nextInt();
        }else {
            entradaValida = false;  // La entrada no es válida, cambiar la bandera
            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            scanner.next();  // Limpiar la entrada incorrecta
        }
        if(entradaValida){
          String resultado = switch (dia) {
              case 1, 2, 3, 4, 5 -> "Es un día hábil (Lunes a Viernes)";
              case 6, 7 -> "No es un día hábil (Sábado o Domingo)";
              default -> "Número de día no válido";
          };
          System.out.println(resultado);
        }

        scanner.close();
    }
}