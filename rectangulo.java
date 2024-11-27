import java.util.*;

public class rectangulo{
    double ancho;
    double largo;

    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        double ancho = scanner.nextDouble();
        double largo = scanner.nextDouble();
        rectangulo rectangulo = new rectangulo(ancho, largo);
        rectangulo.perimetro();
        rectangulo.area();
        scanner.close();
    }

    public rectangulo(double ancho, double largo){
        this.ancho = ancho;
        this.largo = largo;
    }

    void perimetro(){
        double perimetro = ancho*2 + largo*2;
        System.out.println("El perímetro del rectangulo es: " + perimetro);
    }

    void area(){
        double area = ancho*largo;
        System.out.println("El área del rectangulo es: " + area);
}
}