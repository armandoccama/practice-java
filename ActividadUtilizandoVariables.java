public class ActividadUtilizandoVariables {
  public static void main(String[]args){
    // Paso 1: Declarar variables y asignar valores
    boolean esEstudiante = true;
    char inicialApellido = 'G';
    String nombreCompleto = "Juan Pérez";
    int edad = 30;
    long numeroGrande = 1234567890L;
    float altura = 1.7512345F;
    // Paso 2: Imprimir contenido de las variables

    System.out.println("Valor variable boolean: " + esEstudiante);
    System.out.println("Valor variable char: " + inicialApellido);
    System.out.println("Valor variable float: " + altura);
    // Paso 3: Imprimir texto con nombre y edad
    String nombre = "Juan";
    int miEdad = 30;
    System.out.println("Mi nombre es " + nombre + ", y tengo " + miEdad +
    " años.");
  }
}


// 1. Temperatura media de una ciudad durante el verano: double (se permite decimal
// y cubre un amplio rango de valores posibles para la temperatura).
// 2. Precio de un producto en una tienda: double (se permite decimal y puede
// representar valores de dinero precisos).
// 3. Nombre completo de una persona: String (los nombres pueden contener
// caracteres alfanuméricos y no necesitan realizar cálculos aritméticos).

// 4. Fecha de nacimiento de una persona: LocalDate (los objetos LocalDate son
// adecuados para representar fechas y proporcionan métodos útiles para
// manipularlas).
// 5. Número de habitantes de una ciudad: long (un entero de 64 bits es adecuado
// para representar números grandes, como la población de una ciudad).
// 6. Duración de una película: int (los números enteros son adecuados para
// representar duraciones en minutos, ya que no se pueden tener fracciones de
// minutos).
// 7. Disponibilidad de un artículo en una tienda: boolean (los valores booleanos son
// adecuados para representar estados de verdadero o falso, en este caso, la
// disponibilidad del artículo).
// 8. Distancia entre dos ciudades: double (se permite decimal y puede representar
// distancias precisas en kilómetros).
// 9. Número de teléfono de una persona: String (los números de teléfono pueden
// contener caracteres especiales y no necesitan realizar cálculos aritméticos).
// 10. Cantidad de existencias de un producto en una tienda: int (los números enteros
// son adecuados para representar cantidades enteras como la cantidad de
// existencias de un producto).