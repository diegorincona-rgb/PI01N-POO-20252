package uniquindio.edu.co.model;

public class Bicicleta extends Vehiculo {

    private int numCambios;

    public Bicicleta(String placa, String ubicacion, int capacidad, int numCambios) {
        super(placa, ubicacion, capacidad);
        this.numCambios=numCambios;
    }

}
