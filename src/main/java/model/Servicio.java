package model;

public abstract class Servicio {

    protected int idServicio;
    protected String descripcion;
    protected int duracionHoras;

    public Servicio(int idServicio, String descripcion, int duracionHoras) {
        this.idServicio = idServicio;
        this.descripcion = descripcion;
        this.duracionHoras = duracionHoras;
    }

    public abstract double calcularCosto();

    public int getIdServicio() {
        return idServicio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    @Override
    public String toString() {
        return "Servicio{" +
                "idServicio=" + idServicio +
                ", descripcion='" + descripcion + '\'' +
                ", duracionHoras=" + duracionHoras +
                '}';
    }
}