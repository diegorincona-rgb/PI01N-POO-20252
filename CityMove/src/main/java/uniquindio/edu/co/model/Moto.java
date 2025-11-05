package uniquindio.edu.co.model;

public class Moto extends Vehiculo implements IAlquiler {

    private double cilindraje;
    private boolean cascoIncluido;

    private final int TARIFA_BASE_MOTO = 1000;

    public Moto(String placa, String ubicacion, int capacidad, double cilindraje, boolean cascoIncluido) {
        super(placa, ubicacion, capacidad);
        this.cilindraje=cilindraje;
        this.cascoIncluido= false;
    }

    @Override
    public double calcularCostoAlquiler() {
        return 0;
    }
}
