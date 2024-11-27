// Ejercicio 4. Crea una clase llamada Vehículo con su constructor
// • Define atributos para el tipo, número de ruedas y estado (nuevo/usado).
// • Crea un método mostrarDetalles que imprima la información del vehículo.
// • En el método main, crea un objeto de Vehiculo, asigna valores y llama a
// mostrarDetalles.

public class Vehículo {
    String tipo;
    int numRuedas;
    String estado;

public static void main (String[]args){

Vehículo objVehiculo = new Vehículo("kia", 4, "nuevo");
objVehiculo.mostrar();
}

public Vehículo (String tipo, int numRuedas, String estado){
    this.tipo = tipo;
    this.numRuedas = numRuedas;
    this.estado = estado;
}




void mostrar() {
    System.out.println("El coche es un " + this.tipo + ", tiene " + this.numRuedas + "ruedas y su estado es " + this.estado);

}
}