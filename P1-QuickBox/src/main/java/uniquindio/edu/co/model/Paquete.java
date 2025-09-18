package uniquindio.edu.co.model;

/**
 * Representa un paquete dentro del sistema de envíos de QuickBox.
 * Cada paquete tiene un código interno único, características físicas
 * (peso, largo, ancho, alto), el contenido declarado y una bandera que indica
 * si es frágil o no. También permite calcular su volumen en centímetros cúbicos.
 * @author Raul Rivera
 * @version 1.0
 */
public class Paquete {

    /** Código interno que identifica de forma única al paquete. */
    private String codigoInterno;

    /** Peso del paquete en kilogramos. */
    private double pesoKg;

    /** Largo del paquete en centímetros. */
    private double largoCm;

    /** Ancho del paquete en centímetros. */
    private double anchoCm;

    /** Alto del paquete en centímetros. */
    private double altoCm;

    /** Contenido declarado del paquete. */
    private String contenido;

    /** Indica si el paquete es frágil. */
    private boolean fragil;

    /**
     * Metodo constructor de la clase paquete.
     * @param codigoInterno código interno único
     * @param pesoKg        peso del paquete en kg
     * @param largoCm       largo en cm
     * @param anchoCm       ancho en cm
     * @param altoCm        alto en cm
     * @param contenido     descripción del contenido
     * @param fragil        true si el paquete es frágil, false en caso contrario
     */
    public Paquete(String codigoInterno, double pesoKg, double largoCm, double anchoCm, double altoCm,  String contenido, boolean fragil) {
        this.codigoInterno = codigoInterno;
        this.pesoKg = pesoKg;
        this.largoCm = largoCm;
        this.anchoCm = anchoCm;
        this.altoCm = altoCm;
        this.contenido = contenido;
        this.fragil = fragil;
    }

    /**
     * Metodo que permite calcular el volumen del paquete en centímetros cúbicos.
     * @return volumen en cm³
     */
    public double calcularVolumenCm3() {
        double volumen = largoCm * anchoCm * altoCm;
        return volumen;
    }

    /**
     * Obtiene el código interno del paquete.
     * @return código interno
     */
    public String getCodigoInterno() {
        return codigoInterno;
    }

    /**
     * Establece el código interno del paquete.
     * @param codigoInterno nuevo código interno
     */
    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    /**
     * Obtiene el peso del paquete en kilogramos.
     * @return peso en kg
     */
    public double getPesoKg() {
        return pesoKg;
    }

    /**
     * Establece el peso del paquete en kilogramos.
     * @param pesoKg nuevo peso en kg
     */
    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    /**
     * Obtiene el largo del paquete en centímetros.
     * @return largo en cm
     */
    public double getLargoCm() {
        return largoCm;
    }

    /**
     * Establece el largo del paquete en centímetros.
     * @param largoCm nuevo largo en cm
     */
    public void setLargoCm(double largoCm) {
        this.largoCm = largoCm;
    }

    /**
     * Obtiene el ancho del paquete en centímetros.
     * @return ancho en cm
     */
    public double getAnchoCm() {
        return anchoCm;
    }

    /**
     * Establece el ancho del paquete en centímetros.
     * @param anchoCm nuevo ancho en cm
     */
    public void setAnchoCm(double anchoCm) {
        this.anchoCm = anchoCm;
    }

    /**
     * Obtiene el alto del paquete en centímetros.
     * @return alto en cm
     */
    public double getAltoCm() {
        return altoCm;
    }

    /**
     * Establece el alto del paquete en centímetros.
     * @param altoCm nuevo alto en cm
     */
    public void setAltoCm(double altoCm) {
        this.altoCm = altoCm;
    }

    /**
     * Obtiene la descripción del contenido del paquete.
     * @return contenido declarado
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * Establece la descripción del contenido del paquete.
     * @param contenido nuevo contenido
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    /**
     * Indica si el paquete es frágil.
     * @return true si es frágil, false en caso contrario
     */
    public boolean isFragil() {
        return fragil;
    }

    /**
     * Establece si el paquete es frágil.
     * @param fragil true si es frágil, false en caso contrario
     */
    public void setFragil(boolean fragil) {
        this.fragil = fragil;
    }

    /**
     * Devuelve una representación en cadena del paquete
     * mostrando sus atributos principales.
     * @return cadena descriptiva del paquete
     */
    @Override
    public String toString() {
        return "Paquete{" +
                "codigoInterno='" + codigoInterno + '\'' +
                ", pesoKg=" + pesoKg +
                ", largoCm=" + largoCm +
                ", anchoCm=" + anchoCm +
                ", altoCm=" + altoCm +
                ", contenido='" + contenido + '\'' +
                ", fragil=" + fragil +
                '}';
    }
}
