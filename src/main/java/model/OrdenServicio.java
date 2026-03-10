package model;

import java.time.LocalDate;

public class OrdenServicio {

    private String codigo;
    private LocalDate fechaIngreso;
    private String descripcion;
    private LocalDate fechaSalida;
    private double costo;
    private EstadoOrden estado;

    private Taller  taller;
    private Cliente cliente;
    private Tareas[] listaTareas;
    private Repuestos[] listaRepuestos;
    private Cicla cicla;
    private Mecanico[] listaMecanico;


    public OrdenServicio(String codigo, LocalDate fechaIngreso, String descripcion, LocalDate fechaSalida, double costo) {
        this.codigo = codigo;
        this.fechaIngreso = fechaIngreso;
        this.descripcion = descripcion;
        this.fechaSalida = fechaSalida;
        this.costo = costo;

    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public EstadoOrden getEstado() {
        return estado;
    }

    public void setEstado(EstadoOrden estado) {
        this.estado = estado;
    }

    public Tareas[] getListaTareas() {
        return listaTareas;
    }

    public void setListaTareas(Tareas[] listaTareas) {
        this.listaTareas = listaTareas;
    }

    public Repuestos[] getListaRepuestos() {
        return listaRepuestos;
    }

    public void setListaRepuestos(Repuestos[] listaRepuestos) {
        this.listaRepuestos = listaRepuestos;
    }

    public Cicla getCicla() {
        return cicla;
    }

    public void setCicla(Cicla cicla) {
        this.cicla = cicla;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mecanico[] getListaMecanico() {
        return listaMecanico;
    }

    public void setListaMecanico(Mecanico[] listaMecanico) {
        this.listaMecanico = listaMecanico;
    }

    public Taller getTaller() {
        return taller;
    }

    public void setTaller(Taller taller) {
        this.taller = taller;
    }
}
