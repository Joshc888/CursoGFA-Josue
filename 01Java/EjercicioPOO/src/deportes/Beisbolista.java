package deportes;

import persona.Persona;

public class Beisbolista extends Persona implements Deportista{
    public Beisbolista(String nombre, int edad, String nacionalidad) {
        super(nombre, edad, nacionalidad);
    }

    @Override
    public void comunicarse() {
        System.out.println("Se me resbalo el bat");
    }

    @Override
    public void entrenar() {

    }

    @Override
    public void jugar() {

    }

    @Override
    public void viajar() {

    }
}
