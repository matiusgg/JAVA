package Encapsulamiento;

public class ObjetoEncapsulamiento {

    public static void main(String[] args) {

        PersonaEncap persona1 = new PersonaEncap("Juan", "Fernandez", true);

        // imprime Juan
        System.out.println(persona1.getNombre());
        // Modificacion del nombre
        persona1.setNombre("Carlos");
        // Ahora es Carlos
        // Imprime Carlos
        System.out.println("persona1 = " + persona1.getNombre());
    }
}
