package model;


import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class TallerMetodosPruebas {

    public static final double ELECTRICIDAD = 50000;
    public static final double FONTANERIA = 40000;
    public static final double CARPINTERIA = 60000;
    public static final double ALTURA = 20000;
    public static final double CORTE_AGUA = 10000;
    public static final double REQUIERE_HERRAMIENTA_PESADA = 15000;

    public void calcularCostoTotal(String tipoServicio, boolean requiereAdicional) {

        double costoTotal = 0;

        if (tipoServicio.equalsIgnoreCase("ELECTRICIDAD")) {
            costoTotal = ELECTRICIDAD;
            if (requiereAdicional) {
                costoTotal = costoTotal + ALTURA;
            }
        } else {
            if (tipoServicio.equalsIgnoreCase("FONTANERIA")) {
                costoTotal = FONTANERIA;
                if (requiereAdicional) {
                    costoTotal = costoTotal + CORTE_AGUA;

                }

            } else if (tipoServicio.equalsIgnoreCase("CARPINTERIA")) {
                costoTotal = CARPINTERIA;
                if (requiereAdicional) {
                    costoTotal = costoTotal + REQUIERE_HERRAMIENTA_PESADA;
                }
            }
        }
    }

    public void registrarTecnico(Tecnico nuevoTecnico){

        for(Tecnicos tecnicos : listaTecnicos){
            if(tecnicos.getId().equals(nuevotecnico.getId())){
                JOptionPane.showMessageDialog(null, "El tecnico ya existe en el sistema.");
            }
        }
        listaTecnicos.add(nuevoTecnico);
        JOptionPane.showMessageDialog(null, "El tecnico se ha registrado correctamente.");
    }

    public void List<OrdenServicio> obtenerServicio(String direccion){

        List<OrdenServicio> ordenServicio = new ArrayList<>();

        for(OrdenServicio orden : listaOrdenes){
            if(orden.getVivienda().getDireccion().equalsIgnoreCase(direccion)){
                ordenServicio.add(orden);
            }
        }
        return ordenServicio;
    }

    public boolean actualizarOrdenServicio(String idServicio, String nuevoEstado){

        for(OrdenServicio orden : listaOrdenes){

            if(orden.getServicio().getIdUnica().equals(idServicio)){
                orden.setEstado(nuevoEstado);
                return true;
            }
        }
        return false;
    }

    public double calcularCostoTotalVivienda(String direccion){

        double sumaTotal= 0;

        for(OrdenServicio orden : listaOrdenes){
            if(orden.getVivienda().getDireccion().equalsIgnoreCase(direccion)){

                double costoServicio = calcularCostoBase(orden.getTipoServicio, orden.requiereAdicional());
                sumaTotal += costoServicio;
            }
        }
        return sumaTotal;
    }




}