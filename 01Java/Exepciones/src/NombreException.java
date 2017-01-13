/**
 * Created by joshcaro on 12/01/17.
 */
public class NombreException extends Exception {
    public NombreException(String message, Persona p, String nombre) {
        super(message);
        System.out.println("Se acorto automaticamente el nombre a: ");
        String n = nombre.substring(0,29);
        p.setNombre(n);
        System.out.println("Nombre: " + p.getNombre());
    }
}
