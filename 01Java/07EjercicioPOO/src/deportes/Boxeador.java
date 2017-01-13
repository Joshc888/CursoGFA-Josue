package deportes;

import persona.Persona;

public class Boxeador extends Persona implements Deporte{

    String peso;

    public Boxeador(String nombre, String apellido, int edad
    ,String peso) {
        super(nombre, apellido, edad);
        this.peso = peso;
    }

    @Override
    public void entrenar(){
        System.out.println("Al gym a las 5am");
    }
    @Override
    public void viajar(){
        System.out.println("Viaja para la pelea");
    }
    @Override
    public void jugar(){
        System.out.println("Golpe...");
    }
}
