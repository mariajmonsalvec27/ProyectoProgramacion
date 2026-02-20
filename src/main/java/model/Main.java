package model;

public class Main {

    public static void main(String[] args) {
       Cicla miBici = new Cicla("C-012", "yucateco tactico", false, true, true, "Skibidi", 21);
       miBici.acelerar();
       System.out.println(miBici);

       Persona humano = new Persona("Juanito", 20, "Masculino", "Empresario");
       humano.comer();
       humano.trabajar();
       System.out.println(humano);

       System.out.println("Hola mundo!");
    }




}
