package model;

public class Cicla {

    private String id;
    private String nombre;
    private boolean suspencion;
    private boolean frenos;
    private boolean transmision;
    private String tipoPlato;
    private String color;
    private int tallaRin;

    public Cicla(String id, String nombre, boolean suspencion, boolean frenos, boolean transmision, String tipoPlato, int tallaRin) {

        this.id = id;
        this.nombre = nombre;
        this.suspencion = suspencion;
        this.frenos = frenos;
        this.transmision = transmision;
        this.tipoPlato = tipoPlato;
        this.tallaRin = tallaRin;
    }

    public void acelerar(){
        System.out.println("Acelerando, con preacucion");
    }

    public void frenar(){
        System.out.println("Frenando con cuidado");

    }

    @Override
    public String toString(){
        return " Id:" + id + " Nombre:" + nombre + " Suspension:" + suspencion + " Frenos:" + frenos + " Transmision:" + transmision + " Tipo de Plato:" + tipoPlato + " Color:" + color + " Talla de Rin:" + tallaRin;
    }

}


