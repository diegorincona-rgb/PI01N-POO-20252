package uniquindio.edu.co.model;

public class Auto extends Vehiculo implements IAlquiler {

    private int numPuertas;
    private final int TARIFA_BASE_AUTO = 1500;

    public Auto(String placa, String ubicacion, int capacidad, int numPuertas) {
        super(placa, ubicacion, capacidad);
        this.numPuertas = numPuertas;
    }

    @Override
    public double calcularCostoAlquiler() {
        return TARIFA_BASE_AUTO * 10;
    }
}
