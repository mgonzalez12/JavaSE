package javase;

/*
 *  Extends indica que esta heredando de la clase Animal
    con esto se accede a los atributos de la clase mayor
 */
public class Perro extends Animal {

    public Perro(String raza, String nombre, String tipo_alimentacion, int edad) {
        super(nombre, tipo_alimentacion, edad);
        this.raza = raza;
    }
    
    
    // atributo de la clase perro
    private String raza;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    public void mostrar(){
        System.out.println(getNombre() +"-"+getTipo_alimentacion()+ "-"+ getRaza()+"-"+getEdad());
    }
}
