package model;

public class Persona {

    private String nombre;
    private int edad;
    private String sexo;
    private String trabajo;

    public Persona (String nombre, int edad, String sexo, String trabajo) {

        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.trabajo = trabajo;
    }

    public void comer(){
        System.out.println("Comiendo");
    }

    public void trabajar(){
        System.out.println("Trabajando");
    }

    public String toString(){

        return "Nombre:" + nombre + " Edad:" + edad + " Sexo:" + sexo + " Trabajo:" + trabajo;
    }
}
