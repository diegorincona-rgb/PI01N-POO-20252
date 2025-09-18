package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un repartidor en el sistema de mensajería QuickBox.
 * Cada repartidor tiene datos de identificación, el tipo de vehículo con el que realiza entregas,
 * la matrícula (si aplica) y un estado de disponibilidad. Un repartidor puede ser asignado
 * a diferentes envíos en fechas distintas.
 * @author Raul Rivera
 * @version 1.0
 */
public class Repartidor {

    /** Nombre completo del repartidor. */
    private String nombre;

    /** Documento de identificación del repartidor. */
    private String documento;

    /** Tipo de vehículo utilizado (bicicleta, moto, furgón, etc.). */
    private String tipoVehiculo;

    /** Matrícula del vehículo (si aplica). */
    private String matricula;

    /** Indica si el repartidor está disponible para un nuevo envío. */
    private boolean disponible;

    /** Lista de envíos que han sido asignados a este repartidor. */
    private List<Envio> enviosAsignados;

    /**
     * Metodo constructor de la clase repartidor.
     * Inicialmente se marca como disponible.
     * @param nombre       nombre completo del repartidor
     * @param documento    documento de identificación
     * @param tipoVehiculo tipo de vehículo que utiliza
     * @param matricula    matrícula del vehículo (si aplica)
     */
    public Repartidor(String nombre, String documento, String tipoVehiculo, String matricula) {
        this.nombre = nombre;
        this.documento = documento;
        this.tipoVehiculo = tipoVehiculo;
        this.matricula = matricula;
        this.disponible = true;                 // al inicio está disponible
        this.enviosAsignados = new ArrayList<>();
    }

    /**
     * Metodo que verifica si el repartidor está disponible para asignaciones.
     * @return true si está disponible, false si está ocupado
     */
    public boolean estaDisponible() {
        return disponible;
    }

    /**
     * Metodo que acepta la asignación de un envío, marcando al repartidor como ocupado.
     * Si se recibe un envío válido y el repartidor está disponible, se agrega
     * a la lista de envíos asignados y se cambia el estado de disponibilidad.
     * @param envio objeto {@link Envio} a asignar
     */
    public void aceptarAsignacion(Envio envio) {
        if (envio != null && disponible) {
            enviosAsignados.add(envio);
            this.disponible = false; // queda ocupado
            System.out.println("Repartidor " + nombre + " aceptó el envío " + envio.getCodigo());
        }
    }

    /**
     * Obtiene el nombre del repartidor.
     * @return nombre completo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del repartidor.
     * @param nombre nuevo nombre completo
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento de identificación del repartidor.
     * @return documento de identificación
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Establece el documento de identificación del repartidor.
     * @param documento nuevo documento
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * Obtiene el tipo de vehículo del repartidor.
     * @return tipo de vehículo
     */
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    /**
     * Establece el tipo de vehículo del repartidor.
     * @param tipoVehiculo nuevo tipo de vehículo
     */
    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    /**
     * Obtiene la matrícula del vehículo.
     * @return matrícula del vehículo
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Establece la matrícula del vehículo.
     * @param matricula nueva matrícula
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Devuelve una representación en cadena del repartidor,
     * mostrando sus datos principales y el estado de disponibilidad.
     * @return cadena descriptiva del repartidor
     */
    @Override
    public String toString() {
        return "Repartidor{" +
                "nombre='" + nombre + '\'' +
                ", documento='" + documento + '\'' +
                ", tipoVehiculo='" + tipoVehiculo + '\'' +
                ", matricula='" + matricula + '\'' +
                ", disponible=" + disponible +
                ", enviosAsignados=" + enviosAsignados +
                '}';
    }
}
