package uniquindio.edu.co.model;

public abstract class A extends Cuadrado{

    private int numero;

    public A(String nombre, double lado, int numero) {
        super(nombre, lado);
        this.numero=numero;
    }

    public abstract double calcularPerimetro();

}
