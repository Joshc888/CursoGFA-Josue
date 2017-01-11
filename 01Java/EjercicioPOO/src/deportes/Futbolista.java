package deportes;

import persona.Persona;

public class Futbolista extends Persona implements Deportista {

    private int condicion;
    private short dorsal;
    private String posicion;

    public Futbolista(String nombre, int edad, String nacionalidad, int condicion, short dorsal, String posicion) {
        super(nombre, edad, nacionalidad);
        this.condicion = condicion;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }


    @Override
    public void comunicarse() {
        System.out.println("Hicimos lo que pudimos");
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


    public int getCondicion() {
        return condicion;
    }

    public void setCondicion(int condicion) {
        this.condicion = condicion;
    }

    public short getDorsal() {
        return dorsal;
    }

    public void setDorsal(short dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }
}
