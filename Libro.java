// Crea una clase llamada Libro con su constructor.
// • Define los atributos titulo y autor.
// • Crea un método llamado cambiarTitulo que reciba un nuevo título como
// parámetro y actualice el atributo.
// • En el método main, crea un objeto de Libro, cambia su título y muestra la
// información actualizada.
import java.util.*;
public class Libro {
    String titulo;
    String autor;


public static void main (String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Introduzca el título:");
    String titulo = scanner.nextLine();
    System.out.println("Introduzca el autor:");
    String autor = scanner.nextLine();
    Libro libro = new Libro(titulo, autor);
    
    libro.cambiarTitulo(titulo);
    scanner.close();
}

public Libro (String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
} 

public void  cambiarTitulo(String titulo){
    Scanner scanner = new Scanner (System.in);
System.out.println("INTRODUZCA EL NUEVO TÍTULO:");
String nuevoTitulo = scanner.nextLine(); 
System.out.println("El nuevo titulo es " + nuevoTitulo);
scanner.close();
}
}