// Ejercicio 8. Crea una clase llamada Empleado con su constructor
// • Define los atributos nombre, sueldo y puesto.
// • Crea métodos para:
// • Mostrar la información del empleado.
// • Aumentar el sueldo en un porcentaje.
// • En el método main, crea un objeto de Empleado, muestra su información,
// aumenta su sueldo y muestra la información actualizada.
import java.util.*;
public class Empleado{
    String nombre;
    double sueldo;
    String puesto;


    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Introduzca el  sueldo: ");
        double sueldo = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Introduzca el puesto: ");
        String puesto = scanner.nextLine();
        Empleado empleado = new Empleado(nombre, sueldo, puesto);


        empleado.mostrarInfo();
        empleado.aumentarSueldo(sueldo);
        scanner.close();


    } 
    public Empleado(String nombre, double sueldo, String puesto){
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.puesto = puesto;
    }

    public void mostrarInfo(){
    System.out.println("El nombre del empleado es " + nombre + ", su sueldo es " + sueldo + " y su puesto es " + puesto);
    System.out.println("El sueldo aumentado es " + aumentarSueldo(sueldo));
    }
    public double aumentarSueldo(double sueldo){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el porcentaje de aumento:");
 
        double porcentaje = scanner.nextDouble();
        double sueldoNuevo = sueldo+ ((sueldo*porcentaje/100));
        scanner.close();
        return sueldoNuevo;
        
    }
}
