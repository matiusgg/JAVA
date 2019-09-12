public class OperadorTernario {
    public static void main(String[] args) {

        // OPERADOR TERNARIO: Nos sirve paa realizar operaciones tipo IF ELSE sin necesidad de usar estos dos, es decir,
        // cumple la misma funcion que IF ELSE pero sin usar estos dos terminos

        // ejercicio de par e impar:

        int numero = 10;

        // ?= Abre la condicion, cumple la fuincion de IF
        // := Cumple la funcion de ELSE

        // Como vemos ? seria If, ; seria ELSE y los string "". Serian lo que hemos hecho hasta ahora que es colocar sout's, auque podemos poner lo que queremos
        // como un true or false por ejemplo, y mas cosas que veremos mas adelante
        // ESTRUCTURA: variable = (OPERACION o condicion que queremos) ? "" ; "";. Los () son opcionales

        var resultado = (numero % 2 == 0) ? "El numero es par" : "El numero es impar";

        System.out.println("resultado = " + resultado);
    }
}
