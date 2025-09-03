package uniquindio.edu.co;

import uniquindio.edu.co.model.ClinicaVeterinaria;

public class App {

    public static void main(String[] args) {

        ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria("12","AMIGOS", "CALLER", "+57");

        System.out.println(clinicaVeterinaria.palindromo("ana"));


    }


}
