package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la empresa de mensajería QuickBox.
 * La empresa conserva sus datos básicos (nombre, NIT y dirección comercial) y
 * administra el registro de clientes, repartidores, rutas y envíos.
 * Además, permite calcular la facturación total y gestionar la asignación de paquetes
 * a los envíos.
 * @author Raul Rivera
 * @version 1.0
 */
public class Empresa {

    /** Nombre de la empresa. */
    private String nombre;

    /** Número de identificación de la empresa. */
    private String nit;

    /** Dirección comercial de la empresa. */
    private String direccion;

    /** Lista de envíos registrados en la empresa. */
    private List<Envio> listEnvios;

    /** Lista de clientes registrados en la empresa. */
    private List<Cliente> listClientes;

    /** Lista de repartidores registrados en la empresa. */
    private List<Repartidor> listRepartidores;

    /** Lista de rutas registradas en la empresa. */
    private List<Ruta> listRutas;

    /**
     * Constructor de la clase empresa.
     * @param nombre    nombre de la empresa
     * @param nit       número de identificación tributaria
     * @param direccion dirección comercial
     */
    public Empresa(String nombre, String nit, String direccion) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.listEnvios = new ArrayList<>();
        this.listClientes = new ArrayList<>();
        this.listRepartidores = new ArrayList<>();
        this.listRutas = new ArrayList<>();
    }

    /**
     * Registra un nuevo envío en la empresa.
     * @param envio objeto {@link Envio} a registrar
     */
    public void registrarEnvio(Envio envio) {
        listEnvios.add(envio);
    }

    /**
     * Registra un nuevo cliente en la empresa.
     * @param cliente objeto {@link Cliente} a registrar
     */
    public void registrarCliente(Cliente cliente){
        listClientes.add(cliente);
    }

    /**
     * Registra un nuevo repartidor en la empresa.
     * @param repartidor objeto {@link Repartidor} a registrar
     */
    public void registrarRepartidor(Repartidor repartidor){
        listRepartidores.add(repartidor);
    }

    /**
     * Registra una nueva ruta en la empresa.
     * @param ruta objeto {@link Ruta} a registrar
     */
    public void registrarRuta(Ruta ruta){
        listRutas.add(ruta);
    }

    /**
     * Metodo que permite registrar un paquete en un envío existente, buscando por código.
     * @param codigoEnvio código del envío al que se le asignará el paquete
     * @param paquete     objeto {@link Paquete} a registrar
     * @return true si el paquete fue agregado correctamente, false si no se encontró el envío
     */
    public boolean registrarPaquete(String codigoEnvio, Paquete paquete) {
        for (int i = 0; i < listEnvios.size(); i++) {
            Envio envio = listEnvios.get(i);
            if (envio.getCodigo().equals(codigoEnvio)) {
                return envio.agregarPaquete(paquete);
            }
        }
        return false; // no se encontró el envío
    }

    /**
     * Metodo que permite calcular la facturación total de la empresa,
     * sumando el costo final de todos los envíos registrados.
     * @return monto total facturado
     */
    public double calcularFacturacion() {
        double total = 0.0;
        for (int i = 0; i < listEnvios.size(); i++) {
            Envio envio = listEnvios.get(i);
            total += envio.calcularCostoFinal();
        }
        return total;
    }

    // ---------------- Getters y Setters ----------------

    /**
     * Obtiene el nombre de la empresa.
     * @return nombre de la empresa
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la empresa.
     * @param nombre nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el NIT de la empresa.
     * @return NIT
     */
    public String getNit() {
        return nit;
    }

    /**
     * Establece el NIT de la empresa.
     * @param nit nuevo número de identificación tributaria
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Obtiene la dirección comercial de la empresa.
     * @return dirección comercial
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Establece la dirección comercial de la empresa.
     * @param direccion nueva dirección
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Obtiene la lista de envíos registrados en la empresa.
     * @return lista de envíos
     */
    public List<Envio> getListEnvios() {
        return listEnvios;
    }

    /**
     * Establece la lista de envíos registrados en la empresa.
     * @param listEnvios nueva lista de envíos
     */
    public void setListEnvios(List<Envio> listEnvios) {
        this.listEnvios = listEnvios;
    }

    /**
     * Obtiene la lista de clientes registrados en la empresa.
     * @return lista de clientes
     */
    public List<Cliente> getListClientes() {
        return listClientes;
    }

    /**
     * Establece la lista de clientes registrados en la empresa.
     * @param listClientes nueva lista de clientes
     */
    public void setListClientes(List<Cliente> listClientes) {
        this.listClientes = listClientes;
    }

    /**
     * Obtiene la lista de repartidores registrados en la empresa.
     * @return lista de repartidores
     */
    public List<Repartidor> getListRepartidores() {
        return listRepartidores;
    }

    /**
     * Establece la lista de repartidores registrados en la empresa.
     * @param listRepartidores nueva lista de repartidores
     */
    public void setListRepartidores(List<Repartidor> listRepartidores) {
        this.listRepartidores = listRepartidores;
    }

    /**
     * Devuelve una representación de la empresa,
     * mostrando sus datos y las listas de elementos registrados.
     * @return cadena con información de la empresa
     */
    @Override
    public String toString() {
        return "Empresa{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", listEnvios=" + listEnvios +
                ", listClientes=" + listClientes +
                ", listRepartidores=" + listRepartidores +
                ", listRutas=" + listRutas +
                '}';
    }
}
