package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa un envío dentro de la empresa QuickBox.
 * Un envío contiene la información básica de registro (código, fecha, estado,
 * modalidad, método de pago y costo base), además de las relaciones con un cliente,
 * una ruta, un repartidor y los paquetes incluidos. El costo final de un envío
 * se calcula considerando el costo base, la distancia de la ruta y recargos
 * por modalidad o fragilidad.
 * @author Raul Rivera
 * @version 1.0
 */
public class Envio {

    /** Estado inicial de un envío al ser creado. */
    public static final String ESTADO_CREADO = "Creado";

    /** Estado de un envío cuando se encuentra en tránsito. */
    public static final String ESTADO_EN_TRANSITO = "En tránsito";

    /** Estado de un envío cuando ha sido entregado. */
    public static final String ESTADO_ENTREGADO = "Entregado";

    /** Estado de un envío cuando ha sido cancelado. */
    public static final String ESTADO_CANCELADO = "Cancelado";

    /** Modalidad urgente del envío. */
    public static final String MODALIDAD_URGENTE = "Urgente";

    // ----------------- Atributos -----------------
    /** Código único del envío. */
    private String codigo;

    /** Fecha de creación del envío. */
    private String fechaCreacion;

    /** Estado actual del envío. */
    private String estado;

    /** Modalidad del envío (ej: Estandar, Urgente). */
    private String modalidad;

    /** Método de pago utilizado para el envío. */
    private String metodoPago;

    /** Costo base definido para el envío. */
    private double costoBase;

    // ----------------- Relaciones -----------------
    /** Ruta asignada al envío. */
    private Ruta ruta;

    /** Cliente que solicita el envío. */
    private Cliente cliente;

    /** Lista de paquetes incluidos en el envío. */
    private final List<Paquete> listPaqueteEnvio;

    /** Repartidor encargado del envío. */
    private Repartidor repartidor;

    /**
     * Constructor de la clase envío.
     * @param codigo            código único del envío
     * @param fechaCreacion     fecha de creación
     * @param modalidad         modalidad del envío
     * @param metodoPago        método de pago
     * @param costoBase         costo base definido
     * @param cliente           cliente solicitante
     * @param ruta              ruta del envío
     * @param repartidor        repartidor asignado
     * @param paquetesIniciales lista inicial de paquetes (puede ser null)
     */
    public Envio(String codigo, String fechaCreacion, String modalidad, String metodoPago, double costoBase, Cliente cliente, Ruta ruta, Repartidor repartidor,
                 List<Paquete> paquetesIniciales) {
        this.codigo = codigo;
        this.fechaCreacion = fechaCreacion;
        this.modalidad = modalidad;
        this.metodoPago = metodoPago;
        this.costoBase = costoBase;
        this.estado = "Creado";

        // relaciones
        this.cliente = cliente;
        this.ruta = ruta;
        this.repartidor = repartidor;

        // lista paquetes
        this.listPaqueteEnvio = new ArrayList<>();
        if (paquetesIniciales != null) {
            this.listPaqueteEnvio.addAll(paquetesIniciales);
        }
    }

    // ----------------- Gestión de Paquetes -----------------

    /**
     * Metodo que permite agregar paquete al envío.
     * @param paquete paquete a agregar
     * @return true si se agregó correctamente
     */
    public boolean agregarPaquete(Paquete paquete) {
        return listPaqueteEnvio.add(paquete);
    }

    /**
     * Metodo que calcula el peso total en kilogramos de los paquetes del envío.
     * @return peso total en kg
     */
    public double calcularPesoTotalKg() {
        double total = 0.0;
        for (Paquete paquete : listPaqueteEnvio) {
            total += paquete.getPesoKg();
        }
        return total;
    }

    /**
     * Metodo que calcula el volumen total en centímetros cúbicos de los paquetes del envío.
     * @return volumen total en cm³
     */
    public double calcularVolumenTotalCm3() {
        double total = 0.0;
        for (Paquete paquete : listPaqueteEnvio) {
            total += paquete.calcularVolumenCm3();
        }
        return total;
    }

    // ----------------- Gestión de Ruta -----------------

    /**
     * Define la ruta del envío.
     * @param ruta ruta a asignar
     */
    public void definirRuta(Ruta ruta) {
        this.ruta = ruta;
    }

    /**
     * Obtiene la ruta asignada al envío.
     * @return ruta actual
     */
    public Ruta obtenerRuta() {
        return ruta;
    }

    // ----------------- Gestión de Repartidor -----------------

    /**
     * Metodo que asigna un repartidor al envío, siempre que esté disponible.
     * @param repartidor repartidor a asignar
     * @return true si se asignó correctamente
     */
    public boolean asignarRepartidor(Repartidor repartidor) {
        if (repartidor != null && repartidor.estaDisponible()) {
            this.repartidor = repartidor;
            repartidor.aceptarAsignacion(this);
            return true;
        }
        return false;
    }

    /**
     * Metodo que obtiene el repartidor asignado al envío.
     * @return repartidor actual, o null si no hay
     */
    public Repartidor obtenerRepartidorAsignado() {
        return repartidor;
    }

    // ----------------- Validaciones -----------------

    /**
     * Metodo que Valida que el peso y volumen totales de los paquetes
     * no excedan los límites permitidos.
     * @param pesoMaxKg     peso máximo en kg
     * @param volumenMaxCm3 volumen máximo en cm³
     * @return true si los valores están dentro de los límites
     */
    public boolean validarLimites(double pesoMaxKg, double volumenMaxCm3) {
        double peso = calcularPesoTotalKg();
        double volumen = calcularVolumenTotalCm3();
        return peso <= pesoMaxKg && volumen <= volumenMaxCm3;
    }

    // ----------------- Costos -----------------

    /**
     * Metodo que calcula el recargo por modalidad, si es urgente.
     * @return monto adicional en pesos
     */
    public double calcularRecargoModalidad() {
        if (MODALIDAD_URGENTE.equals(modalidad)) {
            return 15000.0;
        }
        return 0.0;
    }

    /**
     * Metodo que calcula el recargo si existe al menos un paquete frágil.
     * @return monto adicional en pesos
     */
    public double calcularRecargoFragilidad() {
        for (Paquete paquete : listPaqueteEnvio) {
            if (paquete.isFragil()) {
                return 5000.0;
            }
        }
        return 0.0;
    }

    /**
     * Metodo que calcula el costo por distancia según la ruta.
     * @return monto adicional en pesos
     */
    public double calcularCostoPorDistancia() {
        if (ruta != null) {
            return ruta.getDistanciaKm() * 1000.0;
        }
        return 0.0;
    }

    /**
     * Metodoq que calcula el costo final del envío,
     * sumando costo base, distancia, modalidad y fragilidad.
     * @return costo total del envío
     */
    public double calcularCostoFinal() {
        double costo = calcularCostoPorDistancia() + calcularRecargoModalidad() + calcularRecargoFragilidad();
        return costo;
    }

    // ----------------- Getters/Setters útiles -----------------

    /** @return código del envío */
    public String getCodigo() { return codigo; }
    /** @return fecha de creación */
    public String getFechaCreacion() { return fechaCreacion; }
    /** @return modalidad actual */
    public String getModalidad() { return modalidad; }
    /** @return método de pago */
    public String getMetodoPago() { return metodoPago; }
    /** @return costo base */
    public double getCostoBase() { return costoBase; }
    /** @return cliente asociado */
    public Cliente getCliente() { return cliente; }
    /** @param modalidad nueva modalidad */
    public void setModalidad(String modalidad) { this.modalidad = modalidad; }
    /** @param metodoPago nuevo método de pago */
    public void setMetodoPago(String metodoPago) { this.metodoPago = metodoPago; }
    /** @param costoBase nuevo costo base */
    public void setCostoBase(double costoBase) { this.costoBase = costoBase; }

    /**
     * Devuelve una representación en cadena del envío,
     * mostrando sus datos principales y relaciones.
     * @return cadena descriptiva del envío
     */
    @Override
    public String toString() {
        return "Envio{" +
                "codigo='" + codigo + '\'' +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                ", estado='" + estado + '\'' +
                ", modalidad='" + modalidad + '\'' +
                ", metodoPago='" + metodoPago + '\'' +
                ", costoBase=" + costoBase +
                ", ruta=" + ruta +
                ", cliente=" + cliente +
                ", paquetes=" + listPaqueteEnvio +
                ", repartidor=" + repartidor +
                '}';
    }
}
