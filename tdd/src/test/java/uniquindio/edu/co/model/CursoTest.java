package uniquindio.edu.co.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursoTest {

    @Test
    public void cantidadEstudiantesTest() {
        Curso curso = new Curso(1222, "Programación 1");
        Estudiante estudiante = new Estudiante("Maria", 25, "maria@gmail.com");
        curso.registrarEstudiante(estudiante);
        curso.registrarEstudiante(estudiante);
        assertEquals(1, curso.cantidadObjetosLista());
    }
}