package co.edu.uniquindio.poo.model;

/**
 * Representa un proveedor de productos de suscripción de la plataforma.
 */
public class Proveedor {

    private final String nombre;
    private final String nit;
    private final String pais;
    private final String correoContacto;

    /**
     * Metodo constructor de la clase proveedor
     * @param nombre del proveedor
     * @param nit número de identificación tributaria
     * @param pais país de origen del proveedor
     * @param correoContacto correo de contacto oficial
     */
    public Proveedor(String nombre, String nit, String pais, String correoContacto) {
        this.nombre = nombre;
        this.nit = nit;
        this.pais = pais;
        this.correoContacto = correoContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNit() {
        return nit;
    }

    public String getPais() {
        return pais;
    }

    public String getCorreoContacto() {
        return correoContacto;
    }

    @Override
    public String toString() {
        return "Proveedor{" +
                "nombre='" + nombre + '\'' +
                ", NIT='" + nit + '\'' +
                ", país='" + pais + '\'' +
                ", correo='" + correoContacto + '\'' +
                '}';
    }
}

