public class PErsonaObjeto extends Persona{

    // aqui si ponemos el metodo MAIN, porque obviamente queremos que se ejecute el codigo dentro en el este caso
    // en la creaicon de objetos

    public static void main(String[] args) {

        // Creacion del objeto

        Persona pl = new Persona();

        // Modificar valores del atributo del objeto creado

        pl.nombre = "Pedro";

        // Llamar al metodo
        pl.deplegarNombre();



        // Creacion del segundo objeto

        Persona pl2 = new Persona();

        // Modificar valores del atributo del objeto creado

        pl2.nombre = "Alberto";

        // Llamar al metodo
        pl2.deplegarNombre();

        // podemos poner un metodo dentro de una variable para usarla mas comodamente en otro sitio o por si la necesitamos en algun momento

        int resultado = pl2.sumar(2, 2);

        System.out.println("resultado = " + resultado);
    }
}
