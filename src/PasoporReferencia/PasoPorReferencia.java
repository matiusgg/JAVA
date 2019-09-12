package PasoporReferencia;

public class PasoPorReferencia {

    // METODO que queremos ejecutar junto con los metodos que tienen el PASO POR VALOR

    public static void main(String[] args) {

        // Objeto
        clasePersona p = new clasePersona();

        p.cambiarNombre("Juan");

        // metodo IMPRIMIR que tiene PASO POR REFERENCIA
        // COmo vemos introducimos dentro del parametro del metodo la variable que tiene la referencia del objeto
        // en este caso ""

        imprimirNombre(p); // imprime Juan
        modificarPersona(p); // SE modifica a Carlos
        imprimirNombre(p); // imprime Carlos

    }

    // el parametro objeto como vemos lo usamos en un metodo de la clase "clasePersona", no pasaria nad aporque
    // al poner en el parametro la variable que tiene referencia del objeto, este objeto automaticamente se vuelve igual
    // a esa variable(como toda funcion con parametros), es decir, objeto = p. porque en MAIN colocamos modificarPersona(p);

    public static void modificarPersona(clasePersona objeto) {

        objeto.cambiarNombre("Carlos");

    }

    public static void imprimirNombre(clasePersona objeto) {

        System.out.println("Nuevo valor del atributo nombre:  " + objeto.obtenerNombre());

    }


}
