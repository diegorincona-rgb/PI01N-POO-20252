package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class ClinicaVeterinaria {

    // Atributos
    private String nit;
    private String nombre;
    private String direccion;
    private String telefono;

    // Relaciones de agregación
    private List<Propietario> listPropietarios;
    private List<Veterinario> listVeterinarios;

    // Relaciones de Composición
    private List<Cita> listCitas;
    private List<Mascota> listMascotas;

    /**
     * Constructor de la clase clinica veterinaria
     * @param nit de la clinica
     * @param nombre de la clinica
     * @param direccion de la clinica
     * @param telefono de la clinica
     */
    public ClinicaVeterinaria(String nit, String nombre, String direccion, String telefono){
        this.nit=nit;
        this.nombre=nombre;
        this.direccion=direccion;
        this.telefono=telefono;
        this.listPropietarios = new ArrayList<>();
        this.listVeterinarios = new ArrayList<>();
        this.listCitas = new ArrayList<>();
        this.listMascotas = new ArrayList<>();
    }

    /**
     * Metodo que registra un nuevo propietario en la clínica veterinaria
     * @param propietario objeto {@link Propietario} que se desea registrar
     */
    public void registrarPropietario(Propietario propietario) {
        listPropietarios.add(propietario);
    }

    /**
     * Metodo que registra un nuevo veterinario en la clínica veterinaria
     * @param veterinario objeto {@link Veterinario} que se desea registrar
     */
    public void registrarVeterinario(Veterinario veterinario){
        listVeterinarios.add(veterinario);
    }

    /**
     * Registra una nueva mascota en la clínica veterinaria
     * @param mascota objeto {@link Mascota} que se desea registrar
     */
    public void registrarMascota(Mascota mascota){
        listMascotas.add(mascota);
    }

    /**
     * Asigna una nueva cita en la clínica veterinaria
     * @param cita objeto {@link Cita} que se desea registrar
     */
    public void asignarCita(Cita cita){
        listCitas.add(cita);
    }

    /**
     * Metodo que busca un propietario en la lista de propietarios a partir de su número de cédula.
     * @param cedula del propietario a buscar
     * @return objeto {@link Propietario} encontrado, o {@code null} si no existe
     */
    public Propietario buscarPropietarioPorCedula(String cedula){
        Propietario encontrado = null;
        for(Propietario propietario: listPropietarios){
            if(propietario.getCedula().equals(cedula)){
                encontrado = propietario;
                break;
            }
        }
        return encontrado;
    }

    /**
     * Metodo que busca una mascota en la lista de mascotas a partir de su identificador único
     * @param idMascota identificador de la mascota a buscar
     * @return objeto {@link Mascota} encontrado, o {@code null} si no existe
     */
    public Mascota buscarMascotaPorId(int idMascota){
        Mascota encontrada = null;
        for (Mascota mascota : listMascotas){
            if(mascota.getId() == idMascota){
                encontrada = mascota;
                break;
            }
        }
        return encontrada;
    }

    /**
     * Metodo que busca un veterinario en la lista de veterinarios a partir de su número de cédula.
     * @param cedula número de cédula del veterinario a buscar
     * @return objeto {@link Veterinario} encontrado, o {@code null} si no existe
     */
    public Veterinario buscarVeterinarioPorCedula(String cedula){
        Veterinario encontrado = null;
        for(Veterinario veterinario: listVeterinarios){
            if(veterinario.getCedula().equals(cedula)){
                encontrado = veterinario;
                break;
            }
        }
        return encontrado;
    }

    // Métodos Getters y Setters

    /**
     * Metodo para obtener la lista de citas
     * @return citas
     */
    public List<Cita> getListCitas() {
        return listCitas;
    }

    /**
     * Obtiene la lista de propietarios registrados en la clinica
     * @return lista de objetos {@link Propietario}
     */
    public List<Propietario> getListPropietarios() {
        return listPropietarios;
    }

    /**
     * Establece la lista de propietarios registrados en la clinica
     * @param listPropietarios lista de objetos {@link Propietario}
     */
    public void setListPropietarios(List<Propietario> listPropietarios) {
        this.listPropietarios = listPropietarios;
    }

    /**
     * Obtiene la lista de veterinarios registrados en la clinica
     * @return lista de objetos {@link Veterinario}
     */
    public List<Veterinario> getListVeterinarios() {
        return listVeterinarios;
    }

    /**
     * Establece la lista de veterinarios registrados en la clinica
     * @param listVeterinarios lista de objetos {@link Veterinario}
     */
    public void setListVeterinarios(List<Veterinario> listVeterinarios) {
        this.listVeterinarios = listVeterinarios;
    }

    /**
     * Establece la lista de citas registradas en la clinica
     * @param listCitas lista de objetos {@link Cita}
     */
    public void setListCitas(List<Cita> listCitas) {
        this.listCitas = listCitas;
    }

    /**
     * Obtiene la lista de mascotas registradas en la clinica
     * @return lista de objetos {@link Mascota}
     */
    public List<Mascota> getListMascotas() {
        return listMascotas;
    }

    /**
     * Establece la lista de mascotas registradas en la clinica
     * @param listMascotas lista de objetos {@link Mascota}
     */
    public void setListMascotas(List<Mascota> listMascotas) {
        this.listMascotas = listMascotas;
    }

    public boolean palindromo(String nombre){
        boolean palabraPalindroma = true;
        int inicio = 0; //0
        int fin = nombre.length()-1; //8
        //     4 < 4
        while(inicio<fin){
            //       o                             o
            if(nombre.charAt(inicio) != nombre.charAt(fin)){
                palabraPalindroma = false;
                break;
            }
            inicio++;
            fin--;
        }
        return palabraPalindroma;
    }

    public boolean esVocal(char letra){
        boolean vocal = false;
        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            vocal = true;
        }
        return vocal;
    }

    public List<String> obtenerListaVeterinariosVocales(){
        List<String> listaVeterinariosVocales = new ArrayList<>();
        for(Veterinario veterinario : listVeterinarios){
            String nombre = veterinario.getNombre();
            int cont = 0;

            for(int i = 0; i < nombre.length(); i++){
                if(esVocal(nombre.charAt(i))){
                    cont++;
                }
            }

            if(cont>=3){
                listaVeterinariosVocales.add(nombre + " total vocales: " + cont);
            }
        }
        return listaVeterinariosVocales;
    }

    //------SOLUCIÓN ITEM 2 DEL PARCIAL 1

    /**
     * PUNTO A
     * Implementar un método en la clase ClinicaVeterinaria que, dado el nombre de un veterinario, cuente cuántas citas tiene asignadas en la clínica veterinaria.
     */
    public int contarCitasDeVeterinario(String nombreVeterinario) {
        int contador = 0;
        String fechaHoy = "09/09/2025";
        for (Cita cita : listCitas) {
            if (cita.getFecha().equals(fechaHoy) && cita.getTheVeterinario().getNombre().equals(nombreVeterinario)) {
                contador++;
            }
        }
        return contador;
    }

    /**
     * PUNTO B
     * Implementar un método en la clase ClinicaVeterinaria que, dado el nombre de un veterinario, retorne true si existe en la clínica, y false en caso contrario.
     */
    public boolean existeVeterinario(String nombreVeterinario) {
        boolean exite = false;
        for (Veterinario veterinario : listVeterinarios) {
            if (veterinario.getNombre().equals(nombreVeterinario)) {
                exite = true;
                break;
            }
        }
        return exite;
    }

}
