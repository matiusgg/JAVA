package ClaseAritmetica;

public class Aritmetica {



    // Atributos

    int a;
    int b;



    // Constructor con VACIO

   Aritmetica(){}


    // COsntructor CON PARAMETROS

    Aritmetica(int arg1, int arg2) {

// Igualamoslos parametros con el nombre de los atributos

        // No usamos int en este caso en los atributos porque estos los pusimos al mometnos de definirlos

        this.a = arg1;
        this.b = arg2;
    }

    // Metodos

    // NOTA: COMO VEMOS ESTE METODO YA TIENE PARAMETROS PORQUE EL CONSTRUCTOR SUPLE SU FUNCION, SIMPLEMETEN ESTE METODO HACE LA FUNCION DE SUMAR

    // IMPORTANTE EN UN METODO: Un metodo en JAVA solo puede devolver un valor no varios si usamos RETURN

    int Sumar() {

       int resultado = a + b;
        return resultado;
    }

    // THIS: En ocasiones un metodo necesit ahacer refefncia al objeto con el que estamos trabajando
    // el THIS es un operador el cual nos permite acceder al objeto actual y la clase con la que estamos trabajando,
    // en donde nos servira para ACCEDER a los atributos o metodos de una clase.
    // En el caso del constructor nos permitira acceder con THIs a los atributos de la clase
    // Con esto poderemos diferencias que atributos son de la clase y cuales no

    // MEtodo restar

    int restar() {

       int resultadoResta = a - b;

       return resultadoResta;
    }

    //Metodo multiplicar

    int multiplicar() {

       int resultadoMultiplicar = a * b;

       return resultadoMultiplicar;
    }

    // Metodo dividir

    int dividir() {

       int resultadoDividir = a / b;

       return resultadoDividir;
    }
}
