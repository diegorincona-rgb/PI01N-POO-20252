package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        // Proveedor
        Proveedor proveedor = new Proveedor(
                "Udemy Inc.",
                "900123456-7",
                "Estados Unidos",
                "contacto@udemy.com"
        );

        // Curso individual
        CursoIndividual cursoJava = new CursoIndividual(
                "C001",
                "Java desde cero",
                50000.0,
                proveedor,
                ModalidadConsumo.WEB_Y_MOVIL,
                CategoriaContenido.PROGRAMACION,
                20,
                NivelDificultad.INTERMEDIO
        );

        // Otra referencia de curso para la ruta
        CursoIndividual cursoSpring = new CursoIndividual(
                "C002",
                "Spring Boot profesional",
                70000.0,
                proveedor,
                ModalidadConsumo.WEB_Y_MOVIL,
                CategoriaContenido.PROGRAMACION,
                25,
                NivelDificultad.AVANZADO
        );

        // Ruta de aprendizaje
        RutaAprendizaje rutaBackend = new RutaAprendizaje(
                "R001",
                "Ruta Desarrollador Backend",
                0.0,
                proveedor,
                ModalidadConsumo.WEB_Y_MOVIL,
                CategoriaContenido.PROGRAMACION,
                10.0 // 10% de descuento
        );
        rutaBackend.agregarCurso(cursoJava);
        rutaBackend.agregarCurso(cursoSpring);

        // Membresía premium
        MembresiaPremium membresiaPremium = new MembresiaPremium(
                "M001",
                "Membresía Premium Global",
                120000.0,
                proveedor,
                ModalidadConsumo.WEB_Y_MOVIL,
                CategoriaContenido.OTROS,
                3,
                true
        );

        // Plataforma y agregar productos
        PlataformaUdemy plataforma = new PlataformaUdemy();
        plataforma.agregarProducto(cursoJava);
        plataforma.agregarProducto(rutaBackend);
        plataforma.agregarProducto(membresiaPremium);

        // Calcular ingreso mensual total
        double ingresoTotal = plataforma.calcularIngresoMensualTotal();

        // Mostrar resultado
        System.out.println("Ingreso mensual total de la plataforma: $" + ingresoTotal);

        // Demostración de los servicios transversales
        cursoJava.iniciarSesionMovil("usuario123");
        System.out.println(cursoJava.generarReporteProgreso());

        rutaBackend.iniciarSesionMovil("usuario456");
        System.out.println(rutaBackend.generarReporteProgreso());

        membresiaPremium.iniciarSesionMovil("usuario789");
        System.out.println(membresiaPremium.generarReporteProgreso());
        
    }

}