package uniquindio.edu.co.model;

/**
 * Representa una ruta utilizada para un envío en el sistema QuickBox.
 * Una ruta contiene el origen, el destino y la distancia estimada en kilómetros.
 * Permite actualizar tanto el trayecto (origen/destino) como la distancia
 * cuando cambian las condiciones del envío.
 * @author Raul Rivera
 * @version 1.0
 */
public class Ruta {
    /** Ciudad o dirección de origen de la ruta. */
    private String origen;

    /** Ciudad o dirección de destino de la ruta. */
    private String destino;

    /** Distancia estimada en kilómetros. */
    private double distanciaKm;

    /**
     * Metodo constructor de la clase ruta.
     * @param origen      punto de origen
     * @param destino     punto de destino
     * @param distanciaKm distancia estimada en kilómetros
     */
    public Ruta(String origen, String destino, double distanciaKm) {
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
    }

    /**
     * Metodo que redefine el trayecto de la ruta (origen y destino).
     * @param nuevoOrigen  nuevo origen de la ruta
     * @param nuevoDestino nuevo destino de la ruta
     */
    public void redefinir(String nuevoOrigen, String nuevoDestino) {
        this.origen = nuevoOrigen;
        this.destino = nuevoDestino;
    }

    /**
     * Metodo que actualiza la distancia estimada de la ruta en kilómetros.
     * @param nuevaDistanciaKm nueva distancia en km
     */
    public void actualizarDistancia(double nuevaDistanciaKm) {
        this.distanciaKm = nuevaDistanciaKm;
    }

    /**
     * Obtiene el origen de la ruta.
     * @return origen
     */
    public String getOrigen() {
        return origen;
    }

    /**
     * Establece el origen de la ruta.
     * @param origen nuevo origen
     */
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    /**
     * Obtiene el destino de la ruta.
     * @return destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Establece el destino de la ruta.
     * @param destino nuevo destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
    }

    /**
     * Obtiene la distancia estimada de la ruta en kilómetros.
     * @return distancia en km
     */
    public double getDistanciaKm() {
        return distanciaKm;
    }

    /**
     * Establece la distancia estimada de la ruta en kilómetros.
     * @param distanciaKm nueva distancia en km
     */
    public void setDistanciaKm(double distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    /**
     * Devuelve una representación en cadena de la ruta,
     * mostrando el origen, el destino y la distancia.
     * @return cadena descriptiva de la ruta
     */
    @Override
    public String toString() {
        return "Ruta{" +
                "origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", distanciaKm=" + distanciaKm +
                '}';
    }
}
