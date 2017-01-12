/**
 * Created by joshcaro on 12/01/17.
 */
public class Persona {
    private String nombre;

    public Persona(String nombre) throws NombreException {

        if(nombre.length() > 30){
         throw new NombreException("Nombre mayor a 30 Caracteres",this, nombre);
        }

        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNombre() {
        return nombre;
    }
}
