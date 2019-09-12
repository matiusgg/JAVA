import java.util.Scanner;

public class ObjetoAgenda {

    public static void main(String[] args) {

        AgendaJava agenda = new AgendaJava();

        while (true) {


        System.out.println("BIENVENIDO A TU AGENDA");
        System.out.println("EScoge entre las opciones:");
        System.out.println("1. Agregar contacto(a)");
        System.out.println("2. Actualizar contacto(ac)");
        System.out.println("3. Borrar contacto(b)");
        System.out.println("4. Buscar contacto(bus)");
        System.out.println("5. Ver tu lista de contactos(li)");

        Scanner sc = new Scanner(System.in);

        int usuario = Integer.parseInt(sc.nextLine());

        if (usuario == 1) {

            System.out.println("Haz escogido agregar contacto");


            System.out.println("Ingresa el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingresa el email: ");
            String email = sc.nextLine();
            System.out.println("Ingresa el telefono: ");
            int telefono = Integer.parseInt(sc.nextLine());

            agenda.agregar(nombre, email, telefono);

            // persona1.contacto(persona1);



        }

        else if (usuario == 2) {

            System.out.println("Haz escogido actualizar los datos");

            System.out.println("Ingresa el nombre del contacto que quieres actualizar: ");
            String nombre2 = sc.nextLine();

            agenda.actualizar(nombre2);





        }

        else if (usuario == 3) {


            System.out.println("Haz escogido borrar un contacto");

            System.out.println("Ingresa el nombre del contacto que quieres borrar: ");
            String nombre3 = sc.nextLine();

            agenda.borrar(nombre3);
        }

        else if (usuario == 4) {

            System.out.println("Haz escogido buscar algun contacto");

            System.out.println("Ingresa el nombre del contacto que quieres buscar: ");
            String nombre2 = sc.nextLine();

            agenda.buscar(nombre2);


        }

        else if (usuario == 5) {


        }

        else{

            System.out.println("NO ha escogido ninguna opcion");
        }

    }

        }





}
