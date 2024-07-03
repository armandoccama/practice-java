import java.util.Scanner;

public class DiasDeLaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = true;
        int dia=0;
        System.out.println("Ingrese un número del 1 al 7:");
        // int dia = scanner.nextInt();
        String nombreDia;


        if(scanner.hasNextInt()){
          dia = scanner.nextInt();
        }else {
            entradaValida = false;  // La entrada no es válida, cambiar la bandera
            System.out.println("Entrada no válida. Por favor ingrese un número entero.");
            scanner.next();  // Limpiar la entrada incorrecta
        }

        if(entradaValida){
            switch (dia) {
                case 1:
                    nombreDia = "Lunes";
                    break;
                case 2:
                    nombreDia = "Martes";
                    break;
                case 3:
                    nombreDia = "Miércoles";
                    break;
                case 4:
                    nombreDia = "Jueves";
                    break;
                case 5:
                    nombreDia = "Viernes";
                    break;
                case 6:
                    nombreDia = "Sábado";
                    break;
                case 7:
                    nombreDia = "Domingo";
                    break;
                default:
                    nombreDia = "Número inválido. Por favor ingrese un número del 1 al 7.";
                    break;
            }
            System.out.println("El día de la semana es: " + nombreDia);
        }

        scanner.close();
    }
}