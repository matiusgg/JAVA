public class OperadoresAritmeticos {

    /*
    Operadores aritmeticos: +, -, *, /, %(operacion modulo).
    Operadores de relaacion: <, >, >=, >=, !=, ==, = (como en PHP).
    Operadores logicos: && o &, || o |, !(negacion), ^(exord a nivel de bits)
    Operadores Unitarios: ~,
    Operadores a nivel de bits:
    Operadores de asignacion:
    Operador COndicional:
    Prioridad y orden de evaluacion: Son aquellos simbolos que se utitlizan para mirar la "jerarquia de un codgio y otro"

     PALABRAS RESERVADAS: Ten en cuenta que si vamos a darle nombre a una variable, ten cuidado con ponerle alguna lpalabra que esta
     predefinida en JAVA
     */

    public static void main(String[] args) {
        // Operadores Artimeticos

        // SUMA: "+"

        // IMPORTANTE: EL VAR, no lo podemos usar cuando usamos una COMPOSICION, es decir,
        // una linea de codigo con mas de una variable. Porque?. Porque puede que otra variable sea de otro tipo.
        // JAVA nos dice que tenemos que especificar que tipo son esas variables.

        int a=3, b=2; // Como vemos con ',' podemos separar las variables en una misma linea de codigo

        // Ahora efectuamos la operacion pero es importante tener en cuenta que lo tenemos que poner en una variable
        // para poder imprimirlo despues, tambien lo podemos poner en un metodo como en PHP. pero mas adelante.
        // ademas de que el tipo debe ser como sus anteriores variables de la operacion obviamente.

        int suma = a + b;

        System.out.println("Resultado =  de a + b = " + suma);

        /*
        IMPORTANTE: Se pued eponer  una operacion dentro de un SOUT?. Si, pero es importante que tengas
        en cuenta que si no especificamos cual es la operacion, nos lo va a concatenar todos, porque como sabemos
        usamos para concatenar en JAVA el "+", ademas de que si tenemos un string al lado, JAVA lo entendera como
        una cadena de STRING, por lo cual para especifcar la operacion usamos "()".
         */

        System.out.println("Resultado 2 = " + (a + b));


        /*
        Aunque es IMPORTANTE tambien que tengamos en cuenta que JAVa lee el codigo en CASCADA, por lo cual si ponemos
        en el SOUT, el string a lo ultimo, no tendriamos que especificar cual es la operacion con "()".
         */

        System.out.println(a + b + " Resultado");

        // RESTA

        int resta = a - b;
        System.out.println("resta Resultado = " + resta);

        // o tambien:

        System.out.println("resta = " + (a - b));

        // MULTIPLICACION

        int multiplicacion = a * b;
        System.out.println("resultado multiplicacion = " + multiplicacion);

        // DIVISION

        int division = a / b;
        System.out.println("division = " + division);

        // CUESTION: Si usamos otro tipo(por ahora son operaicone snumericas), como por ejemplo un DOUBLE
        // entonces dentro de la variable que contendra la operacion o en unas de las variable que hace parte de la operacion
        // especificamos que tipo es, si es flotantes o primitivos, en este caso queremos que sea double.
        // Por lo cual podemos especificar que a = 3D, o en sumar = 3D + b;

        Double numeroDouble = 3.5;

        // Como vemos nos dara error si en la variable de la operacion le damos INT, ya que tenemos que poner DOUBLE

        Double sumaConDouble = numeroDouble + b;

        System.out.println("sumaConDouble =  " + sumaConDouble );

        // o tambien:

        Double sumaConDouble2 = 3.5D + b;

        System.out.println("sumaConDouble2 =  " + sumaConDouble2 );

        // MODULO: Nos regresa el residuo de una division

        int modulo = a % b;
        System.out.println("Modulo =  " + modulo );

        // Para saber si un numero es IMPAR o PAR, usamos "%" y lo divimos entre 2. En donde si nos regresa un 1= es impar, si es un 0=PAR

        int parImpar = 5 % 2;

        System.out.println("5 es = " + parImpar);


        // Podemos aplicar un condicional simple, indicando si es impar o par.

        if(parImpar == 0)
            System.out.println("El numero es par");

        else
            System.out.println("El numero es impar");
    }

}
