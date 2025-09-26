package uniquindio.edu.co.modelTienda;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int id;
    private String fecha;
    private List<DetallePedido> listDetallePedido;

    /**
     * Metodo constructor de la clase pedido
     * @param id del pedido
     * @param fecha del pedido
     */
    public Pedido(int id, String fecha) {
        this.id = id;
        this.fecha = fecha;
        this.listDetallePedido = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar productos al pedido
     * @param idDetalle del detalle
     * @param producto
     * @param cantidad
     */
    public void agregarProducto(int idDetalle, Producto producto, int cantidad) {
        DetallePedido detalle = new DetallePedido(idDetalle, cantidad, producto);
        listDetallePedido.add(detalle);
    }

    /**
     * Metodo que permite eliminar un producto de la listDetallePedido
     * @param idProducto
     */
    public void eliminarProducto(String idProducto) {
        for (int i = 0; i < listDetallePedido.size(); i++) {
            if (listDetallePedido.get(i).getProducto().getId().equals(idProducto)) {
                listDetallePedido.remove(i);
                break;
            }
        }
    }

    /**
     * Metodo que permite calcular el costo total del pedido
     * @return
     */
    public double calcularCostoTotal() {
        double totalPedido = 0;
        for (DetallePedido detallePedido : listDetallePedido) {
            totalPedido += detallePedido.calcularTotal();
        }
        return totalPedido;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Pedido #" + id + " (" + fecha + ")\n");
        sb.append("-------------------------------------------\n");
        sb.append(String.format("%-5s | %-15s | %10s\n", "Cant", "Producto", "Total"));
        for (DetallePedido detallePedido : listDetallePedido) {
            sb.append(detallePedido.toString()).append("\n");
        }
        sb.append("-------------------------------------------\n");
        sb.append(String.format("%-5s | %-15s | %10.2f", "", "TOTAL PEDIDO", calcularCostoTotal()));
        return sb.toString();
    }

}
