package co.edu.uniquindio.poo.model;

/**
 * Interface que representa productos que permiten generar un reporte
 * del progreso del usuario.
 */
public interface ProductoMonitoreable {

    /**
     * Metodo que genera un resumen del avance del usuario dentro del producto.
     * @return cadena con el reporte de progreso
     */
    String generarReporteProgreso();
}
