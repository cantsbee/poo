// Ejercicio 1. Diseñar la clase Texto que gestiona una cadena de caracteres con algunas
// características:
// - La cadena de caracteres tendrá una longitud máxima que se especifica en el
// constructor
// - Permite añadir un carácter al principio o al final, siempre y cuando no se exceda la
// longitud máxima, es decir, exista espacio disponible.
// - Igualmente, permite añadir una cadena, al principio o al final del texto, siempre y
// cuando no se rebase el tamaño máximo establecido.
// - Es necesario saber cuántas vocales (mayúsculas y minúsculas) hay en el texto.
// - Cada objeto de tipo Texto tiene que conocer la fecha en la que se creó, así como la
// fecha y hora de la última modificación efectuada.
// - Deberá existir un método que muestre la información que gestiona cada texto
// Para el registro de las fechas, utiliza:
// - Clase LocalDate (del paquete java.time), con el método estático now(), que devuelve
// la fecha actual (tipo LocalDate)
// o LocalDate fecCreacion = LocalDate.now();
// - Clase LocalDateTime (de java.time), también con su método estático now(), que
// devuelve la fecha y hora actual (tipo LocalDateTime)
// o LocalDateTime fecMod = LocalDateTime. Now();

public class Texto{
    String cadena;
    int longitud;

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        
    }


}