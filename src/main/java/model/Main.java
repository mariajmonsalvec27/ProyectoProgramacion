package model;

import javax.swing.*;

public class Main {
     /**
     * Veterinaria clinica = new Veterinaria();
     * <p>
     * Propietario p1 = new Propietario("Laura Gómez", "3001234567");
     * Propietario p2 = new Propietario("Carlos Pérez", "3119876543");
     * <p>
     * Mascota m1 = new Mascota("Skibidi", "Perro", "Labrador", 3, "001", p1);
     * Mascota m2 = new Mascota("Toilet", "Gato", "Siames", 2, "002", p2);
     * <p>
     * clinica.registrarMascota(m1);
     * clinica.registrarMascota(m2);
     * <p>
     * System.out.println("LISTA DE MASCOTAS");
     * clinica.mostrarMascotas();
     * <p>
     * System.out.println("BUSCAR MASCOTA CON ID 001");
     * Mascota aux = clinica.buscarMascota("001");
     * <p>
     * if (aux != null) {
     * aux.mostrarMascota();
     * } else {
     * System.out.println("Mascota no encontrada");
     * }
     * }
     **/
     public static void main(String[] args) {
         Taller taller = new Taller("Taller de  bicis", "carrera 67-69S", "3057294741", "12-5");

         while (opcion != 11) {

             String menu = "===== TALLER DE BICIS =====\n"
                     + "1. Registrar cliente\n"
                     + "2. Eliminar cliente\n"
                     + "3. Actualizar cliente\n"
                     + "4. Mostrar cliente\n"
                     + "5. Mostrar lista de clientes\n"
                     + "6. Registrar bicicleta\n"
                     + "7. Eliminar bicicleta\n"
                     + "8. Actualizar bicicleta\n"
                     + "9. Mostrar bicicleta\n"
                     + "10. Mostrar lista de bicicletas\n"
                     + "11. Salir";

             String entrada = JOptionPane.showInputDialog(null, menu, "Menu principal", JOptionPane.QUESTION_MESSAGE);

             if (entrada == null) {
                 break;
             }

             opcion = Integer.parseInt(entrada);

             switch (opcion) {
                 case 1:
                     String nombreReg = JOptionPane.showInputDialog("Ingrese el nombre: ");
                     String apellidoReg = JOptionPane.showInputDialog("Ingrese el apellido: ");
                     String cedulaReg = JOptionPane.showInputDialog("Ingrese la cedula: ");
                     String direccionReg = JOptionPane.showInputDialog("Ingrese la direccion: ");
                     String telefonoReg = JOptionPane.showInputDialog("Ingrese la telefono: ");

                     boolean registrado = newTaller.registrarCliente(nombreReg, apellidoReg, cedulaReg, direccionReg, telefonoReg);
                     JOptionPane.showMessageDialog(null, registrado ? "Cliente registrado exitosamente" : "Cliente no registrado.");
                     break;

                 case 2:
                     String cedulaElim = JOptionPane.showInputDialog("Ingrese la cedula: ");

                     boolean eliminadoCliente = newTaller.eliminarCliente(cedulaElim);
                     JOptionPane.showMessageDialog(null, eliminadoCliente ? "Cliente eliminado exitosamente" : "Cliente no eliminado.");
                     break;

                 case 3:

             }
         }
     }
}