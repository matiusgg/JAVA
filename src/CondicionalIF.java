import java.util.Scanner;
public class CondicionalIF {

    public static void main(String[] args) {

        // Condicional IF: Si es verdadero, hazme esta sentencia sino lo es hazme otra.

        // if(condicion)
        // sentencia si es verdadera la condicion
        // else ()es opcional
        // sentencia si la condicion no es verdades
        // No lleva ";" al final del if, mientras que las sentencias dentro de los if si usan ; al final

        // Podemos usar {} en las sentencias, para delimitar la cantidad de codigo en las sentnecias que vayamos a usar

        // SENTENCIA SWITCH: ES otra forma de usar los condicionales, la utlizaremos por si tenemos muchos if's.
        // soporta tipos como byte, short, int, char o String, entre otros.

        /*
        Estructura:

        switch(condicion a medias(porque, ya en los CASES o en los siguientes if's finalizaremos la condicion dependiendo de que queramos)/
        expresion(tambien podemos simplemnte poner una variable y en los CASES condicionarla, es decir al final la idea es que aqui solo se tenga las variables
        o lo que vayamos a usar, y ya en los CASES lo condicionares) {

        case valor1:
        // sentencia
        break;
        case valor 2:
        // sentencia
        break;
        case valor 3:
        // sentencia
        break;

        default:
        // sentencia


        // DEFAULT: SIrve para ejecutar una sentencia si los CASES no se ejcutaron

        // BREAK: sirve para que si la condicion es verdadera, pare ahi, que no siga ejecutando mas codigo


        }
         */

        // OPeRADORES LOGICOS: Nos permiten organizar las decisiones que tomemos en las condiciones u en
        // otra parte del codigo.

        // CORTO CIRCUITO: Significa alguno o abmos de los valores son falsos dependiendo de que operador logico usemos, ya no tiene sentido evaluar, es decir, por ejmplo
        // si un valor es false y otro es true. Lo que pasara es que no vera necesario revisar/evaluar el otro valor que es TRUe
        // porque se intuye que es TRUE. ESto si comparamos o usamos dos valores con operadores logicos corto circuito. ESto nos ahorra tiempo.


        // ALgunos son: &&(y)(corto circuito), ||(o)(corto circuito), &(logico), |(logico), ^, !(negacion)

        // ELSE IF: PARA agregar otro condicional si el anterior no se cumple.

        var numero = 1;

        if (numero == 1) {

            System.out.println("numero uno");
        }
        else if (numero == 2) {

            System.out.println("numero dos");
        }
        else if (numero == 3) {

            System.out.println("numero tres");
        }
        else{
            System.out.println("numero desconocido");
        }

        // Tambien podemos colocar ibviamente variables dentro en donde esta variable vaya cambiando,
        // su valor dependiendo del condicional que le pongamos, y ya con un sout llamar a esa variable

        // EJEMPLO SWITCH:

                 var texto = "numero desconocido";



                     switch(numero){


        case 1:
            texto = "numero 1";

                            break;


                       case 2:
                           texto = "numero 2";
                           break;


        case 3:
            texto = "numero 3";
            break;


        case 4:
            texto = "numero 4";
            break;


        case 5:
                    texto = "numero 5";
            break;


                         default:
                    texto = "Valor desconocido";

                }

                // IMPORTANTE RECORDAR: PARA QUE FUNCIONE UNA VARIABLE TENEMOS QUE IMPRMIRLA con SOUT

        System.out.println(texto);

                     // Ejercicio IF-ELSE: Calculo Estacion del Año

        // dEfinimos una variable que contendra un numero que representa el mes, un mes cualquiera pondremos
        Scanner sc = new Scanner (System.in);
        int mes = Integer.parseInt(sc.nextLine());
        String estacion = "MEs no encontrado";

        if (mes == 1 || mes == 2 || mes == 12)
            estacion = "invierno";

        else if (mes == 3 || mes == 4 || mes == 5)
            estacion = "Primavera";

        else if (mes == 6 || mes == 7 || mes == 8)
            estacion = "Verano";

        else if (mes == 9 || mes == 10 || mes == 11)
            estacion = "Otoño";

        else
            System.out.println("Mes no encontrado");

        System.out.println("estacion = " + estacion);



        // MISMO EJERCICIO PERO CON SWITCH

        Scanner sc2 = new Scanner (System.in);
        int mes2 = Integer.parseInt(sc2.nextLine());
        String estacionSwitch = "MEs no encontrado";

        switch (mes2) {

            case 1: case 2: case 12:
                estacionSwitch = "invierno";
                break;

            case 3: case 4: case 5:
                estacionSwitch = "Primavera";
                break;

            case 6: case 7: case 8:
                estacionSwitch = "Verano";
                break;

            case 9: case 10: case 11:
                estacionSwitch = "Otoño";
                break;

            default:

                System.out.println("Mes no encontrado");

        }

        System.out.println("estacion = " + estacionSwitch);

    }
}
