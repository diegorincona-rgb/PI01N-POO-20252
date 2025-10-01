package uniquindio.edu.co;

import uniquindio.edu.co.model.Circulo;
import uniquindio.edu.co.model.Cuadrado;
import uniquindio.edu.co.model.Triangulo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado("Cuadrado", 5.1);
        Triangulo triangulo = new Triangulo("Triangulo", 10.9, 43.8);
        Circulo circulo = new Circulo("Circulo", 5.66);

        System.out.println("El area del " + cuadrado.getNombre() + " es: " + cuadrado.calcularArea());
        System.out.println("El area del " + triangulo.getNombre() + " es: " + triangulo.calcularArea());
        System.out.println("El area del " + circulo.getNombre() + " es: " + circulo.calcularArea());
    }

}