import jdk.swing.interop.SwingInterOpUtils;

public class Integers {

    public static void main(String[] args)
    {
        // byte, short, int, long: pueden recibir tanto valores positivos como negativos y veremos sus diferencias entre ellos.

        // EXisten clases que nos permite observar la cantidad de bits que ocupa cada uno de estos tipos.

        // Para el tipo BYTE tenemos lo siguiente:


        // Tenemos la constante SIZE la cual nos permitira saber el tamañaño de este tipo de bit

        // En este caso nos indicara el numero de bits que ocupa este string
        // ESTAS SINTEXIS NOS PERMITITRAN VER LA CANTIDAD DE BYTES U OTRA CANTIDAD DE LOS TIPOS INTEGER.
        // BYTE.SIZa: Nos permite ver la cantidad de bits que tiene un BYTE.
        // BYTE.BYTES: Nos permite ver el tamaño de bytes que tiene un BYTE. En este caso obviamente
        //  solo nos va amostrar 1, porque 1 byte = 1 byte = 8 bits.

        // BYTE

        System.out.println("bits tipo BYTE: " + Byte.SIZE);
        System.out.println("bytes tipo BYTE: " + Byte.BYTES);

        // Byte.MIN_VALUE y Byte.MAX_VALUE: Nos permite ver el maximo valor positivo y minimo valor negativo que soporta este tipo BYTE.
        // Como vemos nos dice que el MVP es 127 y MinimoVN es -128
        System.out.println("valor maximo tipo byte: " + Byte.MAX_VALUE);

        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);

        System.out.println();

        // SHORT

        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);

        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);

        System.out.println();

        // INTEGER

        System.out.println("bits tipo integer: " + Integer.SIZE);
        System.out.println("bytes tipo integer: " + Integer.BYTES);
        System.out.println("valor maximo tipo integer: " + Integer.MAX_VALUE);

        System.out.println("valor minimo tipo integer: " + Integer.MIN_VALUE);

        System.out.println();

        // LONG

        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);

        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);

        // DELCAREMOS VARIABLE SCON ESTOS TIPOS INTEGERS:

        // EJm:

        byte byteVar = 15;
        System.out.println(byteVar);
        short shortVar = 100;
        System.out.println(shortVar);
        int intVar = 500;
        System.out.println(intVar);
        long longVar = 1000;
        System.out.println(longVar);

        // EN JAVA, EL DAFAULT PARA VAR SI EL VALOR DE LA VARIABLE ES TIPO INTEGER, ES INT

        var numero = 10;

        System.out.println(numero);

        // Si queremos convertir este default en algun otro tipo de integer, ponemos al lado derecha del valor de la variable
        // una letra mayuscula, la cual va a hacer la primera letra de cada tipo de INTEGER. ejm:

        var numero2 = 10L;

        System.out.println(numero2);

        // Aqui le estamos indicando que ya no sea INT sino que al ponerle la "L" de LONG, se convierte esta variable en tipo LONG.


        // CON LOS TIPO INTEGER podemos usar otros sistemas de decimales, como lo son decimales, hexadecimal y octal:
        
        byte decimal = 10;
        System.out.println("decimal = " + decimal);
        
        byte hexadecimal = 0xa;
        System.out.println("hexadecimal = " + hexadecimal);
        
        byte octal = 012;
        System.out.println("octal = " + octal);
    }
}
