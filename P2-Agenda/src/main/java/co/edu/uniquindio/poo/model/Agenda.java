package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

    //Atributos
    private int idAgenda;
    private String nombre;

    //Relacion
    private List<Contacto> listContactos;

    /**
     * Metodo constructor de la clase agenda
     * @param idAgenda de la agenda
     * @param nombre de la agenda
     */
    public Agenda(int idAgenda, String nombre) {
        this.idAgenda = idAgenda;
        this.nombre = nombre;
        this.listContactos = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar contactos a la lista de contactos
     * @param contacto
     */
    public void agregarContacto(Contacto contacto){
        if(!verificarContacto(contacto)){
            listContactos.add(contacto);
            System.out.println("Contacto agregado: " + contacto.getNombre());
        }else{
            System.out.println("El contacto ya existe" + contacto.getNombre());
        }
    }

    /**
     * Metodo que permite verificar que un contacto no este regsitrado
     * @param contacto
     * @return
     */
    public boolean verificarContacto(Contacto contacto){
        boolean bandera = false;
        for(Contacto cont : listContactos){
            if(cont.getTelefono() == contacto.getTelefono()){
                bandera = true;
            }
        }
        return bandera;
    }

    /**
     * Metodo para buscar contactos por nombre
     * @param nombreBuscado
     * @return contacto
     */
    public List<Contacto> buscarContactoPorNombre(String nombreBuscado){
        List<Contacto> resultadoContactos = new ArrayList<>();
        for(Contacto cont : listContactos){
            if(cont.getNombre().toLowerCase().contains(nombreBuscado.toLowerCase())){
                resultadoContactos.add(cont);
            }
        }
        return resultadoContactos;
    }

    /**
     * Metodo para ordernar contactos por nombre
     */
    public void ordenarContactosPorNombre(){
        for(int i = 0; i < listContactos.size()-1; i++){
            for(int j = i+1; j < listContactos.size(); j++){
                String nombre1 = listContactos.get(i).getNombre(); // maria
                String nombre2 = listContactos.get(j).getNombre(); // juan
                if(nombre1.compareToIgnoreCase(nombre2) > 0){
                    Contacto uax = listContactos.get(i);
                    listContactos.set(i, listContactos.get(j));
                    listContactos.set(j, uax);
                }
            }
        }
    }

    /**
     * PUNTO 2B
     * Metodo que permite contar la cantidad de clientes por nivel de fidelidad
     * @param nivel nivel de fidelidad a buscar
     * @return cantidad de clientes que tienen ese nivel
     */
    public int contarClientesPorNivel(NivelFidelidad nivel) {
        int contador = 0;

        for (Contacto c : listContactos) {
            if (c instanceof Cliente) {
                Cliente cli = (Cliente) c;
                if (cli.getNivelFidelidad() == nivel) {
                    contador++;
                }
            }
        }
        return contador;
    }

    /**
     * Metodo para determianr que proveedores tienen un numero de telefono capicuo
     * @return proveedoresCapicuas
     */
    public List<Contacto> obtenerProveederoresCapicua(){
        List<Contacto> proveedoresCapicuas = new ArrayList<>();
        //Recorrer la lista de contactos
        for(Contacto cont : listContactos){
            if(cont instanceof Proveedor){
                if(cont.isNumeroCapicuo(cont.getTelefono())){
                    proveedoresCapicuas.add(cont);
                }
            }
        }
        return proveedoresCapicuas;
    }

}

