package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa una ruta de aprendizaje conformada por varios cursos individuales
 * Implementa el consumo móvil y la generación de reportes de progreso.
 */
public class RutaAprendizaje extends ProductoSuscripcion implements ProductoMovil, ProductoMonitoreable {

    private List<CursoIndividual> cursos;
    private double porcentajeDescuento; // 0–100

    /**
     * Metodo constructor de ruta de aprendizaje.
     * @param codigo código de la ruta
     * @param nombre nombre de la ruta
     * @param precioBaseMensual no se utiliza directamente en el cálculo
     * @param proveedor proveedor asociado
     * @param modalidadConsumo modalidad de consumo permitida
     * @param categoriaContenido categoría del contenido
     * @param porcentajeDescuento descuento aplicado sobre la suma de los cursos
     */
    public RutaAprendizaje(String codigo, String nombre, double precioBaseMensual, Proveedor proveedor, ModalidadConsumo modalidadConsumo, CategoriaContenido categoriaContenido, double porcentajeDescuento) {
        super(codigo, nombre, precioBaseMensual, proveedor, modalidadConsumo, categoriaContenido);
        this.porcentajeDescuento = porcentajeDescuento;
        this.cursos = new ArrayList<>();
    }

    public List<CursoIndividual> getCursos() {
        return cursos;
    }

    /**
     * Metodo que agrega un curso a la ruta
     * @param curso curso individual a agregar
     */
    public void agregarCurso(CursoIndividual curso) {
        if (curso != null) {
            cursos.add(curso);
        }
    }

    /**
     * Metodo que calcula el precio mensual de la ruta sumando los precios base
     * de cada curso y aplicando el descuento configurado.
     * @return precio mensual final de la ruta
     */
    @Override
    public double calcularPrecioMensual() {
        double sumaPreciosBaseCursos = 0.0;
        for (CursoIndividual curso : cursos) {
            sumaPreciosBaseCursos += curso.getPrecioBaseMensual();
        }
        double descuento = sumaPreciosBaseCursos * (porcentajeDescuento / 100.0);
        return sumaPreciosBaseCursos - descuento;
    }

    /**
     * Metodo que inicia sesión del usuario desde la app
     * @param usuario identificador del usuario
     */
    @Override
    public void iniciarSesionMovil(String usuario) {
        System.out.println("Iniciando sesión móvil para la ruta '" +
                getNombre() + "' con el usuario: " + usuario);
    }

    /**
     * Metodo que permite generar un reporte del avance del usuario en la ruta.
     * @return cadena con información de progreso
     */
    @Override
    public String generarReporteProgreso() {
        // Ejemplo simple
        return "Reporte de progreso de la ruta '" + getNombre() +
                "': 3 de 5 cursos completados.";
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

}

