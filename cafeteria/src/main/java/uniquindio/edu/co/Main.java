package uniquindio.edu.co;

import uniquindio.edu.co.model.Producto;
import uniquindio.edu.co.model.TipoProducto;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto("123",
                "gaseosa", 2500, TipoProducto.BEBIDA);

        Producto producto2 = new Producto("1235",
                "papas fritas", 2500, TipoProducto.COMIDA);

        System.out.println(producto.toString());
        System.out.println(producto2.toString());

    }
}