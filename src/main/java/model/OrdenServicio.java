package model;

import java.util.ArrayList;

public class OrdenServicio {

    private int idOrden;

    private Tecnico tecnico;
    private Vivienda vivienda;
    private Servicio servicio;

    private ArrayList<Material> materiales;

    private String estado;

    public OrdenServicio(int idOrden, Tecnico tecnico,
                         Vivienda vivienda, Servicio servicio) {

        this.idOrden = idOrden;
        this.tecnico = tecnico;
        this.vivienda = vivienda;
        this.servicio = servicio;

        this.materiales = new ArrayList<>();

        this.estado = "Pendiente";
    }

    public void agregarMaterial(Material material) {
        materiales.add(material);
    }

    public double calcularCostoTotal() {

        double total = servicio.calcularCosto();

        for (Material material : materiales) {
            total += material.getCosto();
        }

        return total;
    }

    public void actualizarEstado(String nuevoEstado) {
        estado = nuevoEstado;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public Vivienda getVivienda() {
        return vivienda;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public String getEstado() {
        return estado;
    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }

    @Override
    public String toString() {

        return "OrdenServicio{" +
                "idOrden=" + idOrden +
                ", tecnico=" + tecnico.getNombreCompleto() +
                ", vivienda=" + vivienda.getDireccion() +
                ", estado='" + estado + '\'' +
                ", costoTotal=" + calcularCostoTotal() +
                '}';
    }
}
