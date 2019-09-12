package PasoporValor;



public class PasoPorValor {

    // METODO que queremos ejecutar junto con los metodos que tienen el PASO POR VALOR

    public static void main(String[] args) {
        int x = 10;

        // metodo IMPRIMIR que tiene PASO POR REFERENCIA
        // COmo vemos introducimos dentro del parametro del metodo la variable que tiene el valor
        // COmo vemos introducimos dentro del parametro del metodo la variable que tiene la referencia del objeto
        // en este caso "x"
        // IMPORTANTE: Como vemos al momento de ejecutar el codigo no nos hace el cambio, esto es debido a que
        // el PASO POR VALOR; no te hace una referencia en si del valor, sino una copia del original, por lo cual
        // si queremos que haya cambio, unicamente podemos modificar/cambiar/usar el valor de esa variable dentro del mismo
        // metodo, en este caso MAIN.

        imprimir(x);
        cambiarValor(x);
    }

    public static void cambiarValor(int variable) {


        variable = 200;
        System.out.println("X modificada = " + variable);

    }
    public static void imprimir(int variable) {
        System.out.println("variable = " + variable);

    }
}
