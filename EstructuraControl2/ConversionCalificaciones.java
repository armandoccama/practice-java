import java.util.Scanner;

public class ConversionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida=true;
        int calificacion=0;
        String calificacionLetra;

        System.out.println("Ingrese una calificación numérica del 1 al 5:");
        // int calificacion = scanner.nextInt();

        if(scanner.hasNextInt()){
          calificacion = scanner.nextInt();
        }else {
            entradaValida = false;  // La entrada no es válida, cambiar la bandera
            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            scanner.next();  // Limpiar la entrada incorrecta
        }
        if(entradaValida){
            switch (calificacion) {
                case 1:
                    calificacionLetra = "Muy deficiente";
                    break;
                case 2:
                    calificacionLetra = "Deficiente";
                    break;
                case 3:
                    calificacionLetra = "Suficiente";
                    break;
                case 4:
                    calificacionLetra = "Notable";
                    break;
                case 5:
                    calificacionLetra = "Sobresaliente";
                    break;
                default:
                    calificacionLetra = "Calificación inválida. Por favor ingrese un número del 1 al 5.";
                    break;
            }
            System.out.println("La calificación en letras es: " + calificacionLetra);
        }

        scanner.close();
    }
}