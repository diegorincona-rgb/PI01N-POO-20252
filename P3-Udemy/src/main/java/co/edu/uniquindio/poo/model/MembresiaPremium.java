package co.edu.uniquindio.poo.model;

/**
 * Representa una membresía premium con acceso global a la plataforma
 * Incluye parámetros como dispositivos permitidos y asesorías en vivo
 */
public class MembresiaPremium extends ProductoSuscripcion implements ProductoMovil, ProductoMonitoreable {

    private int dispositivosPermitidos;
    private boolean incluyeAsesoriasEnVivo;

    /**
     * Metodo constructor de membresía premium
     * @param codigo código único
     * @param nombre nombre de la membresía
     * @param precioBaseMensual precio base mensual
     * @param proveedor proveedor asociado
     * @param modalidadConsumo modalidad permitida
     * @param categoriaContenido categoría principal
     * @param dispositivosPermitidos cantidad de dispositivos permitidos
     * @param incluyeAsesoriasEnVivo indica si incluye asesorías
     */
    public MembresiaPremium(String codigo, String nombre, double precioBaseMensual, Proveedor proveedor, ModalidadConsumo modalidadConsumo, CategoriaContenido categoriaContenido, int dispositivosPermitidos, boolean incluyeAsesoriasEnVivo) {
        super(codigo, nombre, precioBaseMensual, proveedor, modalidadConsumo, categoriaContenido);
        this.dispositivosPermitidos = dispositivosPermitidos;
        this.incluyeAsesoriasEnVivo = incluyeAsesoriasEnVivo;
    }

    /**
     * Metodo que calcula el precio mensual de la membresía
     * - $5000 por cada dispositivo adicional
     * - +20% si incluye asesorías en vivo
     * @return precio mensual final
     */
    @Override
    public double calcularPrecioMensual() {
        double total = getPrecioBaseMensual();

        int dispositivosAdicionales = dispositivosPermitidos - 1;
        if (dispositivosAdicionales < 0) {
            dispositivosAdicionales = 0;
        }

        total += dispositivosAdicionales * 5000.0;

        if (incluyeAsesoriasEnVivo) {
            total = total * 1.20;
        }
        return total;
    }

    /**
     * Metodo que inicia sesión móvil del usuario
     * @param usuario identificador del usuario
     */
    @Override
    public void iniciarSesionMovil(String usuario) {
        System.out.println("Iniciando sesión móvil para la membresía '" +
                getNombre() + "' con el usuario: " + usuario);
    }

    /**
     * Metodo que permite generar un reporte del uso de la membresía.
     * @return reporte informativo del progreso
     */
    @Override
    public String generarReporteProgreso() {
        // Ejemplo simple
        return "Reporte de progreso de la membresía '" + getNombre() +
                "': usuario activo en 2 cursos este mes.";
    }

    public int getDispositivosPermitidos() {
        return dispositivosPermitidos;
    }

    public void setDispositivosPermitidos(int dispositivosPermitidos) {
        this.dispositivosPermitidos = dispositivosPermitidos;
    }

    public boolean isIncluyeAsesoriasEnVivo() {
        return incluyeAsesoriasEnVivo;
    }

    public void setIncluyeAsesoriasEnVivo(boolean incluyeAsesoriasEnVivo) {
        this.incluyeAsesoriasEnVivo = incluyeAsesoriasEnVivo;
    }
}

