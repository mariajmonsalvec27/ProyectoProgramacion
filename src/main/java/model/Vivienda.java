package model;

public class Vivienda {

    private String direccion;
    private String tipoInmueble;
    private int numeroResidentes;

    public Vivienda(String direccion, String tipoInmueble, int numeroResidentes) {

        this.direccion = direccion;
        this.tipoInmueble = tipoInmueble;
        this.numeroResidentes = numeroResidentes;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public int getNumeroResidentes() {
        return numeroResidentes;
    }

    @Override
    public String toString() {
        return "Vivienda{" +
                "direccion='" + direccion + '\'' +
                ", tipoInmueble='" + tipoInmueble + '\'' +
                ", numeroResidentes=" + numeroResidentes +
                '}';
    }
}
