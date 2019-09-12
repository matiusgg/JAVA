public class PrecedenciaOperadores {

    public static void main(String[] args) {

        // PRECEDENCIA: Como un conjunto de operaciones se va a diferenciar, separar de unos de otros, y que no creee conflictos entre ellos.
        // al momento de dar el resultado final de ese conjunto de operaciones.

        var x = 5;
        int y = 10;

        // como vemos estamos haciendo un pre-incremento y un post-incremento con las variables anteriores y las estamos sumando
        var z = ++x + y--; // Analicemos primero: x = 6(antes de utilizarse en z), y = 9(despues de utlizarse en z
        // por lo cual, lo ejecutara despues de hacer la suma, ya a diferencia de x(que lo hizo antes de la suma), este lo hara
        // despues de la suma). Nos daria 16, ya que x = 6 + y = 9 = 15. PEro nos dara 16: porque realizo la suma antes de ejecutar
        // el post-decremento de y.

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // NOTE: Ten en cuenta que la * y la /. tienen Prioridad sobre la suma y la resta por lo cual se ejecutara primero,
        // en el caso de que no usemos () para separar que operaciones son unas de otras.

        var resultado2 = 4 + 5 * 6 / 3;
        System.out.println(resultado2);

        // Lo ideal seria hacerlo asi

        var resultado3 = 4 + (5 * 6) / 3;
        System.out.println(resultado3);

        // TABLA DE PRECEDENCIA DE SIMBOLOS:
        // (): Tiene la mayor prioridad
        // *, /: van despues
        // +, -: van despues
        // EN RESUMEN: obiamente hay mas cosas entre estas tambien, pero es un pequeño omini resumen para que te hagas una idea.

    }




    }

