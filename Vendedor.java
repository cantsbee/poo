package vehiculo; 

public class Vendedor{
    public String nombre;
    private String email;
    double kilometraje;


public Vendedor (String nombre, String email){
    this.nombre = nombre;
    this.email = email;
    kilometraje = 50000;
}
public String getEmail(){
    return email;
}

public void mostrarDatod(){
    System.out.println("vendedor: "+ vendedor+ "email: "+email+ "kilometraje: "+kilometraje);
}
}