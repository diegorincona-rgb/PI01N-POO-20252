package uniquindio.edu.co.model;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    public Triangulo(String nombre, double base, double altura){
        super(nombre);
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calcularArea() {
        double resultado = (base*altura)/2;
        return resultado;
    }

    public double calcularForma(){
        return 0;
    }

}
