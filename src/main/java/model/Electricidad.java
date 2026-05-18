package model;

public class Electricidad extends Servicio {

    private boolean requiereCableado;
    private boolean cambioCircuitos;

    public Electricidad(int idServicio, String descripcion, int duracionHoras,
                        boolean requiereCableado, boolean cambioCircuitos) {

        super(idServicio, descripcion, duracionHoras);

        this.requiereCableado = requiereCableado;
        this.cambioCircuitos = cambioCircuitos;
    }

    @Override
    public double calcularCosto() {

        double total = 50000;

        if (requiereCableado || cambioCircuitos) {
            total += 20000;
        }

        return total;
    }

    public boolean isRequiereCableado() {
        return requiereCableado;
    }

    public boolean isCambioCircuitos() {
        return cambioCircuitos;
    }

    @Override
    public String toString() {
        return "Electricidad{" +
                "requiereCableado=" + requiereCableado +
                ", cambioCircuitos=" + cambioCircuitos +
                '}';
    }
}