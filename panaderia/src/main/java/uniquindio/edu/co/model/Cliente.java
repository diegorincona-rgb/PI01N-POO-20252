package uniquindio.edu.co.model;

public class Cliente extends Persona implements IGestionPanaderia {

    private String muerte;


    public Cliente(String nombre, String apellido, String telefono, int edad, String muerte) {
        super(nombre, apellido, telefono, edad);
        this.muerte=muerte;
    }

    public Cliente(String nombre, String apellido, int edad, String muerte) {
        super(nombre, apellido, edad);
        this.muerte=muerte;
    }

    public Cliente(String nombre, String muerte) {
        super(nombre);
        this.muerte=muerte;
    }

    @Override
    public String hacerPan() {
        return "Cliente haciendo pan...........";
    }

}
