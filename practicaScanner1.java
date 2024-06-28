import java.util.Scanner;

public class practicaScanner1 {
  public static void main(String[]args){
    Scanner pepe = new Scanner(System.in);

    int edad;
    String nombre;
    System.out.println("Por favor ingrese una edad:");
    edad = pepe.nextInt();
    pepe.nextLine();
    System.out.print("Por favor ingrese un nombre:");
    nombre = pepe.nextLine();
    System.out.println(nombre+" tiene "+edad+" años ");
  }
}