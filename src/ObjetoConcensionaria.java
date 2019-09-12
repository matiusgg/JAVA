
import java.util.Scanner;

public class ObjetoConcensionaria {

    public static void main(String[] args) {

        Consensionaria tienda  = new Consensionaria();

        System.out.println("BIENVENIDO A CONSENCIONARIA BALEARS, consiga el coche de sus sueños");
        System.out.println("Escoge entre las opciones");
        System.out.println("1. Comprar coche");
        System.out.println("2. Hazte nuestro cliente, registrate");



        Scanner sc = new Scanner(System.in);

        int opcionMenu = Integer.parseInt(sc.nextLine());

        if (opcionMenu == 1) {

            System.out.println("CATALOGO: ");

            // tienda.mostrarCatalogo();
            tienda.escogerPiezas();




        }






    }
}
