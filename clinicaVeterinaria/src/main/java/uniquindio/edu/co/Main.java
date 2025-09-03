package uniquindio.edu.co;

import uniquindio.edu.co.model.*;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ClinicaVeterinaria clinicaVeterinaria = new ClinicaVeterinaria("AB123","Amigos Peludos", "Calle 2N - 18-144", "+573100000");
        int opcion = -1;

        while (opcion != 0){
            System.out.println("\n -- Menu interactivo clinica --");
            System.out.println("1. Registrar propietario");
            System.out.println("2. Registrar veterinario");
            System.out.println("3. Registrar mascota");
            System.out.println("4. Agendar cita");
            System.out.println("5. Mostrar citas");
            System.out.println("0. Salir");

            System.out.println("\n Ingrese la opción que desea realizar: ");
            opcion = scanner.nextInt();
            scanner.nextLine().trim();

            if(opcion == 1){
                registrarPropietario(clinicaVeterinaria);
            } else if (opcion == 2) {
                registrarVeterinario(clinicaVeterinaria);
            } else if (opcion == 3) {
                registrarMascota(clinicaVeterinaria);
            } else if (opcion == 4) {
                asignarCita(clinicaVeterinaria);
            }else if(opcion == 5){
                mostrarCita(clinicaVeterinaria);
            }else if(opcion == 0){
                System.out.println("CHAO MUCHACHOS.....");
            }else{
                System.out.println("Opción invalido");
            }
        }
        scanner.close();
    }

    public static void registrarVeterinario(ClinicaVeterinaria clinicaVeterinaria){
        System.out.println("Ingrese el nombre del veterinario");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cedula del veterinario");
        String cedula = scanner.nextLine();

        System.out.println("Ingrese el telefono del veterinario");
        String telefono = scanner.nextLine();

        Veterinario veterinario = new Veterinario(nombre, cedula, telefono);

        clinicaVeterinaria.registrarVeterinario(veterinario);

        System.out.println("Veterinario registrado - OK");

    }

    public static void registrarPropietario(ClinicaVeterinaria clinicaVeterinaria){
        System.out.println("Ingrese el nombre del propietario: ");
        String nombre = scanner.nextLine().trim();

        System.out.println("Ingrese la cedula del propietario: ");
        String cedula = scanner.nextLine().trim();

        System.out.println("Ingrese el telefono del propietario: ");
        String telefono = scanner.nextLine().trim();

        Propietario propietario = new Propietario(nombre,cedula,telefono);

        clinicaVeterinaria.registrarPropietario(propietario);
        System.out.println("Propietario registrado - OK");
    }

    public static void registrarMascota(ClinicaVeterinaria clinicaVeterinaria){

    }

    public static void asignarCita(ClinicaVeterinaria clinicaVeterinaria){

    }

    public static void mostrarCita(ClinicaVeterinaria clinicaVeterinaria){

    }


}