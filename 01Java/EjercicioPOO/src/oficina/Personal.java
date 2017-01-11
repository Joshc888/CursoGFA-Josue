package oficina;


import persona.Persona;

public abstract class Personal extends Persona{

    private int cveOficina;

    public Personal(String nombre, int edad, String nacionalidad, int cveOficina) {
        super(nombre, edad, nacionalidad);
        this.cveOficina = cveOficina;
    }

    public abstract void trabajar();



}
