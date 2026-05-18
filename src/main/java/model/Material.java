package model;

public class Material {

    private String nombre;
    private double costo;

    public Material(String nombre, double costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCosto() {
        return costo;
    }

    @Override
    public String toString() {
        return nombre + " ($" + costo + ")";
    }
}