package CuentaCorriente;
public class cuentaCorriente {
    String dni;
    String nombre;
    double saldo;
    static String nombreBanco = "PowerBank";
   

    cuentaCorriente(String dni, String nombre){
        this.dni = dni;
        this.nombre = nombre;
        saldo = 0.0;}
    cuentaCorriente(String dni, double saldo){
        this(dni,"");
        this.saldo = saldo;
        }
    

    boolean retirar(double cantidad){
        boolean opPosible;
        if (saldo >= cantidad){
            saldo =saldo - cantidad;
            return true;
        }
        else {
            opPosible=false;
        }
        return opPosible;
    }

    void ingresar (double cantidad){
        saldo = saldo + cantidad;
    }

    void mostrarDatos(){
        System.out.println("dni: " + dni +" nombre: " + nombre + " y saldo: " + saldo);
    }

    
    public static void main (String[]args)
{
     cuentaCorriente cc1 = new cuentaCorriente("1234567s", "Pepe");
     cuentaCorriente cc2 = new cuentaCorriente("1234567f", "Martha");
     cuentaCorriente cc3 = new cuentaCorriente("1234567f", "Martha", 3000);
     
     cc1.mostrarDatos();
     cc1.ingresar(1000);
     cc2.ingresar(2000);
     cc1.mostrarDatos();
     cc2.mostrarDatos();
     cc3.mostrarDatos();
     if (cc1.retirar(500)){System.out.println("se ha podido retirar la cantidad.");}
     else {System.out.println("no se ha podido etirar la cantidad indicada.");
     }
     cc1.mostrarDatos();
}
}