
public class persona {
//atributos de la clase
    String nombre;
    int edad;
    double estatura;
    
public static void main (String[]args){
    //se instancia la clase, creación/construccion del objeto Persona
 persona p1 = new persona("Pepe", 23, 1.78);
 persona p2 = new persona( 23, 1.78);   
p1.Saludar();
p1.cumplirAnios();
p1.Saludar();
p2.Saludar();
}

public persona (String nombre, int edad, double estatura){
    this.nombre = nombre;
    this.edad = edad;
    this.estatura = estatura;

}
public persona ( int edad, double estatura){
    this.nombre = "Luis";
    this.edad = edad;
    this.estatura = estatura; }
//incrementa en 1 el atributo
void cumplirAnios(){
 edad++;
}
//metodo que imprime los atributos
void Saludar(){
    System.out.println("Hola, mi nombre es "+ nombre + " y tengo " + edad + " años.");
}
}