package uniquindio.edu.co.model;
import java.util.ArrayList;
import java.util.List;

/**
 * Representa un cliente de la empresa QuickBox.
 * Un cliente contiene sus datos personales (nombre, documento, teléfono, correo y dirección)
 * y mantiene la relación con los envíos que ha solicitado y los paquetes que ha registrado.
 * @author Raul Rivera
 * @version 1.0
 */
public class Cliente {

    /** Nombre completo del cliente. */
    private String nombre;

    /** Documento de identificación del cliente. */
    private String documento;

    /** Número de teléfono de contacto del cliente. */
    private String telefono;

    /** Correo electrónico del cliente. */
    private String correo;

    /** Dirección principal de residencia o contacto del cliente. */
    private String direccion;

    /** Lista de envíos solicitados por el cliente. */
    private List<Envio> listEnvioCliente;

    /** Lista de paquetes registrados por el cliente. */
    private List<Paquete> listPaquetes;

    /**
     * Metodo constructor de la clase cliente con la información básica.
     * @param nombre    nombre completo del cliente
     * @param documento documento de identificación
     * @param telefono  número de teléfono de contacto
     * @param correo    dirección de correo electrónico
     * @param direccion dirección principal de residencia
     */
    public Cliente(String nombre, String documento, String telefono, String correo, String direccion) {
        this.nombre = nombre;
        this.documento = documento;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.listEnvioCliente = new ArrayList<>();
        this.listPaquetes = new ArrayList<>();
    }

    /**
     * Obtiene el nombre del cliente.
     * @return nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del cliente.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento de identificación del cliente.
     * @return documento de identificación
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento de identificación del cliente.
     * @param documento nuevo documento
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Obtiene el número de teléfono del cliente.
     * @return teléfono de contacto
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el número de teléfono del cliente.
     * @param telefono nuevo número de teléfono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene el correo electrónico del cliente.
     * @return correo electrónico
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * Establece el correo electrónico del cliente.
     * @param correo nuevo correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Obtiene la dirección principal del cliente.
     * @return dirección principal
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección principal del cliente.
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la lista de envíos asociados al cliente.
     * @return lista de envíos
     */
    public List<Envio> getListEnvioCliente() {
        return listEnvioCliente;
    }

    /**
     * Establece la lista de envíos asociados al cliente.
     * @param listEnvioCliente nueva lista de envíos
     */
    public void setListEnvioCliente(List<Envio> listEnvioCliente) {
        this.listEnvioCliente = listEnvioCliente;
    }

    /**
     * Obtiene la lista de paquetes registrados por el cliente.
     * @return lista de paquetes
     */
    public List<Paquete> getListPaquetes() {
        return listPaquetes;
    }

    /**
     * Establece la lista de paquetes registrados por el cliente.
     * @param listPaquetes nueva lista de paquetes
     */
    public void setListPaquetes(List<Paquete> listPaquetes) {
        this.listPaquetes = listPaquetes;
    }

    /**
     * Devuelve una representación del objeto cliente,
     * mostrando sus datos básicos.
     * @return cadena con nombre, documento, teléfono, correo y dirección
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correo='" + correo + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
