public class Boolean {

    public static void main(String[] args) {

        // BOOLEAN

        // RECORDEMOS: nos permite poner TRUE or FALSE como sus constantes y valores.



        // System.out.println("valor TRUE Boolean: " + Boolean.TRUE);

        // System.out.println("valor FALSE Boolean: " + Boolean.FALSE);

        System.out.println();

        boolean booleanVar = false;

        // Aunque no hemos visto los condicionales en JAVA podemos hacer uno para comprobar la variable de bollean

        if(booleanVar)
            System.out.println("la variable tiene un valor TRUE");

        else

            System.out.println("la variable tiene un valor FALSE");

        // EJErcicio con BOOLEAN para verificar si esa persona es adulta o no.

        // hacemos una variable que contenga la edad de la persona

        int edad = 23;

        // como vemos dentro una variable tambien podemos poner signos de operacion para crear operaciones o indicaciones en este
        // caso. IMPORTANTE: Como vemos var adulto es un boolean. PORQUE?. POrque al darle una indicacion o mini condicion dentro de la variable
        // lo que genera es boolean de que esa indicaicon es TRUE, en este caso al usar los signos >=, le estamos indicando
        // es mayor o igual y esto se vuelve TRUE. Digamos que fuera !=(no es igual), tambien seria TRUE. Da igual que indicacion le pongamos.
        // estamos asegurando siempre que es TRUE, a menos de que le digamos lo contrario. En este caso con el condicional "if". hacemos
        // esta tarea.
        boolean adulto = edad >= 18;

        if (adulto)
            System.out.println("Eres mayor de edad, puede pasar");
        else
            System.out.println("Eres menor de edad, no puedes pasar");

    }
}
