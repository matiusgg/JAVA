public class OperadoresCondicionales {

    public static void main(String[] args) {

        // OPERADORES CONDICIONALES: Son aquellos signos que usamos en un condicional. (OPERADORES DE CORTO CIRCUITO)

        // && = "y". ambos son verdades

        // EJECIRCIO Hacer que un numero este dentro de un rango esperado, por ejemplo dl rango de 0 a 10

        int a = 1;
        int valorMinimo = 0, valorMaximo = 10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("a = " + resultado);

        // AUNQUE tambien se puede hacer en un condicional

        if (a >= valorMinimo && a <= valorMaximo)
            System.out.println("Dentro de rango");
        else
            System.out.println("Fuera de rango");

        // || o | = "o". si uno o otro es verdadero

        boolean vacaiones = true;
        boolean diaDescanso = false;

        if (vacaiones || diaDescanso)
            System.out.println("Tengo dia libre");

        else
            System.out.println("No tengo dia libre");
    }


}
