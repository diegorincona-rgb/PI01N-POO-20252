package uniquindio.edu.co.model;

public class Producto {

    //Atributos
    private String id;
    private String nombre;
    private double precio;

    //Relacion
    private TipoProducto tipoProducto;


    public Producto(String id, String nombre, double precio,
                    TipoProducto tipoProducto){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.tipoProducto=tipoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", tipoProducto=" + tipoProducto +
                '}';
    }
}
