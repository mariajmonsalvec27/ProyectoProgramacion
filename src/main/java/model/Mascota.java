package model;

public class Mascota {
    private String nombre;
    private String especie;
    private String raza;
    private int edad;
    private String id;
    private Propietario propietario;

    public Mascota(String nombre, String especie, String raza, int edad, String id, Propietario propietario) {
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.id = id;
        this.propietario = propietario;
    }

    public String getId() {
        return id;
    }

    public void mostrarMascota() {
        System.out.println("Datos de la Mascota");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Raza: " + raza);
        System.out.println("Edad: " + edad);
        System.out.println("ID: " + id);
        propietario.mostrarPropietario();
        System.out.println("----------------------");
    }
}