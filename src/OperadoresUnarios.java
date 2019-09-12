public class OperadoresUnarios {

    public static void main(String[] args) {

        // OPERADORES UNARIOS:

        // "~": Permite cambiar de signo a un variable INT. Invierte de positivo a negativo en este caso

        int a = 3;
        int b = ~a;

        System.out.println("a negativo = " + b);

        // OPERADOR TIPO BOOLEAN: En el caso del BOOLEAN, si ponemos "!", seria lo mismo que con "~". Invierte el valor
        // EN este caso de TRUE a FALSE

        boolean c = true;
        boolean d = !c;

        System.out.println("c Ahora en false = " + d);

        // PRE-Incremento y PRe-Decremento: Va a incrementar o decrementar en 1

        // PRE-Incremento

        int preIncremento = 3;
        int preIncremento2 = ++preIncremento;

        // PRE-Decremento

        int preDecremento = 3;
        int preDEcremento2 = --preDecremento;



        // POST-Incremento y POST-Decremento: Va a incrementar o decrementar en 1

        // POST-Incremento

        int postIncremento = 3;
        int postIncremento2 = postIncremento++;

        // POST-Decremento

        int postDecremento = 3;
        int postDecremento2 = postDecremento--;



    }
}
