package deportes;

import persona.Persona;

public class Futbolista extends Persona implements Deporte {
    private String posicion;
    private int dorsal;

    public Futbolista(String nombre, String apellido,
                      int edad,String posicion, int dorsal){
        super(nombre,apellido,edad);
        this.posicion = posicion;
        this.dorsal = dorsal;
    }


    @Override
    public void jugar(){
        System.out.println("Juega un partido");
    }
    @Override
    public void viajar(){
        System.out.println("Viaja al estadio");
    }
    @Override
    public void entrenar(){
        System.out.println("Cardio...");
    }

    @Override
    public void hablar(){
        System.out.println("Se hizo lo que se pudo..., dimos lo mejor");
    }
    @Override
    public void comer(){
        System.out.println("¿Que es eso?...");
    }

    @Override
    public String toString(){
        return "Nombre: " + getNombre() + "; Apellido: " + getApellido() +
                "; Edad: " + getEdad() + "; Posicion: " + posicion +
                "; Dorsal: " + dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
