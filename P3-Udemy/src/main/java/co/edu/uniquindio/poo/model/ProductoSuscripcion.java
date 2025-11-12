package co.edu.uniquindio.poo.model;

/**
 * Clase abstracta que representa un producto de suscripción dentro de la plataforma
 * Contiene la información general compartida entre todos los tipos de productos
 */
public abstract class ProductoSuscripcion {

    private String codigo;
    private String nombre;
    private double precioBaseMensual;
    private Proveedor proveedor;
    private ModalidadConsumo modalidadConsumo;
    private CategoriaContenido categoriaContenido;

    /**
     * Metodo constructor de un producto de suscripción
     * @param codigo código único del producto
     * @param nombre nombre del producto
     * @param precioBaseMensual precio base mensual del producto
     * @param proveedor proveedor responsable del producto
     * @param modalidadConsumo modalidad permitida de consumo
     * @param categoriaContenido categoría principal del contenido
     */
    public ProductoSuscripcion(String codigo, String nombre, double precioBaseMensual, Proveedor proveedor, ModalidadConsumo modalidadConsumo, CategoriaContenido categoriaContenido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioBaseMensual = precioBaseMensual;
        this.proveedor = proveedor;
        this.modalidadConsumo = modalidadConsumo;
        this.categoriaContenido = categoriaContenido;
    }

    /**
     * Metodo que calcula el precio mensual final del producto.
     * @return valor total mensual
     */
    public abstract double calcularPrecioMensual();

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBaseMensual() {
        return precioBaseMensual;
    }

    public Proveedor getProveedor() {
        return proveedor;
    }

    public ModalidadConsumo getModalidadConsumo() {
        return modalidadConsumo;
    }

    public CategoriaContenido getCategoriaContenido() {
        return categoriaContenido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}

