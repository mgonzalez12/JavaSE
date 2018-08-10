package javase;

/*
 * @author Marcos Gonzalez
 */
public class JavaSE {

    public static void main(String[] args) {
      
      // metodo de instancia puede ser accedido por un objeto ejemplo per.mostrarDeInstancia
      Persona per = new Persona();
      per.setNombre("Marcos");
      per.setEdad(30);
      per.mostrarDeInstancia();
      
      //  metodo static puede ser accedido por la clase definicion de la clase 
      Persona.mostrarDeClase();
    }
    
}
