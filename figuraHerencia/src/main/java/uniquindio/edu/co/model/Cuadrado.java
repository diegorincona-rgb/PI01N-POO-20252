package uniquindio.edu.co.model;

public class Cuadrado extends Figura {

    private double lado;

    public Cuadrado (String nombre, double lado){
        super(nombre);
        this.lado=lado;
    }

    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    public double calcularBase(){
        return 0;
    }

}
