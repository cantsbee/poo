import java.util.*;
public class cine {
    //Atributos de la clase
    String nombre;
    String ciudad;
    int anio;

    public static void main (String[]args){
    Scanner sc = new Scanner (System.in);
    // ("Cines Ideal", "Madrid", anio= 60);
    System.out.println("INTRODUCE EL NOMBRE DEL CINE:");
    String nombreIn = sc.nextLine();

    System.out.println("INTRODUCE la ciudad DEL CINE:");
    String ciudadIn = sc.nextLine();

    System.out.println("INTRODUCE la antigüedad DEL CINE:");
    int aniosIn = sc.nextInt();

    cine objCine = new cine (nombreIn, ciudadIn, aniosIn);
    System.out.println("se trata de los  " + objCine.nombre + ", que se encuentran en " + objCine.ciudad + " y tiene " + objCine.anio + " años.");
}

public cine (String nombre, String ciudad, int anio){
    this.nombre = nombre;
    this.ciudad = ciudad;
    this.anio = anio;
}
}


  
