// Ejercicio 2. Crea una clase llamada Calculadora con su constructor
// • Define métodos para sumar, restar, multiplicar y dividir dos números.
// • En el método main, crea un objeto de la clase Calculadora, llama a los métodos y
// muestra los resultados.
import java.util.*;
public class calculadora {
    int num1;
    String operador;
    int num2;


public static void main (String[]args){

Scanner sc = new Scanner(System.in);
int num1 = sc.nextInt();
int num2 = sc.nextInt();
calculadora objCalculadora = new calculadora(num1, "operador", num2);
sc.close();
}

public calculadora (int num1, String operador, int num2){
    this.num1 = num1;
    this.operador = operador;
    this.num2 = num2;
}}