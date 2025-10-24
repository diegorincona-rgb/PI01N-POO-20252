package uniquindio.edu.co.model;

import java.util.IllegalFormatCodePointException;

public class Estudiante {

    //Atributos
    private String nombre;
    private int edad;
    private String correo;

    /**
     * Metodo constructor de la clase estudiante
     * @param nombre del estudiante
     * @param edad del estudiante
     * @param correo del estudiante
     */
    public Estudiante(String nombre, int edad, String correo) {

        assert edad > 0;
        assert correo.contains("@");

        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPalindromo(String texto) {
        // 1. Normalizar el texto: convertir a minúsculas y quitar no alfanuméricos
        String textoNormalizado = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // 2. Usar dos punteros: uno al inicio (i) y otro al final (j)
        int i = 0;
        int j = textoNormalizado.length() - 1;

        // 3. Comparar caracteres hasta que los punteros se crucen
        while (i < j) {
            if (textoNormalizado.charAt(i) != textoNormalizado.charAt(j)) {
                return false; // Si no coinciden, no es palíndromo
            }
            i++;
            j--;
        }
        return true; // Si el bucle termina, es palíndromo
    }

}
