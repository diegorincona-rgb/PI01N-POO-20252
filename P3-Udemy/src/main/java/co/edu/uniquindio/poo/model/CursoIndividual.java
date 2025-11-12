package co.edu.uniquindio.poo.model;

/**
 * Representa un curso individual de la plataforma Udemy.
 * Incluye horas de video, nivel de dificultad y permite consumo móvil
 * y monitoreo de progreso.
 */
public class CursoIndividual extends ProductoSuscripcion implements ProductoMovil, ProductoMonitoreable {

    private int horasVideo;
    private NivelDificultad nivel;

    /**
     * Metodo constructor de un curso individual
     * @param codigo código del curso
     * @param nombre nombre del curso
     * @param precioBaseMensual precio base mensual
     * @param proveedor proveedor responsable
     * @param modalidadConsumo modalidad permitida
     * @param categoriaContenido categoría del contenido
     * @param horasVideo horas de video del curso
     * @param nivel nivel de dificultad
     */
    public CursoIndividual(String codigo, String nombre, double precioBaseMensual, Proveedor proveedor, ModalidadConsumo modalidadConsumo, CategoriaContenido categoriaContenido, int horasVideo, NivelDificultad nivel) {
        super(codigo, nombre, precioBaseMensual, proveedor, modalidadConsumo, categoriaContenido);
        this.horasVideo = horasVideo;
        this.nivel = nivel;
    }

    /**
     * Metodo que calcula el precio mensual del curso
     * - Se suma $1000 por cada hora de video.
     * - Si el curso es avanzado, se incrementa un 15%.
     * @return precio final mensual del curso
     */
    @Override
    public double calcularPrecioMensual() {
        double total = getPrecioBaseMensual() + horasVideo * 1000.0;
        if (nivel == NivelDificultad.AVANZADO) {
            total = total * 1.15;
        }
        return total;
    }

    /**
     * Metodo que permite iniciar la sesión del usuario desde la aplicación
     * @param usuario nombre o identificador del usuario
     */
    @Override
    public void iniciarSesionMovil(String usuario) {
        System.out.println("Iniciando sesión móvil para el curso '" +
                getNombre() + "' con el usuario: " + usuario);
    }

    /**
     * Metodo que permite generar un reporte del avance del usuario en el curso.
     * @return descripción del estado del progreso
     */
    @Override
    public String generarReporteProgreso() {
        return "Reporte de progreso del curso '" + getNombre() +
                "': 60% de videos vistos.";
    }

    public int getHorasVideo() {
        return horasVideo;
    }

    public void setHorasVideo(int horasVideo) {
        this.horasVideo = horasVideo;
    }

    public NivelDificultad getNivel() {
        return nivel;
    }

    public void setNivel(NivelDificultad nivel) {
        this.nivel = nivel;
    }

}

