package model;

import java.util.ArrayList;

public class SistemaGestion {

    private ArrayList<Tecnico> tecnicos;
    private ArrayList<OrdenServicio> ordenesServicio;

    public SistemaGestion() {

        tecnicos = new ArrayList<>();
        ordenesServicio = new ArrayList<>();
    }


    public boolean registrarTecnico(Tecnico tecnico) {

        for (Tecnico t : tecnicos) {

            if (t.getIdentificacion().equals(tecnico.getIdentificacion())) {

                return false;
            }
        }

        tecnicos.add(tecnico);

        return true;
    }


    public void agregarOrdenServicio(OrdenServicio orden) {

        ordenesServicio.add(orden);
    }


    public ArrayList<OrdenServicio> buscarServiciosPorDireccion(String direccion) {

        ArrayList<OrdenServicio> resultados = new ArrayList<>();

        for (OrdenServicio orden : ordenesServicio) {

            if (orden.getVivienda().getDireccion()
                    .equalsIgnoreCase(direccion)) {

                resultados.add(orden);
            }
        }

        return resultados;
    }


    public boolean actualizarEstadoServicio(int idOrden,
                                            String nuevoEstado) {

        for (OrdenServicio orden : ordenesServicio) {

            if (orden.getIdOrden() == idOrden) {

                orden.actualizarEstado(nuevoEstado);

                return true;
            }
        }

        return false;
    }

    public double calcularCostoTotalVivienda(String direccion) {

        double total = 0;

        for (OrdenServicio orden : ordenesServicio) {

            if (orden.getVivienda().getDireccion()
                    .equalsIgnoreCase(direccion)) {

                total += orden.calcularCostoTotal();
            }
        }

        return total;
    }


    public void mostrarTecnicos() {

        for (Tecnico tecnico : tecnicos) {
            System.out.println(tecnico);
        }
    }

    public void mostrarOrdenes() {

        for (OrdenServicio orden : ordenesServicio) {
            System.out.println(orden);
        }
    }
}
