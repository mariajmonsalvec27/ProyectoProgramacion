package model;

public class Carpinteria extends Servicio {

    private boolean estructural;
    private boolean herramientaPesada;

    public Carpinteria(int idServicio, String descripcion, int duracionHoras,
                       boolean estructural, boolean herramientaPesada) {

        super(idServicio, descripcion, duracionHoras);

        this.estructural = estructural;
        this.herramientaPesada = herramientaPesada;
    }

    @Override
    public double calcularCosto() {

        double total = 60000;

        if (herramientaPesada) {
            total += 15000;
        }

        return total;
    }

    public boolean isEstructural() {
        return estructural;
    }

    public boolean isHerramientaPesada() {
        return herramientaPesada;
    }

    @Override
    public String toString() {
        return "Carpinteria{" +
                "estructural=" + estructural +
                ", herramientaPesada=" + herramientaPesada +
                '}';
    }
}