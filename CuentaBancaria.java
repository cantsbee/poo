// Ejercicio 6. Crea una clase llamada CuentaBancaria con su constructor
// • Define los atributos numeroCuenta, saldo y titular.
// • Crea métodos para depositar y retirar dinero. Si el retiro excede el saldo,
// muestra un mensaje de error.
// • En el método main, crea un objeto de CuentaBancaria y realiza operaciones de
// depósito y retiro.
import java.util.*;
public class CuentaBancaria {
    int numeroCuenta;
    double saldo;
    String titular;


public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
     System.out.println("Introduzca su cuenta: ");
    int numeroCuenta = scanner.nextInt();
     System.out.println("Introduzca su saldo inicial:");
    double saldo = scanner.nextDouble();
    scanner.nextLine();
     System.out.println("Introduzca el titular de la cuenta:");
    String titular = scanner.nextLine();

    CuentaBancaria CuentaBancaria = new CuentaBancaria(numeroCuenta, saldo, titular);
    int opcion;
    do{
        menu();
        opcion=scanner.nextInt();
        switch(opcion) {
            case 1: CuentaBancaria.depositar();
            break;
            case 2: CuentaBancaria.retirar();
            break;
            case 3: CuentaBancaria.abandonar();
            break;
            default: System.out.println("La opción no es válida.");
        }

    } while (opcion != 3);
}

public CuentaBancaria(int numeroCuenta, double saldo, String titular){
    this.numeroCuenta = numeroCuenta;
    this.saldo = saldo;
    this.titular = titular;
}

public static void menu(){
    System.out.println("Elija una opción");
    System.out.println("1.Depositar dinero");
    System.out.println("2.Retirar dinero");
    System.out.println("3.Abandonar operación");
} 
void depositar(){

}
void retirar(){}
void abandonar(){}
}