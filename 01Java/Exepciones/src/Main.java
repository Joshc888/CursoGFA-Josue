import java.util.Scanner;

/**
 * Created by joshcaro on 12/01/17.
 */
public class Main {

    public static void main(String[] args) {

        Persona p;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un nombre");

        String n = s.nextLine();

        try {
            p = new Persona(n);

            int sss = 4/0;



        } catch (NombreException ex) {
            System.out.println(ex);

        }catch (ArithmeticException ex){
            System.out.println("Exception dd");
        }

    }

}