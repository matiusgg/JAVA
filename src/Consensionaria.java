import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Consensionaria {

    // Si el valor total de la compra es mas de 40000 euros, descuesto del 20%
    // Si el valor es mas de 20000 tiene un descuento del 10%
    //Que el cliente pueda escoger las caracteristicas del coche
    // Si el cliente quiere cambiar la cesta de la compra, puede, en donde le tocara volver a poner las caracteristicas
    // El cliente tiene que realizar el pago, teniendo en cuenta el fecha, numero targeta y el cvv, obviamente tiene que coincidir
    // El cliente pone segun la ciudad que nos diga, le recomendaremos alguna tienda con su direccion

    // DICCIONARIO CON EL REGISTRO DE COCHE, Y SUS CARACTERISTICAS
    Map<Coches, piezasCoche> DiccionarioCoches = new HashMap<Coches, piezasCoche>();

    // LISTA COCHES PARA CATALOGO
    ArrayList<Coches> catalogo = new ArrayList<>();

    // LISTA PIEZAS DEL COCHE PARA MOSTRAR CUANDO LA PERSONA ESCOGA CUALES PIEZAS PONER

    ArrayList<Coches> listaPiezas = new ArrayList<>();

    // LISTA CON LOS CLIENTES

    ArrayList<Cliente> clientes = new ArrayList<>();


    Scanner sc = new Scanner(System.in);

    private String nombreTienda;
    private String direccion;
    private String ciudad;
    private String horario;

    public void creacionCoches() {

        // COCHES REGISTRO

        Coches ferrari = new Coches("Ferrari x8", "rojo", "ferrari", 20500);

        Coches ford = new Coches("Ford x5 ultra", "negro", "ford", 10500);

        Coches maseratti = new Coches("maseratti H2 2019", "blanco", "maseratti", 35000);

        // COCHES PIEZAS

        piezasCoche piezasFerrari = new piezasCoche("motor x5 2017", 950, "Negro Reflejante", 300, "Llantas Ferrari 2018", 400);

        piezasCoche piezasFord = new piezasCoche("motor Ford HM", 600, "Ventana antibalas", 1200, "Llantes Ford HM", 100);

        piezasCoche piezasMaseratti = new piezasCoche("Motor maserrati 1000 caballos", 1600, "maseratti special Wondow", 550, "Llantes Maseratti 2019", 560);

        // Agregar los objetos en llave-valor al diccionario

        this.DiccionarioCoches.put(ferrari, piezasFerrari);
        this.DiccionarioCoches.put(ford, piezasFord);
        this.DiccionarioCoches.put(maseratti, piezasMaseratti);

        // Agregar los objetos a la lista para catalogo

        this.catalogo.add(ferrari);
        this.catalogo.add(ford);
        this.catalogo.add(maseratti);

        // Agregar los objetos de piezasCoches a una lista

       // this.listaPiezas.add(piezasFerrari);
       // this.listaPiezas.add(piezasFord);
       // this.listaPiezas.add(piezasMaseratti);

    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    private void CreacionCliente(String nombre, int telefono, String email) {

        Cliente nuevoCliente = new Cliente(nombre, telefono, email);


        clientes.add(nuevoCliente);
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


private void mostrarClientes(String nombre) {

    for (int i = 0; i < clientes.size(); i++) {

        if (nombre.equals(clientes.get(i).getNombre())) {

            System.out.println("Tus datos fueron registrados con exito y son los siguientes: " + " \n ");

            System.out.println(clientes.get(i).toString());
        }

    }
}


    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void registroCliente(){

        System.out.println("Conviertete en nuestro cliente, y obten descuentos");

        System.out.println("\n" + "Ingresa tus datos");

        System.out.println("\n" + "Nombre Completo:");

        String nombre = this.sc.nextLine();

        System.out.println("\n" + "Telefono: ");

        int telefono = Integer.parseInt(this.sc.nextLine());

        System.out.println("\n" + "Email: ");

        String email = this.sc.nextLine();

        System.out.println("\n" + "Registrarse: " + "\n" + "1.Si" + "\n" + "2.No, volver" + "\n");

        int opcionRegistro = Integer.parseInt(this.sc.nextLine());



        if (opcionRegistro == 1) {
            this.CreacionCliente(nombre, telefono, email);

            this.mostrarClientes(nombre);

        }

        else {

            System.out.println("No has escogido ninguna opcion");
        }


    }


    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void mostrarCatalogo() {

        this.creacionCoches();


        for (int i = 0; i < catalogo.size(); i++) {


            System.out.println(this.catalogo.get(i).toString());


        }


    }

    public void escogerPiezas() {

        this.mostrarCatalogo();

        System.out.println("Escoge tu coche: ");

        String inputCoche = this.sc.nextLine();

        // FOREACH:
        // ESTRUCTURA: for (TipodelaLlave nombreVariableDeLaLlave: map(diccionario).keySet()) {

        // nombreVariableDeLaLlave son las llaves de un diccionario

        // esta variable nombreVariabledelValor con el get() de un map es para poder acceder al valor de una llave
        // por lo cual podemos usarlo si necesitamos el valor de una llave del diccionario

        //tipodelValor nombreVariabledelValor = map(diccionario).get(nombreVariableDeLaLlave);
        //
        // }

        for (Coches Llave: DiccionarioCoches.keySet()) {


            piezasCoche ValoresCoche = this.DiccionarioCoches.get(Llave);

            if (Llave.getMarca().equals(inputCoche)) {

                System.out.println("Este es el coche que escogiste:");

                System.out.println(Llave.toString());

                System.out.println(" ");

                System.out.println("Estas son las piezas que conforman este coche");

                System.out.println(" ");
                System.out.println("**************************");


                System.out.println(ValoresCoche);


                System.out.println("**************************");



                System.out.println("Deseas colocar las piezas que tu deseas?");
                System.out.println("1.Si");
                System.out.println("2.No, lo quiero tal y como esta");

                int opcionPieza = Integer.parseInt(this.sc.nextLine());


                if (opcionPieza == 1) {


                System.out.println("Exelente, a continuacion podrás escoger cuales piezas formaran tu coche, escoge entre las opciones");

                // System.out.println(this.DiccionarioCoches.values());

                    System.out.println("Estos son los motores disponibles: ");

                    System.out.println("**************************");
                    System.out.println(" ");

                    this.catalogoMotor();

                    System.out.println("**************************");
                    System.out.println(" ");

                    System.out.println("Escoge el motor: ");

                    String motorNuevo = this.sc.nextLine();

                    System.out.println("Estos son las ventanas disponibles: ");

                    this.catalogoVentanas();

                    System.out.println("Escoge el tipo de ventana: ");

                    String ventanasNuevas = this.sc.nextLine();


                    System.out.println("Estos son las Llantas disponibles: ");

                    this.catalogoLlantas();

                    System.out.println("Escoge el tipo de llantas: ");

                    String LlantasNuevas = this.sc.nextLine();

                    this.cambiarPieza(motorNuevo, ventanasNuevas, LlantasNuevas);


                    // System.out.println("Las piezas que escogistes son: ");

                    // System.out.println(ValoresCoche);



                   // System.out.println(ValoresCoche.setMotor(motorNuevo));




                }

                else if(opcionPieza == 2) {



                    System.out.println("Excelente, el total por este Coche es el siguiente: ");

                    System.out.println(ValoresCoche.toString());

                    this.cambiarPieza(ValoresCoche.getLlantas(), ValoresCoche.getVentanas(), ValoresCoche.getLlantas());

                    /*

                    System.out.println("Exelente, introduzca sus datos para pagar: ");

                    System.out.println("\n" + "Ingresa tus datos");

                    System.out.println("\n" + "Nombre Completo:");

                    String nombre = this.sc.nextLine();

                    System.out.println("\n" + "Telefono: ");

                    int telefono = Integer.parseInt(this.sc.nextLine());

                    System.out.println("\n" + "Email: ");

                    String email = this.sc.nextLine();

                    System.out.println("\n" + "Comprar: " + "\n" + "1.Si" + "\n" + "2.No, volver" + "\n");

                    int opcionComprar = Integer.parseInt(this.sc.nextLine());


                     */

                   // if (opcionComprar == 1) {}
                }

        }
        //else{
          //      System.out.println("No has escogido ningun coche");

            // }


        }

    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void catalogoMotor() {

        int numero = 0;

        for (Coches Llave: DiccionarioCoches.keySet()) {


            piezasCoche ValoresCoche = this.DiccionarioCoches.get(Llave);

            System.out.println(++numero + " " + ValoresCoche.getMotor());

        }
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void catalogoVentanas() {

        int numero = 0;

        for (Coches Llave: DiccionarioCoches.keySet()) {


            piezasCoche ValoresCoche = this.DiccionarioCoches.get(Llave);

            System.out.println(++numero + " " + ValoresCoche.getVentanas());

        }
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void catalogoLlantas() {

        int numero = 0;

        for (Coches Llave: DiccionarioCoches.keySet()) {


            piezasCoche ValoresCoche = this.DiccionarioCoches.get(Llave);

            System.out.println(++numero + " " + ValoresCoche.getLlantas());

        }
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // CAMBIAR PIEZAS

    private void cambiarPieza(String inputMotor, String inputVentanas, String inputLlantas) {

        for (Coches Llave: DiccionarioCoches.keySet()) {


            piezasCoche ValoresCoche = this.DiccionarioCoches.get(Llave);

            if (inputMotor.equals(ValoresCoche.getMotor()) && inputVentanas.equals(ValoresCoche.getVentanas()) && inputLlantas.equals(ValoresCoche.getLlantas())) {

                // no pongo inputMotor porque este es un numero
                // ValoresCoche.setMotor(ValoresCoche.getMotor());

                ValoresCoche.setPiezas(ValoresCoche.getMotor(), ValoresCoche.getVentanas(), ValoresCoche.getLlantas());


            }

            /*

            else if (inputVentanas.equals(ValoresCoche.getVentanas())) {

                ValoresCoche.setVentanas(ValoresCoche.getVentanas());
            }

            else if (inputLlantas.equals(ValoresCoche.getLlantas())) {

                ValoresCoche.setLlantas(ValoresCoche.getLlantas());
            }

            */



        }


    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
}

// ********************************************************************************************************

// ********************************************************************************************************







class Coches {


    private int id;
    private String modelo;
    private String color;
    private String marca;
    private double precio;
    private static int contadorCoches;

    public Coches(String modelo, String color, String marca, double precio) {

        this.id = contadorCoches++;
        this.modelo = modelo;
        this.color = color;
        this.marca = marca;
        this.precio = precio;



    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public int getId() {
        return id;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setId(int id) {
        this.id = id;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getModelo() {
        return modelo;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getColor() {
        return color;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setColor(String color) {
        this.color = color;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getMarca() {
        return marca;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public double getPrecio() {
        return precio;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static int getContadorCoches() {
        return contadorCoches;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public static void setContadorCoches(int contadorCoches) {
        Coches.contadorCoches = contadorCoches;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @Override
    public String toString() {
        return "Coches" +
                "id=" + id +
                ", modelo='" + modelo + '\'' +
                ", color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio;
    }
}


// ********************************************************************************************************

// ********************************************************************************************************







class piezasCoche {

    // DICCIONARIO CON EL REGISTRO DE COCHE, Y SUS CARACTERISTICAS
    Map<String, Double> piezasPrecios = new HashMap<String, Double>();
    // PRECIO TOTAL piezas

    ArrayList<Double> precioTotalPiezas = new ArrayList<Double>();


    private String motor;
    private double precioMotor;
    private String ventanas;
    private double precioVentanas;
    private String Llantas;
    private double precioLlantas;

public piezasCoche(String motor, double precioMotor, String ventanas, double precioVentanas, String Llantas, double precioLlantas) {

    this.motor = motor;
    this.precioMotor = precioMotor;
    this.ventanas = ventanas;
    this.precioVentanas = precioVentanas;
    this.Llantas = Llantas;
    this.precioLlantas = precioLlantas;

    this.piezasPrecios.put(this.motor, this.precioMotor);
    this.piezasPrecios.put(this.ventanas, this.precioVentanas);
    this.piezasPrecios.put(this.Llantas, this.precioLlantas);

}




// <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getMotor() {
        return motor;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setMotor(String motor) {



        for (String Llave: piezasPrecios.keySet()) {

                Double precios = this.piezasPrecios.get(Llave);

            if (Llave.equals(motor)) {

                System.out.println("El precio del motor " + Llave + " Es: " + precios);

            }
        }
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public double getPrecioMotor() {
        return precioMotor;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setPrecioMotor(double precioMotor) {
        this.precioMotor = precioMotor;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getVentanas() {
        return ventanas;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // set PARA CAMBIAR LAS VERNTANAS

    public void setVentanas(String ventanas) {
        for (String Llave: piezasPrecios.keySet()) {

            Double precios = this.piezasPrecios.get(Llave);

            if (Llave.equals(ventanas)) {

                System.out.println("El precio del motor " + Llave + " Es: " + precios);

            }
        }
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setLlantas(String llantas) {
        for (String Llave: piezasPrecios.keySet()) {

            Double precios = this.piezasPrecios.get(Llave);

            if (Llave.equals(llantas)) {

                System.out.println("El precio del motor " + Llave + " Es: " + precios);

            }
        }
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public double getPrecioVentanas() {
        return precioVentanas;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setPrecioVentanas(double precioVentanas) {
        this.precioVentanas = precioVentanas;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getLlantas() {
        return Llantas;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


    // SET PARA CAMBIAR PIEZAS, YA NO ES NECESARIO LOS METODOS SET ANTERIORES, ESTE METODO RECOPILA LOS 3 SETS

    public void setPiezas(String motor, String ventanas, String llantas) {


        for (String Llave: piezasPrecios.keySet()) {

            Double precios = this.piezasPrecios.get(Llave);

            if (Llave.equals(motor)) {

                System.out.println("El precio del motor " + Llave + " Es: " + precios);
                precioTotalPiezas.add(precios);
            }


            else if (Llave.equals(ventanas)) {

                System.out.println("El precio de las ventanas " + Llave + " Es: " + precios);
                precioTotalPiezas.add(precios);
            }


            else if (Llave.equals(llantas)) {

                System.out.println("El precio de las ventanas " + Llave + " Es: " + precios);
                precioTotalPiezas.add(precios);
            }
        }


        this.precioTotalPiezas();

            }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public double getPrecioLlantas() {
        return precioLlantas;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setPrecioLlantas(double precioLlantas) {
        this.precioLlantas = precioLlantas;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    // DESPUES DE AÑADIR A LA LISTA LOS PRECIOS ESCOGIDOS DE LAS PIEZAS, ESTE METODO SE ENCARGA DE SUMAR LOS PRECIOS

    private void precioTotalPiezas() {

        double total = 0;

        for (Double precios: precioTotalPiezas) {


            total += precios;
        }

        System.out.println("El precio total es: " + total);

    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @Override
    public String toString() {
        return "piezasCoche" +
                "motor='" + motor + '\n' +
                ", precioMotor='" + precioMotor + '\n' +
                ", ventanas='" + ventanas + '\n' +
                ", precioVentanas='" + precioVentanas + '\n' +
                ", Llantas='" + Llantas + '\n' +
                ", precioLlantas='" + precioLlantas + '\n';
    }
}

// ********************************************************************************************************

// ********************************************************************************************************





class Cliente {

    private String nombre;
    private int telefono;
    private String email;


    public Cliente(String nombre, int telefono, String email) {

        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getNombre() {
        return nombre;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public int getTelefono() {
        return telefono;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public String getEmail() {
        return email;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    public void setEmail(String email) {
        this.email = email;
    }

    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<


    // <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

    @Override
    public String toString() {
        return "cliente" +
                "nombre='" + nombre + '\n' +
                ", telefono=" + telefono + '\n' +
                ", email='" + email + '\n';
    }
}
