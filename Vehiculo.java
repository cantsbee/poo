package vehiculo;
import java.util.*;
public class Vehiculo {
    String matricula;
    public String marca;
    private Double kilometraje;
    private static String empresa="POWER CARS";
    Vendedor vendedor;

    Vehiculo(String matricula, String marca){
    this.matricula = matricula;
    this.marca = marca;
    kilometraje = 0;
    }
    vehiculo(String matricula, Double kilometraje) {
        this.matricula= matricula;
        this.marca="";
        this.kilometraje = kilometraje;
    }

    Vehiculo(String matricula, String marca, double kilometraje){
        this.matricula = matricula;
        this.marca = marca;
        this.kilometraje = kilometraje;
        
    }

    Vehiculo(String matricula, String marca, double kilometraje){
        this.matricula = matricula;
        this.marca = marca;
        this.kilometraje = kilometraje;
        this.vendedor= vendedor;
        
    }

void incrementar(double kilometraje, double aumento){

    double kilometraje2 = kilometraje + aumento;
}
    
void registrarKm(double km) {
    if (km >= 0){
        kilometraje = kilometraje+km;
    }
    else{
        System.out.println("El kilometraje debe ser un valor positivo");
    }
}

public void mostrarDetalles(){
        System.out.println("matricula: " + matricula + "marca: " + marca + "y kilometraje: " + kilometraje);
     }
public String getEmpresa(){
    return empresa;
}

public void setEmpresa(String newEmpresa){
    empresa = newEmpresa;
}
}
