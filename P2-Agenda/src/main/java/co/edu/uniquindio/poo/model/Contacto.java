package co.edu.uniquindio.poo.model;

public class Contacto {

    private String nombre;
    private int telefono;
    private String correo;

    public Contacto(String nombre, int telefono, String correo){
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
    }

    /**
     * PUNTO 2A
     * Metodo que permite determinar si un numero es capicuo
     * @param telefono
     * @return
     */
    public boolean isNumeroCapicuo(int telefono){
        boolean numeroCapicuo = true;
        String numero = String.valueOf(telefono);
        int inicio = 0;
        int fin = numero.length()-1;
        while (inicio < fin){
            if(numero.charAt(inicio) != numero.charAt(fin)){
                numeroCapicuo = false;
                break;
            }
            inicio++;
            fin--;
        }
        return numeroCapicuo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
