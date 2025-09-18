package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Propietario {

    // Atributos
    private String nombre;
    private String cedula;
    private String telefono;

    // Relaciones de asociación
    private List<Mascota> listMascotasPropietario;

    /**
     * Constructor de la clase propitario
     * @param nombre del propietario
     * @param cedula del propietario
     * @param telefono del propietario
     */
    public Propietario(String nombre, String cedula, String telefono){
        this.nombre=nombre;
        this.cedula=cedula;
        this.telefono=telefono;
        this.listMascotasPropietario = new ArrayList<>();
    }

    /**
     * Metodo que permite asignarle mascotas al veterinario
     * @param mascota
     */
    public void asignarMascotaPropietario(Mascota mascota){
        listMascotasPropietario.add(mascota);
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", telefono='" + telefono + '\'' +
                ", listMascotasPropietario=" + listMascotasPropietario +
                '}';
    }

    // Métodos Getters y Setters

    /**
     * Obtiene el nombre del propietario.
     * @return nombre del propietario
     */
    public String getNombre(){
        return nombre;
    }

    /**
     * Establece el nombre del propietario.
     * @param nombre del propietario
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene la cédula del propietario
     * @return cédula del propietario
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Establece la cédula del propietario
     * @param cedula del propietario
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Obtiene el teléfono de contacto del propietario.
     * @return teléfono del propietario
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * Establece el teléfono de contacto del propietario
     * @param telefono número de contacto del propietario
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * Obtiene la lista de mascotas asociadas al propietario
     * @return lista de objetos {@link Mascota} pertenecientes al propietario
     */
    public List<Mascota> getListMascotas() {
        return listMascotasPropietario;
    }

    /**
     * Establece la lista de mascotas del propietario
     * @param listMascotasPropietario lista de objetos {@link Mascota} que pertenecen al propietario
     */
    public void setListMascotas(List<Mascota> listMascotasPropietario) {
        this.listMascotasPropietario = listMascotasPropietario;
    }
}
