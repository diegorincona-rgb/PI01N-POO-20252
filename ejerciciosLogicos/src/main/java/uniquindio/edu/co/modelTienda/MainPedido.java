package uniquindio.edu.co.modelTienda;

public class MainPedido {

    public static void main(String[] args) {
        Producto p1 = new Producto("1", "Café", 5000);
        Producto p2 = new Producto("2", "Pan", 2000);
        Producto p3 = new Producto("3", "Leche", 3000);

        Pedido pedido = new Pedido(101, "25/09/2025");

        pedido.agregarProducto(1, p1, 2); // 2 cafés
        pedido.agregarProducto(2, p2, 5); // 5 panes
        pedido.agregarProducto(3, p3, 1); // 1 leche

        System.out.println(pedido);

        System.out.println("\n--- Eliminando Pan ---");
        pedido.eliminarProducto("2");

        System.out.println(pedido);
    }

}
