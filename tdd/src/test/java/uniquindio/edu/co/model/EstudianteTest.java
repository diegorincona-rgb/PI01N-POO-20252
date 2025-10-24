package uniquindio.edu.co.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EstudianteTest {

    @Test
    public void validarEdadNegativa(){
        assertThrows(Throwable.class, ()-> new Estudiante("Luis", -1, "luis@gmail.com"));
    }

    @Test
    public void validarCorreo(){
        assertThrows(Throwable.class, ()-> new Estudiante("Pepe", 19, "pepe@gmail.com"));
    }

    @Test
    public void verificarNombre(){
        Estudiante estudiante = new Estudiante("Raul", 21, "raul@gmail.com");
        assertEquals("Raul", estudiante.getNombre());
    }

    @Test
    public void verificarPalindroma(){
        Estudiante estudiante = new Estudiante("ana", 21, "raul@gmail.com");
        assertTrue(estudiante.esPalindromo(estudiante.getNombre()));
    }

}