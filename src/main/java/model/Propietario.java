package model;

public class Propietario {
    private String nombre;
    private String telefono;

    public Propietario(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void mostrarPropietario() {
        System.out.println("Propietario: " + nombre);
        System.out.println("Teléfono: " + telefono);
    }
}