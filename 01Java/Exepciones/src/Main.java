import java.util.Scanner;

/**
 * Created by joshcaro on 12/01/17.
 */
public class Main {

    public static void main(String[] args) {

        crearPersona();

    }


    public static Persona crearPersona() {
        Persona p;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un nombre");

        String n = s.nextLine();

        try {
            p = new Persona(n);
            return p;
        } catch (NombreException ex) {
            System.out.println(ex);

        }


    }

}