
import java.util.Scanner;

public class ConversionPrimitivos {

    public static void main(String[] args) {


       // convertir tipo STRING a tipo primitivo
        // PARSE: Permite convertir cadenas de string en algun tipo de primitivo.
        // Su estructura es nombreTipoprimitivo.parseNomenclaturaTipoPrimitivo(s: "Cadena de string")
        // podemos hacer el parse con los tipos primitvos y con los flotantes tambien: algunos son:
        // parseFloat, parseLong, parseBoolean, etc. La excepcion seria el CHAR
        // EJM con tipo INT:

        int edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        // EJM con tipo DOUBLE
        
        double valorPi = Double.parseDouble("3.14");
        System.out.println("valorPi = " + valorPi);

        // Si queremos que la cadena de texto se convierta en char, tenemos que tener en cuenta que el CHAR es para caracteres
        // no para cadenas, pero si queremos sacar un caracter de una cadena, entonces usamos el metodo chartAT

        //charAT: NOs permite extraer de una cadena, un caracter. Para usarlo, hay que tener en cuenta que cada caracter tien su
        // propia posicion, es decir empieza desde cero en la primera letra, y va aumentando sucesivamete.

        // EJM: si queremos extraer de una cadena que sea "Hola" el caracter "o", entonces hacemos:

        char c = "Hola".charAt(1);
        System.out.println("c = " + c); // c = o;

        // SCANNER con TIPOS PRIMITVOS:

        // por ahora sabemos que el scanner lo usamos on strings, pero podemos hacerlo tambien con primitivos
        // Lo cual haremos:

// declaramos la variable SCANNER
        Scanner sc = new Scanner(System.in);

        // declaramos la variable primitiva, en este caso INT, y usamos parse para que lo que introduzcamos dentro del parse
        // se convierta de STRING a INT.
        // La diferencia ahora es que dentro del PARSE vamos a colocar el metodo NEXTLINE, con el que solictiabamos
        // a la variable que nos introdujera el valor para que el SCANNER lo colocara.
        // Como vemos lo que hacemos es que mediante el SCANNEr ponemos un string,y este string se convierte en INT mediante el PARSE
        // si escribieramos en el SCANNER letras, nos daria error porque ya con PARSE nos lo convirtio en INT

        int edad2 = Integer.parseInt(sc.nextLine());
        System.out.println("edad2 = " + edad2);

        // Ahora con CHAr que recordemos era con charAT. Donde vemos que simplemente el nextLint() sumple la posicion del string,
        // obviamente ya que lo pondremos en consola, y con el .charAT() despues de este, le estamos indicando al string que extraiga
        // un caracter de la cadena de string.

        char caracter = sc.nextLine().charAt(0); // en este caso el primer caracter de la cadena de string
        System.out.println("caracter = " + caracter);

        // CONVERSION TIPO PRIMITIVO A STRING
        // VALUE OF: Nos permite convertir un tipo primitivo en String. Es un metodo de STRING
        // EJM:

        String valorPienTexto = String.valueOf(3.14); // vamos a convertit 3.14(que es DOUBLE). en string.
        System.out.println("valorPienTexto = " + valorPienTexto);


        // Otra forma de hacerlo mas rapido, es simplemente con concatenacion, es decir, cuando le ponemos a la variable un valor
        // en forma de cadena, por ejemplo:

        String valorPienTexto2 = "" + valorPienTexto; // al hacer esto, como vemos colocamos al inicio del valor de la variable un string vacio
        // y lo concatenamos con +. Lo que hara esto es que lo que le siga se convertira automaticamente en STRING, ya que la consola
        // lo leera asi.
        System.out.println("valorPienTexto2 = " + valorPienTexto2);

    }


}
