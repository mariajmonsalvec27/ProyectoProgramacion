package model;

public class Fontaneria extends Servicio {

    private boolean corteAgua;
    private String materialTuberia;

    public Fontaneria(int idServicio, String descripcion, int duracionHoras,
                      boolean corteAgua, String materialTuberia) {

        super(idServicio, descripcion, duracionHoras);

        this.corteAgua = corteAgua;
        this.materialTuberia = materialTuberia;
    }

    @Override
    public double calcularCosto() {

        double total = 40000;

        if (corteAgua) {
            total += 10000;
        }

        return total;
    }

    public boolean isCorteAgua() {
        return corteAgua;
    }

    public String getMaterialTuberia() {
        return materialTuberia;
    }

    @Override
    public String toString() {
        return "Fontaneria{" +
                "corteAgua=" + corteAgua +
                ", materialTuberia='" + materialTuberia + '\'' +
                '}';
    }
}