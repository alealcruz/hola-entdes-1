/**
Muestra por pantalla el mensaje "Hola Mundo"
**/
public class holaMundo {
  public static void main(String[] args) {
    String naranja = "\033[33m";
    String azul = "\033[34m";    
    System.out.println(naranja + "¡Hola mundo!");
    System.out.println(azul + "Aquí estamos haciendo pruebas con Git.");
  }
}
