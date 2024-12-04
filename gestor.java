package CuentaCorriente;

public class gestor{
    public String nombre;
    private String tlf;
    double importeMax;

gestor (String nombre, String tlf) {
    this.nombre = nombre;
    this.tlf = tlf;
    this.importeMax = 10000;
}

gestor (String nombre, String tlf, double importeMax) {
    this.nombre = nombre;
    this.tlf = tlf;
    this.importeMax = importeMax;}

public String gettlf(){
    return tlf;
}
void mostrarGestor(){
System.out.println("nombre gestor: " + nombre + "");

}}