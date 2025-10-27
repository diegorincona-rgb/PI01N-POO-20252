package co.edu.uniquindio.poo.model;

public class Cliente extends Contacto {

    private NivelFidelidad nivelFidelidad;

    public Cliente(String nombre, int telefono, String correo, NivelFidelidad nivelFidelidad){
        super(nombre, telefono, correo);
        this.nivelFidelidad = nivelFidelidad;
    }

    public NivelFidelidad getNivelFidelidad() {
        return nivelFidelidad;
    }

    public void setNivelFidelidad(NivelFidelidad nivelFidelidad) {
        this.nivelFidelidad = nivelFidelidad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nivelFidelidad=" + nivelFidelidad +
                '}';
    }
}
