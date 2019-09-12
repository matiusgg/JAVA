public class OpIgualdadRelacional {
    public static void main(String[] args) {


        // OPERADORES DE IGUALDAD

        // EN este caso nos dara en SOUt false, porque a diferencia de los ejercicios anteriores explicados en la clase "boolean".
        // Aqui ya estamos poniendo de iuna variable boolean, otras variables dentro de el. Por lo cual cambia el tema de que siempre es TRUE.
        // Lo que sucede en el siguiente ejemplo, es que al imprimir boolean c. Este se pregunta si la operacion de igual es cierta o no.
        // ya que no lo toma como  simepre TRUe a menos de que se lo señalemos en un condicional,
        // En este caso se pregunta si las 2 variables son iguales, si lo son pone TRUe y si no pone FALSE, que es loque queremos que indique
        // TAMBIEN AGREGAR QUE AL USAR BOOLEAN DE ESTA FORMA: ES COMO SI HICIERAMOS UN MINI CONDICIONAL, PAR QUE NOS SALGA TRUE OR FALSE

        int a = 3, b = 2;
        //Consejo: ponerlo entre parentesis para no tener problemas con la lectura del SOUT, en algun momento.
        boolean c = (a == b);

        System.out.println("c = " + c);

        // "==" Nos permite decir que un valor es igual totalmente a otro valor, a direfencia del "="
        // que es para asignar un valor. El "==" lo usamos solo para tipos primitivos

        // El equivalente de "==" para usarlo en TIpo Strings es el metodo "equals()"
        // EQUALS(): Nos permite comparar si los Strings son iguales o no. Si son iguales es TRUE y no es, entonces es FALSE.

        String d = "Hola", e = "HOla";

        boolean f = d.equals(e);
        System.out.println("f = " + f);


        // OPERADORES RELACIONALES: Operadores de relaacion: <, >, >=, >=

        // ejemplo con boolean pero ya no con koperadores de igualdad sino de relacionales

        boolean g = (a > b);
        System.out.println("g = " + g);

        boolean h = (a > b);
        System.out.println("h = " + h);

        boolean i = (a <= b);
        System.out.println("i = " + i);

        boolean j = (a >= b);
        System.out.println("j = " + j);


    }
}
