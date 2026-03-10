package model;

public class Cicla {

    private String id;
    private String marca;
    private String nombreCliente;
    private String telefono;

    private Cliente cliente;
    private OrdenServicio[] listaOrdenServicio;
    private Mecanico[] listaMecanico;

    public Cicla(String id, String marca, String nombreCliente, String telefono) {

        this.id = id;
        this.marca = marca;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String nombre) {
        this.marca = marca;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public OrdenServicio[] getListaOrdenServicio() {
        return listaOrdenServicio;
    }

    public void setListaOrdenServicio(OrdenServicio[] listaOrdenServicio) {
        this.listaOrdenServicio = listaOrdenServicio;
    }
}

