package deportes;

import persona.Persona;

public class Boxeador extends Persona implements Deportista{
    public Boxeador(String nombre, int edad, String nacionalidad) {
        super(nombre, edad, nacionalidad);
    }

    @Override
    public void comunicarse() {
        System.out.println("El rival se movia mucho, por eso.");
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugar() {
        System.out.println("Golpe derecho, y perdi");
    }

    @Override
    public void viajar() {

    }
}
