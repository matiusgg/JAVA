public class BucleWhile {

    public static void main(String[] args) {


        // BUCLEs: nos permiten repetir una cierta cantidad de veces un cnojunto de instrucciones. Esto va a depender de una
        // condicion, la cual debemos constrolar para saber cuantas veces se ejecutara esa cantidad de instrucciones y no que sea infinito.

        // Condicion explicita: Es cuando no requiere la participacion del usuario, y el mismo programa se encarga de ejecutarlo por si mismo.
        // al contrario de las Condiciones implicitas, en donde el usuario si tiene participacion en la ejecucion del codigo

    // WHILE: Es un bucle, que permite ejecutar una cantidad de instrucciones si la condicion es verdadera, mientras que si la condicion
        // no es verdadera no hara el buble. AQui necesitamos tener el  control de la cantidad de veces que se ejecutara el bucle
        // ya que sino, hara bucles se ejecutaran bucles infinitos

        // FOR: Es un buble. EStructura: REvias la condicion, si es cierta ejecuta el codigo a repetir, incrementa o decrementa y se revisa la condicion
        // de nuevo. En el bucle for a diferencia del WHILE, tenemos secciones ya definidas para controlar el bucle hasta el punto en donde
        // el bucle debe parar, que seria cuando la condicion ya es falsa.

        /*
        ESTRUCTURA:
        for(inicializacion(variables de control o contadores, se utliza para iniciar el contador); condicion; iteracion(se incrementa o decrementa)) {

        // codigo que queremos ejecutar


        }

        TIP: si queremos que nos salga el for con la estrucutra ya hecha ponemos:

        fori. (A esto se el denomina SHORTCUT).

        Simplemente seria cambiar el nombre de la variable y ponerle condicional.
         */

        /*

        WHILE DO: Lo mismo que while, pero al tener do, el codigo se ejecutara al menos una vez, es decir, si la condicion es falsa
        de todas formas te ejecutara el codigo una vez.

        ESTRUCTURA:

        do{
        System.out.println("i = " + i);
        i++;
        } while(i <= 3);
         */
        System.out.println();
        var texto = "impresion";

        // nos lo imprira de manera infinita, ya que la condicion siempre es verdadera

       // while(true) {
          //  System.out.println("texto = " + texto);
 
       // }

        var i = 0;
        
        // Como vemos, si la condicion la condicionamos hasta cierto punto, y le ponemos un incremento/decremento no habra bucle infinito.
        
        while(i <= 3) {

            System.out.println("i = " + i);

            i++;
        }

        for (i = 0; i < 3; i++) {

            System.out.println("i = " + i);
        }

        /*
        BREAK: REcordemos que el BREAK BREAK: sirve para que si la condicion es verdadera, pare ahi, que no siga ejecutando mas código.
        Pero hay una cuestion, el BREAK al estar dentro de un bucle, si este esta en una condicion es verdadera, el BREAK lo que hace
        es parar ahi y romper el bucle, es decir, ya no nos ejecutara el bucle si la condicion es verdadera. ESto sirve mucho pero a la vez,
        puede darnos problemas dependiendo de lo que queremos.

        CONTINUE: CONTINUE sirve para indicarle a la condicion y al contenido de que si
        si la condicion es verdadera, esntonces no ejecutes el codigo que tiene dentro, mientras que si la condicion es falsa
        ejecute el codigo. ES como decirle, si la condicion es verdadera pasa de el, si es falsa ejecutalo. todos esto mientras el cONTINUE
        este antes del codigo a ejecutar si sin corchetes "{}".
        ADemas el CONTINUE, no rompe el bucle como el BREAK, sino que se sigue ejecutando la itineraicon del codigo, es decir. Otros condcionales o lo que
        tengamos dentro del bucle
         */

        // ejm: En este caso el rbeak al ver que la condicion es true si la variable "numero" es par, entonces rompe el bucle.



        for (var numero = 1; numero <= 4; numero++) {

            if (numero % 2 == 0) {

                // como vemos imprime el 2 solamente y no el 4, porque al ver que la condicion es verdadera, rompe el bucle impidiendo
                // que el 4 que es par, tambien se imprima

                System.out.println("numero = " + numero);
                break;

            }

        }

        for (var numero2 = 1; numero2 < 5; numero2++) {

            if (numero2 % 2 == 0)

                // Como vemos nos imprime el 1 y el 3 porque el continue al ver que la condicion es verdadera, osea los pares, nos los
                // coloca, mientras que los impares que son falsos dentro de la condicion si los pones.
                // como vemos tambien no ponemos corchetes y debe ir antes del codigo a ejecutar para que funcione de esta forma.
                continue;

                System.out.println("numero2 = " + numero2);





        }

            }

        }