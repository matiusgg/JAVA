public class Char {

    public static void main(String[] args) {
        // CHAR

        // RECORDEMOS: Los valores del char se basan en la tabla UNICODE para repsentar cada uno de sus valores

        // Usamos character para indicar el CHAR

        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("valor maximo tipo char: " + Character.MAX_VALUE);

        System.out.println("valor minimo tipo char: " + Character.MIN_VALUE);

        System.out.println();

        // Para CHAR usamos comillas simples '' al momento de asignarle su valor, hay dos formas de poner el valor de un char
        // con codigo y con numeros normales. COn codigo para que funciones ponemos \oodigoCHAR.

        char c = '\u0021'; // este codigo representa "!"

        System.out.println("c = " + c);

        // si lo hicieramos con numeros, pero sin comillas simples n habria ningun problema:

        char c2 = 33;

        System.out.println("c2 = " + c2);

        // Aunque hay una tercera opcion y es simplemente colocando el caracter que queremos usar, poniendolo en las
        // comillas simples, ademas podemos poner var pero solamente en este opcion y en la opcion del codigo, no en la de
        // los numeros porque el DEFAULT de en ese caso seria INT no char obviamente.

        char c3 = '!';

        System.out.println("c3 = " + c3);

    }

}
