package Herencia;

public class Empleado extends PersonaPadre{

    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleados;

    public Empleado(String nombre, double sueldo){
        super(nombre);
        this.idEmpleado = ++contadorEmpleados;
        this.sueldo = sueldo;
    }

    private Persona() {

        this.idPersona = ++contadorPersonas;
    }

    public Persona(String nombre, int edad) {

        this.();
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", sueldo=" + sueldo +
                '}';
    }
}
