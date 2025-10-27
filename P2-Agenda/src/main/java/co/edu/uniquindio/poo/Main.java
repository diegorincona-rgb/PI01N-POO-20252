package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Crear agenda
        Agenda agenda = new Agenda(123, "El Quindiano");

        //Crear los contactos
        Contacto cliente1 = new Cliente("Pedro", 310222, "pedro@gmail.com", NivelFidelidad.ALTO);
        Contacto cliente2 = new Cliente("Zara", 310772, "zara@gmail.com", NivelFidelidad.MEDIO);
        Contacto proveedor1 = new Proveedor("Ana", 1234321, "ana@gmail.com", "UQ");
        Contacto proveedor2 = new Proveedor("Natalia", 12321, "natalia@gmail.com", "Univalle");

        //Agregar los contactos
        System.out.println("----Agregando contactos----");
        agenda.agregarContacto(cliente1);
        agenda.agregarContacto(cliente2);
        agenda.agregarContacto(proveedor1);
        agenda.agregarContacto(proveedor2);

        // Ordenar contactos
        agenda.ordenarContactosPorNombre();
        System.out.println("----Ordenar contactos----");
        for(Contacto cont : agenda.buscarContactoPorNombre("")){
            System.out.println("- " + cont.getNombre() + " Telefono: " + cont.getTelefono());
        }

        //Capicuo
        System.out.println("----Proveedor capicuo----");
        List<Contacto> proveedorCapicuo = agenda.obtenerProveederoresCapicua();
        if(proveedorCapicuo.isEmpty()){
            System.out.println("No hay proveedores capicuos");
        }else{
            for(Contacto cont : proveedorCapicuo){
                Proveedor proveedor = (Proveedor) cont;
                System.out.println(cont.getNombre() + " es un proveedor");
            }
        }

        // Contar clientes por nivel de fidelidad
        System.out.println("\n----Conteo de clientes por nivel de fidelidad----");
        int cantidadAltos = agenda.contarClientesPorNivel(NivelFidelidad.ALTO);
        int cantidadMedios = agenda.contarClientesPorNivel(NivelFidelidad.MEDIO);
        int cantidadBajos = agenda.contarClientesPorNivel(NivelFidelidad.BAJO);

        System.out.println("Clientes con fidelidad ALTO: " + cantidadAltos);
        System.out.println("Clientes con fidelidad MEDIO: " + cantidadMedios);
        System.out.println("Clientes con fidelidad BAJO: " + cantidadBajos);


    }

}