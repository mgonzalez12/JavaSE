package javase;

/*
 * @author Marcos Gonzalez
 */
public class JavaSE {

    public static void main(String[] args) {
    
        Perro per = new Perro();
        per.mostrarTipoDeAnimal();
        
        String nombre = per.mostrarNombre();
        
        System.out.println(nombre);
        
        // muestro el metodo
        per.mostrarVida();
    }
    
}
