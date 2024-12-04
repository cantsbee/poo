package CuentaCorriente;
public class AppcuentaCorriente{
    public static void main (String[]args){
    Gestor g1 = new Gestor("Antonio", "11111", 200000);
    cuentaCorriente ccg = new CuentaCorriente("123456", "pepe", 2000, gestor);
    ccg.mostrarDatos();
    g1.mostrarDatos();
    //  cuentaCorriente cc1 = new cuentaCorriente("1234567s", "Pepe");
    //  cuentaCorriente cc2 = new cuentaCorriente("1234567f", "Martha");
    //  cuentaCorriente cc3 = new cuentaCorriente("1234567f", "Martha", 3000);
     
    //  cc1.mostrarDatos();
    //  cc1.ingresar(1000);
    //  cc2.ingresar(2000);
    //  cc1.mostrarDatos();
    //  cc2.mostrarDatos();
    //  cc3.mostrarDatos();
    //  if (cc1.retirar(500)){System.out.println("se ha podido retirar la cantidad.");}
    //  else {System.out.println("no se ha podido etirar la cantidad indicada.");
    //  }
    //  cc1.mostrarDatos();
}
}