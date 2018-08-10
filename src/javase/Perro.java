
package javase;

// como se usa interfaz se utiliza el implements a diferencia de las clases abstract 
// esta no te obliga a depender de una herencia y puede implementar a varias interfaces
public class Perro implements Animal, SerVivo{

    @Override
    public void mostrarTipoDeAnimal() {
      System.out.println("Soy mamaifero, Perro");
    }

    @Override
    public String mostrarNombre() {
      return "Asavache";
    }

    @Override
    public void mostrarVida() {
      System.out.println("Estoy vivo y soy Perro");
    }
    
}
