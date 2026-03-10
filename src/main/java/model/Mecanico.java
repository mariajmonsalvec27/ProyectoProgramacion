package model;

public class Mecanico {

    private String identificacion;
    private String nombreMecanico;
    private String telefonoMecanico;
    private double salario;

    private Taller taller;
    private OrdenServicio[]  listaOrdenServicio;

    public Mecanico(String identificacion, String nombreMecanico, String telefono) {

        this.identificacion = identificacion;
        this.nombreMecanico = nombreMecanico;
        this.telefonoMecanico = telefono;
        this.salario = 0;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreMecanico() {
        return nombreMecanico;
    }

    public void setNombreMecanico(String nombreMecanico) {
        this.nombreMecanico = nombreMecanico;
    }

    public String getTelefonoMecanico() {
        return telefonoMecanico;
    }

    public void setTelefonoMecanico(String telefonoMecanico) {
        this.telefonoMecanico = telefonoMecanico;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
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
