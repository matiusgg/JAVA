package PasoporReferencia;

public class clasePersona {

    String nombre;

    // REcordemos que si ponemos void le estamos indicand que no nos devuelva ningun valor o informacion,
    // simplemente que ejecute el codigo que tiene adentro

    public void cambiarNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }
}
