package persona;


public class Persona {
    private String nombre;
    private int edad;
    private String nacionalidad;


    public Persona(String nombre, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }


    public void comunicarse(){
        System.out.println("Hola!, buen dia");
    }
}
