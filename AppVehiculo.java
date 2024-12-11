package vehiculo;

import java.util.Scanner;

public class AppVehiculo{
    public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    Vehiculo vehiculo = new Vehiculo("jzv213", "Kia", 0.0);  
    System.out.println("Introduzca el aumento de kilometraje: ");
    Double aumento = scanner.nextDouble();
    // Vehiculo vehiculo2 = new Vehiculo("vcgf1232", 4000.0);
    
    vehiculo.mostrarDetalles(); 
    vehiculo.incrementar(kilometraje, aumento);
    vehiculo.mostrarDetalles(); 
    scanner.close();
    }
}