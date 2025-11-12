package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa la plataforma completa, almacenando los productos de suscripción
 * registrados y proporcionando funcionalidades de cálculo global
 */
public class PlataformaUdemy {

    private List<ProductoSuscripcion> listProductos;

    /**
     * Metodo que crea una nueva plataforma sin productos registrados.
     */
    public PlataformaUdemy() {
        this.listProductos = new ArrayList<>();
    }

    /**
     * Metodo que agrega un producto de suscripción a la plataforma
     * @param producto producto a registrar
     */
    public void agregarProducto(ProductoSuscripcion producto) {
        listProductos.add(producto);
    }

    public List<ProductoSuscripcion> getProductos() {
        return listProductos;
    }

    /**
     * Punto 3: calcula el ingreso mensual total de la plataforma
     * a partir de la lista de productos activos.
     */
    public double calcularIngresoMensualTotal() {
        double total = 0.0;
        for (ProductoSuscripcion producto : listProductos) {
            total += producto.calcularPrecioMensual();
        }
        return total;
    }
}

