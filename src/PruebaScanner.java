// Programa Java para leer datos de varios tipos usando la clase Scanner
import java.util.Scanner;
public class PruebaScanner
{
    public static void main(String[] args)
    {
        // Declarar el objeto e inicializar con
        // el objeto de entrada estándar predefinido
       Scanner sc = new Scanner(System.in);
        // entrada de una cadena
        System.out.println("Propocione su nombre: ");
        var usuario = sc.nextLine();
        var saludar = "Saludos";

        System.out.println(saludar + " " + usuario);



    }
}
