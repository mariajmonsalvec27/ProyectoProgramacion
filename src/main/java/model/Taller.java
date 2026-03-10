package model;

public class Taller {

    private String nombreTaller;
    private String direccionTaller;
    private String telefonoTaller;
    private String nit;

    private Cicla[] listaCicla;
    private Cliente[] listaCliente;
    private Mecanico[] listaMecanico;
    private OrdenServicio[] listaOrdenServicio;
    private Repuestos[] listaRepuesto;

    public Taller(String nombre, String direccion, String telefono, String nit) {

        this.nombreTaller = nombre;
        this.direccionTaller = direccion;
        this.telefonoTaller = telefono;
        this.nit = nit;
        this.listaCicla = new Cicla[30];
        this.listaCliente = new Cliente[30];
    }

    public String getNombreTaller() {
        return nombreTaller;
    }

    public void setNombreTaller(String nombreTaller) {
        this.nombreTaller = nombreTaller;
    }

    public String getDireccionTaller() {
        return direccionTaller;
    }

    public void setDireccionTaller(String direccionTaller) {
        this.direccionTaller = direccionTaller;
    }

    public String getTelefonoTaller() {
        return telefonoTaller;
    }

    public void setTelefonoTaller(String telefonoTaller) {
        this.telefonoTaller = telefonoTaller;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public Cicla[] getListaCicla() {
        return listaCicla;
    }

    public void setListaCicla(Cicla[] listaCicla) {
        this.listaCicla = listaCicla;
    }

    public Cliente[] getListaCliente() {
        return listaCliente;
    }

    public void setListaCliente(Cliente[] listaCliente) {
        this.listaCliente = listaCliente;
    }

    public Mecanico[] getListaMecanico() {
        return listaMecanico;
    }

    public void setListaMecanico(Mecanico[] listaMecanico) {
        this.listaMecanico = listaMecanico;
    }

    public OrdenServicio[] getListaOrdenServicio() {
        return listaOrdenServicio;
    }

    public void setListaOrdenServicio(OrdenServicio[] listaOrdenServicio) {
        this.listaOrdenServicio = listaOrdenServicio;
    }

    public Repuestos[] getListaRepuesto() {
        return listaRepuesto;
    }

    public void setListaRepuesto(Repuestos[] listaRepuesto) {
        this.listaRepuesto = listaRepuesto;
    }

    public boolean registrarCliente(String nombre, String apellido, String cedula, String direccion, String telefono){

        Cliente nuevoCliente = new Cliente(nombre, apellido, cedula, direccion, telefono);

        if(buscarClienteByCedula(cedula) == -1){
            for(int i = 0; i < listaCliente.length; i++){
                if(listaCliente[i] == null){
                    listaCliente[i] = nuevoCliente;
                    return true;
                }
            }
        }
        return false;
    }

    public int buscarClienteByCedula(String cedulaBuscar){

        for(int i = 0; i < listaCliente.length; i++){
            if (listaCliente[i]==null && listaCliente[i].getCedula().equals(cedulaBuscar)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarCliente(String cedula){

        int posicion = buscarClienteByCedula(cedula);
        if (posicion != -1){
            listaCliente[posicion] = null;
            return true;
        }
        return false;
    }

    public boolean actualizarCliente(String nombre, String apellido, String cedula, String direccion, String telefono) {
        int posicion = buscarClienteByCedula(cedula);
        if (posicion != -1) {
            listaCliente[posicion].setNombre(nombre);
            listaCliente[posicion].setDireccion(direccion);
            listaCliente[posicion].setTelefono(telefono);
            return true;
        }
        return false;
    }

    public Cliente mostrarCliente(String cedula){
        int posicion = buscarClienteByCedula(cedula);
        if (posicion != -1){
            return listaCliente[posicion];
        }
        return null;
    }

    public String mostrarListaCliente(){
        String lista = "";
        for(int i = 0; i < listaCliente.length; i++){
            if(listaCliente[i] != null){
                lista += "Cedula: " + listaCliente[i].getCedula() +
                        " | Nombre: " + listaCliente[i].getNombre() +
                        " | Direccion: " + listaCliente[i].getDireccion() +
                        " | Telefono: " + listaCliente[i].getTelefono();
            }
        }
        return lista.isEmpty() ? "No hay clientes registrados." : lista;
    }

    public boolean registrarCicla(String id, String marca, String nombreCliente, String telefono){
        int posCliente = buscarClienteByCedula(id);
        if (posCliente == -1) {
            return false;
        }

        Cliente cliente = listaCliente[posCliente];
        Cicla nuevaCicla = new Cicla(id, marca, nombreCliente, telefono);
        nuevaCicla.setCliente(cliente);
        cliente.setCicla(nuevaCicla);

        if(buscarCiclaById(id))== -1){

            for(int i = 0; i < listaCicla.length; i++){
                if(listaCicla[i] == null){
                    listaCicla[i] = nuevaCicla;
                    return true;
                }
            }

        }
        return false;
    }

    public int buscarCiclaById(String idBuscar){
        for(int i = 0; i < listaCicla.length; i++){
            if(listaCicla[i] != null && listaCicla[i].getId().equals(idBuscar)){
                return i;
            }
        }
        return -1;
    }

    public boolean eliminarCicla(String id){
        int posicion = buscarCiclaById(id);
        if (posicion != -1) {
            listaCicla[posicion] = null;
            return true;
        }
        return false;
    }

    public boolean actualizarCicla(String id, String marca, String nombreCliente, String telefono){
        int posicion = buscarCiclaById(id);
        if (posicion != -1) {
            listaCicla[posicion].setMarca(marca);
            listaCicla[posicion].setNombreCliente(nombreCliente);
            listaCicla[posicion].setTelefono(telefono);
            return true;
        }
        return false;
    }

    public Cicla mostrarCicla(String id){
        int posicion = buscarCiclaById(id);
        if (posicion != -1) {
            return listaCicla[posicion];
        }
        return null;
    }

    public String mostrarListaCicla(){
        String lista = "";
        for(int i = 0; i < listaCicla.length; i++){
            if(listaCicla[i] != null){
                lista += "ID: " + listaCicla[i].getId() +
                        "Marca: " + listaCicla[i].getMarca() +
                        "Nombre del cliente: " + listaCicla[i].getNombreCliente() +
                        "Telefono: " + listaCicla[i].getTelefono();
            }
        }
        return lista.isEmpty() ? "No hay ciclas registrados." : lista;
    }

}
