package uniquindio.edu.co;

import uniquindio.edu.co.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Crear empresa
        Empresa empresa = new Empresa("QuickBox", "901234567-8", "Cra 15 #10-20");

        // Crear cliente
        Cliente cliente = new Cliente("Carlos Pérez", "1111", "3120000000", "carlos@mail.com", "Armenia");
        empresa.registrarCliente(cliente);

        // Crear repartidor
        Repartidor repartidor = new Repartidor("Ana Gómez", "2222", "Moto", "ABC123");
        empresa.registrarRepartidor(repartidor);

        // Crear ruta
        Ruta ruta = new Ruta("Armenia", "Calarcá", 12.5);
        empresa.registrarRuta(ruta);

        // Crear envío (sin paquetes de entrada)
        Envio envio = new Envio("E001", "2025-09-17",
                Envio.MODALIDAD_URGENTE, "Tarjeta", 20000,
                cliente, ruta, repartidor, new ArrayList<>());
        empresa.registrarEnvio(envio);

        // Crear paquete y registrarlo usando bandera
        Paquete paquete = new Paquete("P001", 2.5, 30, 20, 15, "Libros", false);
        boolean agregado = empresa.registrarPaquete("E001", paquete);
        System.out.println("¿Paquete agregado al envío? " + agregado);

        // Facturación de la empresa
        System.out.println("Facturación total: $" + empresa.calcularFacturacion());

        /**
         * Calcular costo
        20000 (base)
            + 12500 (distancia)
            + 15000 (urgente)
            +     0 (fragilidad)
            = 47500
        **/

    }
}
