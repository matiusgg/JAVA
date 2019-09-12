public class EjemploEstatico {
    public static void main(String[] args) {
        OtraPersona persona1 = new OtraPersona("Juan");
        System.out.println(persona1);

        OtraPersona persona2 = new OtraPersona("Karla");
        System.out.println(persona2);

        System.out.println("ContadorPersonas = " + OtraPersona.getContadorPersonas());

    }
}

class OtraPersona{
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;

    public OtraPersona(String nombre){
        this.idPersona = contadorPersonas++;
        this.nombre = nombre;
    }

    public int getIdPersona(){
        return this.idPersona;
    }

    public void setIdPersona(int idPersona){
        this.idPersona = idPersona;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public static int getContadorPersonas(){
        return contadorPersonas;
    }

    public String toString(){
        return "idPersona: " + idPersona + " nombre: " + nombre;
    }

}