public class Flotantes {

    public static void main(String[] args) {

        // Tipos flotantes

        // ESTAS SINTEXIS NOS PERMITITRAN VER LA CANTIDAD DE BYTES U OTRA CANTIDAD DE LOS TIPOS INTEGER.

        // Tipo FLOAT, DOUBLE

        // A difernecia de los tipos INTEGERS, los tipos FLOTANTES incluyen una fraccion en su valor, es decir "decimales".

// FLOAT

        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);

        // Byte.MIN_VALUE y Byte.MAX_VALUE: Nos permite ver el maximo valor positivo y minimo valor negativo que soporta este tipo BYTE.
        // Como vemos nos dice que el MVP es 127 y MinimoVN es -128
        System.out.println("valor maximo tipo float: " + Float.MAX_VALUE);

        System.out.println("valor minimo tipo float: " + Float.MIN_VALUE);

        System.out.println();

        // DOUBLE

        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);

        // Byte.MIN_VALUE y Byte.MAX_VALUE: Nos permite ver el maximo valor positivo y minimo valor negativo que soporta este tipo BYTE.
        // Como vemos nos dice que el MVP es 127 y MinimoVN es -128
        System.out.println("valor maximo tipo double: " + Double.MAX_VALUE);

        System.out.println("valor minimo tipo double: " + Double.MIN_VALUE);

        System.out.println();

        // IMPORTANTE Los DEFAULT de los tipos FLOTANTES en JAVA son DOUBLE, por lo cual auqnue al declarar una variable
        // le pongamos FLOAT en la variable nos dara error, porque JAVA entiende el valor que le demos oomo DOUBLE. ejm:

        // float floatVar = 0.5; Como vemos nos da error, por lo cual para solucionar esto es simplemente poner como hicimos
        // con los INTEGERS, es poner en el valor de la variable la primera letra del tipo de FLOTANTES que queremos, en este caso
        // seria "F" de FLOAT.

        float floatVar2 = 0.5F;
        double doubleVar = 0.5D;

        // Si ponemos var en las variables que queremos que sean TIPOS FLOTANTES, tenemos que tener en cuenta que DEFAULT con var
        // es double, por lo cual si vamos a usar var, es mejor indicar que el valor es float con "F".

        var floarVar3 = 0.05F;







    }
}
