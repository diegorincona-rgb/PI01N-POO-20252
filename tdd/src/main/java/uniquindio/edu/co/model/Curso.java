package uniquindio.edu.co.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Atributos
    private int codigo;
    private String nombre;

    //Relaciones
    private List<Estudiante> listEstudiantes;

    /**
     * Metodo constructor de la clase curso
     * @param codigo del curso
     * @param nombre del curso
     */
    public Curso(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listEstudiantes = new ArrayList<>();
    }

    /**
     * Metodo que permite agregar estudiantes a un curso
     * @param estudiante
     */
    public void registrarEstudiante(Estudiante estudiante){
        listEstudiantes.add(estudiante);
    }

    public int cantidadObjetosLista(){
        int cantidad = listEstudiantes.size();
        return cantidad;
    }

}
