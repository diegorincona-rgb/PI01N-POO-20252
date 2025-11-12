package co.edu.uniquindio.poo.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlataformaUdemyTest {

    @Test
    void calcularIngresoMensualTotal() {
        Proveedor proveedor = new Proveedor(
                "Udemy Inc.",
                "900123456-7",
                "Estados Unidos",
                "contacto@udemy.com"
        );

        // Curso individual: Java desde cero
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

        // Curso individual: Spring Boot profesional (para la ruta)
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

        // Ruta de aprendizaje: Ruta Desarrollador Backend
        RutaAprendizaje rutaBackend = new RutaAprendizaje(
                "R001",
                "Ruta Desarrollador Backend",
                0.0,
                proveedor,
                ModalidadConsumo.WEB_Y_MOVIL,
                CategoriaContenido.PROGRAMACION,
                10.0
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

        PlataformaUdemy plataforma = new PlataformaUdemy();
        plataforma.agregarProducto(cursoJava);
        plataforma.agregarProducto(rutaBackend);
        plataforma.agregarProducto(membresiaPremium);

        // Cálculo esperado (de acuerdo con la tabla de pruebas):
        // cursoJava: 50.000 + 20 * 1.000 = 70.000
        // rutaBackend: (50.000 + 70.000) * 0,9 = 108.000
        // membresiaPremium: (120.000 + 2 * 5.000) * 1,20 = 156.000
        // total = 70.000 + 108.000 + 156.000 = 334.000
        double ingresoEsperado = 334000.0;

        double ingresoCalculado = plataforma.calcularIngresoMensualTotal();

        // Assert (verificar resultado)
        assertEquals(ingresoEsperado, ingresoCalculado, 0.01,
                "El ingreso mensual total debe ser 334000.0");
    }
}