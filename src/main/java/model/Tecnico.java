package model;

public class Tecnico {

    private String nombreCompleto;
    private String identificacion;
    private String certificacion;
    private int aniosExperiencia;

    public Tecnico(String nombreCompleto, String identificacion,
                   String certificacion, int aniosExperiencia) {

        this.nombreCompleto = nombreCompleto;
        this.identificacion = identificacion;
        this.certificacion = certificacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    @Override
    public String toString() {
        return "Tecnico{" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", certificacion='" + certificacion + '\'' +
                ", aniosExperiencia=" + aniosExperiencia +
                '}';
    }
}