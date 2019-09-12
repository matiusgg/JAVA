import java.util.ArrayList;
import java.util.Scanner;

public class AgendaJava {

        ArrayList<Datos> contactos = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

        public AgendaJava() {}



    public void agregar(String nombre, String email, int telefono){


        Datos persona = new Datos(nombre, email, telefono);

        this.contactos.add(persona);

        for (int i = 0; i < contactos.size(); i++) {

            System.out.println(this.contactos.get(i));

        }



        // AgendaJava[] contactos = {persona};

        // for (int i = 0; i < contactos.length; i++) {


            // System.out.println("Contacto agregado: " + contactos[i].toString());

           // System.out.println(persona.toString());

            // contactos[i].toString();

        //}

    }

    public void actualizar(String nombre){

        for (int i = 0; i < contactos.size(); i++) {

            if (this.contactos.get(i).getNombre().equals(nombre)) {




                System.out.println("Ingresa el nuevo nombre: ");
                String nombreNuevo = this.sc.nextLine();
                System.out.println("Ingresa el nuevo email: ");
                String email = this.sc.nextLine();
                System.out.println("Ingresa el nuevo telefono: ");
                int telefono = Integer.parseInt(this.sc.nextLine());


                this.contactos.get(i).setNombre(nombreNuevo);
                this.contactos.get(i).setEmail(email);
                this.contactos.get(i).setTelefono(telefono);

                System.out.println("Contacto actualizado: ");

                System.out.println(this.contactos.get(i).toString());


            }

        }


    }

    public void borrar(String nombre){

        for (int i = 0; i < contactos.size(); i++) {

            if (this.contactos.get(i).getNombre().equals(nombre)) {

                System.out.println("Eliminaras el siguiente contacto: ");

                System.out.println(this.contactos.get(i).toString());

                System.out.println("Estas seguro de borrarlo?: ");
                System.out.println("1. Si");
                System.out.println("2. No");

                int opcion = Integer.parseInt(this.sc.nextLine());

                if (opcion == 1) {

                    this.contactos.remove(i);

                }

                else if (opcion == 2) {

                    System.out.println("Haz vuelto a las opciones del menu: ");
                }

                else{

                    System.out.println("No has escogido ninguna opcion");
                }


            }


            }

    }

    public void buscar(String nombre){

        for (int i = 0; i < contactos.size(); i++) {

            if (this.contactos.get(i).getNombre().equals(nombre)) {

                System.out.println(this.contactos.get(i).toString());
            }

            else{

                System.out.println("Contacto no encontrado");
            }

        }


    }

}

class Datos{

    private String nombre;
    private String email;
    private int telefono;
    // private AgendaJava[] contactos;


    public Datos() {}


    public Datos(String nombre, String email, int telefono){

        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Datos:" +
                "nombre='" + nombre + '\n' +
                ", email='" + email + '\n' +
                ", telefono=" + telefono;
    }
}



