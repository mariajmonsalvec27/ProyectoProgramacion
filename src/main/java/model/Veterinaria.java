package model;

import java.util.ArrayList;

public class Veterinaria {

    private ArrayList<Mascota> listaMascotas;

    public Veterinaria() {
        listaMascotas = new ArrayList<>();
    }

    public void registrarMascota(Mascota mascota) {
        listaMascotas.add(mascota);
    }

    public void mostrarMascotas() {
        for (Mascota m : listaMascotas) {
            m.mostrarMascota();
        }
    }

    public Mascota buscarMascota(String id) {
        for (Mascota m : listaMascotas) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }
}

