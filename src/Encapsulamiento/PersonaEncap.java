package Encapsulamiento;

public class PersonaEncap {

    private String nombre;
    private String apellido;
    private boolean borrado;


    public PersonaEncap(String nombre, String apellido, boolean borrado) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.borrado = borrado;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;

    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;

    }

    public boolean isBorrado() {

        return this.borrado;
    }

    public void setBorrado(boolean borrado) {

        this.borrado = borrado;
    }

    // Para imprimir los atributos, lo veremos mas adelante el temade herencias y de la clase PAdre en JAVA OBJECT

    public String toString(){

        return "Nombre: " + nombre + "Apellidos: " + apellido + "Borrado: " + borrado;
    }
}
