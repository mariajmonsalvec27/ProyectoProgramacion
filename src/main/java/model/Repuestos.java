package model;

public class Repuestos {

    private String nombre;
    private double costo;
    private int cantidad;

    private Taller taller;
    private OrdenServicio[]  listaOrdenServicio;

    public Repuestos(String nombre, double costo, int cantidad, Taller taller) {

        this.nombre = nombre;
        this.costo = costo;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }

    public OrdenServicio[] getListaOrdenServicio() {
        return listaOrdenServicio;
    }

    public void setListaOrdenServicio(OrdenServicio[] listaOrdenServicio) {
        this.listaOrdenServicio = listaOrdenServicio;
    }
}
