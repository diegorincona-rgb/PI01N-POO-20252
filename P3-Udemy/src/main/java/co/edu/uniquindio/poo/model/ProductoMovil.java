package co.edu.uniquindio.poo.model;

/**
 * Interface que representa productos que permiten iniciar sesión desde
 * la aplicación móvil de la plataforma.
 */
public interface ProductoMovil {

    /**
     * Metodo que inica la sesión móvil de un usuario
     * @param usuario identificador del usuario
     */
    void iniciarSesionMovil(String usuario);

}
