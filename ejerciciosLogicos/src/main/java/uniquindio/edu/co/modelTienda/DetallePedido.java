package uniquindio.edu.co.modelTienda;

public class DetallePedido {

    private int id;
    private int cantidad;
    private Producto producto;

    /**
     * Metodo constructor de la clase detallePedido
     * @param id del pedido
     * @param cantidad de productos del pedido
     * @param producto
     */
    public DetallePedido(int id, int cantidad, Producto producto) {
        this.id = id;
        this.cantidad = cantidad;
        this.producto = producto;
    }

    /**
     * Metodo que permite calcular el costo del detalle
     * @return
     */
    public double calcularTotal(){
        double total = 0;
        total = cantidad * producto.getPrecioUnitario();
        return total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return String.format("%-5d | %-15s | %10.2f", cantidad, producto.getNombre(), calcularTotal());
    }
}
