package uniquindio.edu.co.model;

public class B extends A {


    public B(String nombre, double lado, int numero) {
        super(nombre, lado, numero);
    }

    @Override
    public double calcularPerimetro() {
        return 0;
    }
}
