package ClaseAritmetica;

public class AritmeticaObjeto{

    public static void main(String[] args) {

        // MAIN al final es un metodo, por lo cual al declarar variables aqui, seran locales.
        // IMPORTANTE A TENER EN CUENTA: AL usar variables locales, estas se borraran de la memoria
        /* Unicamente cuando el codigo termine de ejecutarse, MIENTRAS QUE LAS VARIABLES DE CLASE solo se
        borraran de memoria cuando se elimine el objeto
         */
        // Declaramos variables locales pars usarlas dentro del constructor

        int operadorA = 2;
        int operadorB = 6;

        // CReamos el objeto con constructor que tiene parametros

        Aritmetica suma = new Aritmetica(operadorA,operadorB);

        // REsultado SUma
        int resultadoSuma = suma.Sumar();

        System.out.println("resultado = " + resultadoSuma);

        // REsultado Resta
        int resultadoResta = suma.restar();

        System.out.println("resultado = " + resultadoResta);

        // REsultado Multiplicacion
        int resultadoMultiplicacion = suma.multiplicar();

        System.out.println("resultado = " + resultadoMultiplicacion);

        // REsultado Division
        int resultadoDivision = suma.dividir();

        System.out.println("resultado = " + resultadoDivision);


        // CReamos el objeto con constructor que no tiene parametros

        Aritmetica suma2 = new Aritmetica();
        // Como vemos ponemos el valor a los atributos como lo vimos en un principio usando el ".".

        suma2.a = 5;
        suma2.b = 5;
        int resultado2 = suma2.Sumar();

        System.out.println("resultado2 = " + resultado2);
    }
}
