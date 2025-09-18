package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

public class App {

    public static void main(String[] args) {


        ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria("AB123","Amigos Peludos", "Calle 2N - 18-144", "+573100000");

        // Crear veterinarios
        Veterinario vet1 = new Veterinario("Carlos López", "123", "3101234567");
        Veterinario vet2 = new Veterinario("Ana Gómez", "456", "3119876543");

        // Registrar veterinarios en la clínica
        clinicaVeterinaria.getListVeterinarios().add(vet1);
        clinicaVeterinaria.getListVeterinarios().add(vet2);

        // Crear propietarios (simples para asociar a las mascotas)
        Propietario p1 = new Propietario("Juan Pérez", "111", "312000111");
        Propietario p2 = new Propietario("Laura Torres", "222", "313999222");

        // Crear mascotas
        Mascota m1 = new Mascota("Firulais", "Perro", 1, p1);
        Mascota m2 = new Mascota("Michi", "Gato", 2, p2);

        // Crear citas (fecha clave: "09/09/2025" porque así funciona el método)
        Cita cita1 = new Cita("09/09/2025", "10:00", m1, vet1);
        Cita cita2 = new Cita("09/09/2025", "11:00", m2, vet1);
        Cita cita3 = new Cita("10/09/2025", "09:00", m1, vet1); // otra fecha, no debe contar
        Cita cita4 = new Cita("09/09/2025", "14:00", m2, vet2);

        // Registrar citas en la clínica
        clinicaVeterinaria.getListCitas().add(cita1);
        clinicaVeterinaria.getListCitas().add(cita2);
        clinicaVeterinaria.getListCitas().add(cita3);
        clinicaVeterinaria.getListCitas().add(cita4);

        // ====== PUNTO A ======
        int citasCarlos = clinicaVeterinaria.contarCitasDeVeterinario("Carlos López");
        System.out.println("Citas de Carlos López el 09/09/2025: " + citasCarlos);

        int citasAna = clinicaVeterinaria.contarCitasDeVeterinario("Ana Gómez");
        System.out.println("Citas de Ana Gómez el 09/09/2025: " + citasAna);

        // ====== PUNTO B ======
        boolean existeCarlos = clinicaVeterinaria.existeVeterinario("Carlos López");
        boolean existeLaura = clinicaVeterinaria.existeVeterinario("Laura Torres");

        System.out.println("¿Carlos López existe en la clínica? " + existeCarlos);
        System.out.println("¿Laura Torres existe en la clínica? " + existeLaura);

        //---Palindromo
        System.out.println(clinicaVeterinaria.palindromo("ana"));

    }
}
