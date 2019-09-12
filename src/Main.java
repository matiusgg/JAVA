public class Main {

    public static void main(String[] args) {

// Si queremos repetir una cadena de string, para usarlo en diferentes partes del sistema.

        /*
         Nos viene el inconveniete de que tendriamos que repetir varias veces la misma linea de codigo. Por lo cual,
         usamos las variables, ejm:
        */

        String holaMundo = "Hola Mundo";
            System.out.println(holaMundo);
        System.out.println(holaMundo);
        System.out.println(holaMundo);

        // Para crear una cadena string en una variable ponemos: "Cadena de String".var . Despues nos dira que le indiquemos el nombre de la variable
        // y le damos tabulacion de nuevo.

        // String Cadena = "Cadena de String";

        /*
        En las ultimas versiones de IAVA en lugar de definir una variable utlizando el tipo fijo, en este caso el string.
        usamos "var" y esto en automatico va a crear una variable del tipo string. AL ponerle "var" al lado del nombre de la variable lo que conseguimos es
        que el "var" consiga ver que tipo de dato es el valor de la variable.

        Podemos agregar una linea de codigo que solo sea dar intro y que la siguiente linea de codigo se vaya abajo.
        como un salto de pagina con simplemente dejar vacio donde va el string la variable. Ejm:

        System.out.println();
         */


        var Cadena = "Cadena de String";
        System.out.println(Cadena);

        /*
        Si queremos que cuando cambiemos el nombre de la variable, se cambien el nombre de la variable donde teniamos colocada
        el nombre de la variable en disntitas pares del codigo, ponemos en el nombre de la variable donde la declaramos, le damos click derecho
        le damos a "REfactor" y despues le damos a "Rename".
         */

        var nombre = "Juan";
        System.out.println(nombre);
        nombre = "Carlos";
        System.out.println(nombre);



        /* como vemos se puso nombre = "Carlos", si hacemos esto, estamos indicando que la variable "nombre", se ha cambiado
        por Carlos, esto sin tener que modificar el tipo de dato. Simplemente estamos colocando un nuevo valor a la variable.
         */

        // CONCATENACION


        var usuario = "Juan";
        var saludar = "Hola";

        System.out.println(saludar + " " + usuario);

        // Saludos, mi nombre es Juan

        System.out.println("Saludos, mi nombre es " + usuario);

// TIP: Si queremos que cuando hagamos el SOAT ya nos salga con "concatenacion". Escribimos soutv. Lo que hara es tomar
        // el nombre de la ultima variable que hemos delcarado y la pondra en concatenacion con un strings que en el contenido
        // tendra tambien el nombre de la variable.

        System.out.println("saludar = " + saludar);


        String nombre2 = "Carla";
        String apellido = "Esparza";

        System.out.println(nombre2 + " "+ apellido);

        System.out.println("Nueva Linea: \n" + nombre2);

        System.out.println("Tabulacion: \t" + nombre2);

        System.out.println("Retroceso: \b" + nombre2);

        System.out.println("Retorno de carro: \r" + nombre2);

        System.out.println("Comilla Simple: \'" + nombre2 + "\'");

    }

}


