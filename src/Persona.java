public class Persona {


// IMPORTANTE: no poner el METODO MAIN(que es para ejecuta codigo) cuando creamos una clase.

        // CONTEXTO DINAMICO: Hay casos en los que no necesariamente trabajaremos con los objetos sino directamente con las clases
        // esto se le llama CONTEXTO ESTATICO. Pero el CONTEXTO dinamico es lo que estamos ahciendo ahora, trabajar con obejtos mendiante una clase.

        // ATributos

         String nombre;
         String apellidos;
         int telefono;

         // CONSTRUCTORES: Es un metodo que Nos permiten asignar valores a los atributos directamente al momento de crear el objeto
    // cuando ponemos NEw nombreClase (Aqui ponemos los valores que le asignamos a los atributos mediante el constructor);
    // Esto nos beneficie ya que on tendremos que hacer un metodo solo para que nos devuelvan los valores que le asignemos,
    // el constructor no necesita RETURn como si lo hicieramos con metodos, ya que los valores los ponemos directamente en la creacion
    // de los objetos cmo ya se meciono.
    // EL nombre del constructor debe ser identico al nombre de la CLase, respectando las minusculas y las mayusculas.
    // No es obligatorio usar el constructor para poner el valor de todos los atributos, podemos usarlo para aquellos
    // atributos que son mas importantes.
    // Si no hay necesidad de usar constructor, no se pone.

    // SOBRECARGA DE METODOS: Si dos omas metodos/constructores tiene el mismo nombre, puede que sea porque habran varias formas para la creacion de los objetos.
    // Si hay por ejemplo 2 constructores y en sus parametros uno esta vacio y otro si tiene parametros entonces tenemos dos formas de creacion de
    //objetos.




    // Metodos

    // public, todos acceder, private: es privado

    // VOID: Le dice al metodo que no va a regresar ningun tipo de informacion, es decir, no regresa ninngun tipo de informacion o valor sobre el metodo
    //    // solamente el valor que tenga la variable. ademas que el tipo de dato no influye en el contenido del metodo.
    // Si en el caso contrario queremos que nos devuelva informacion, pues hay especificar el tipo de dato que queremos y ponerle RETURN
    // para que nos retorne el valor:
    // ejm: int, double, string, etc.


    public void deplegarNombre() {

        System.out.println("nombre = " + nombre);
    }

    public void deplegarApellidos() {

        System.out.println("apellidos = " + apellidos);
    }

    public void deplegarTelefono() {

        System.out.println("Telefono = " + telefono);
    }


    // Por ahora no podemos ejecutarlo, ya que no tenemos el metodo MAIn, que nos permite ejecutar el codigo, ademas de que
    // necesitamos crear los objetos

    // CREACION DE UN OBJETO: REcordemos que con objetos reune todos lo de una clase y cada objeto tendra sus propios valores

    // ESTRUCTURA: NOmbredelaClase NombredelObjeto/Variable = new NombredelaClaseDeNuevo(constructor(se vera mas adelante));

        /*
       PARA ACCEDER A LOS ATRIBUTOS/METODOS DE LA CLASE PARA USARLOS EN LOS OBJETOS usamos ".".
        ESTRUCTURA:
        nombredelObjeto.Atributo = ;
        nombredelObjeto.Metodo() = ;
        EJM:

       Persona p1 = new Persona();

       pl.nombre = "Pedro";
         */

        /*
        CLASE STRING: EL string de por si en JAVA, es una clase pero no necesita del NEW, no es un tipo primitvo,
        pero se pone en el mismo sitio que los tipos primitivos
         */

        /*
        CREACION DE METODOS EN JAVA:

        ARGUMENTOS = PARAMETROS: Los parametros se usan para poer en ellos ya sean variables, valores para que el
        contenido del metodo se ejecute. no son obligatorios

        tipo nombreMetodo(lista de argumentos(osea variables)) {
        // contenido del metodo
        }

        EL nombre del metodo empieza en minuscula y las demas palabras que lo incluya las podemos colocar si queremos
        en mayusculas como en las variables


         */

        // EJM:

    int sumar(int a, int b) {

        // Podemos hacerlo de esta forma: return a + b;

        // Si lo queremos mas comodamente, lo podemos meter en una variable

        int resultado = a + b;
        return resultado;
    }


}

