package model;

public class Main {

    public static void main(String[] args) {

        SistemaGestion sistema = new SistemaGestion();


        Tecnico tecnico1 = new Tecnico(
                "Carlos Perez",
                "123",
                "Electricista",
                5
        );

        Tecnico tecnico2 = new Tecnico(
                "Ana Gomez",
                "456",
                "Fontanera",
                8
        );

        sistema.registrarTecnico(tecnico1);
        sistema.registrarTecnico(tecnico2);


        Vivienda vivienda1 = new Vivienda(
                "Calle 10",
                "Casa",
                4
        );

        Vivienda vivienda2 = new Vivienda(
                "Carrera 20",
                "Apartamento",
                2
        );


        Servicio servicio1 = new Electricidad(
                1,
                "Reparacion electrica",
                3,
                true,
                false
        );

        Servicio servicio2 = new Fontaneria(
                2,
                "Cambio de tuberia",
                4,
                true,
                "PVC"
        );

        Servicio servicio3 = new Carpinteria(
                3,
                "Reparacion de puerta",
                2,
                false,
                true
        );

        OrdenServicio orden1 = new OrdenServicio(
                100,
                tecnico1,
                vivienda1,
                servicio1
        );

        orden1.agregarMaterial(
                new Material("Cable", 15000)
        );

        orden1.agregarMaterial(
                new Material("Interruptor", 10000)
        );

        OrdenServicio orden2 = new OrdenServicio(
                101,
                tecnico2,
                vivienda1,
                servicio2
        );

        orden2.agregarMaterial(
                new Material("Tuberia PVC", 30000)
        );

        OrdenServicio orden3 = new OrdenServicio(
                102,
                tecnico1,
                vivienda2,
                servicio3
        );

        orden3.agregarMaterial(
                new Material("Madera", 25000)
        );


        sistema.agregarOrdenServicio(orden1);
        sistema.agregarOrdenServicio(orden2);
        sistema.agregarOrdenServicio(orden3);


        System.out.println("====== TECNICOS ======");
        sistema.mostrarTecnicos();

        System.out.println("\n====== ORDENES ======");
        sistema.mostrarOrdenes();


        System.out.println("\n====== SERVICIOS EN CALLE 10 ======");

        for (OrdenServicio orden :
                sistema.buscarServiciosPorDireccion("Calle 10")) {

            System.out.println(orden);
        }


        sistema.actualizarEstadoServicio(
                100,
                "Completado"
        );


        double total = sistema.calcularCostoTotalVivienda(
                "Calle 10"
        );

        System.out.println(
                "\nCosto total vivienda Calle 10: $" + total
        );
    }
}