package co.edu.uniquindio.poo.model;

public class Proveedor extends Contacto {

    private String nombreEmpresa;

    public Proveedor(String nombre, int telefono, String correo, String nombreEmpresa) {
        super(nombre, telefono, correo);
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombreEmpresa='" + nombreEmpresa + '\'' +
                '}';
    }
}

