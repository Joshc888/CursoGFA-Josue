import deportes.Futbolista;
import oficina.Desarrollador;
import oficina.Operador;
import persona.Persona;

public class Main {

    public static void main(String[] args){

        Desarrollador d = new Desarrollador("Jose","Lopez",
                34,9324,2.0f);
        Operador o = new Operador("Luis","Suarez",43,
                9431,2.0f);

        System.out.println("Primero ");
        d.trabajar();
        System.out.println("Y despues ");
        d.transporteTorta();

        System.out.println("\nPrimero ");
        o.trabajar();
        System.out.println("Y despues ");
        o.transporteTorta();



        /*
    Persona p = new Persona("Josué Caro");
    p.hablar();
        System.out.println(p);

        Futbolista f = new Futbolista("Juan","Perez",
                33,"Delantero",22);
        f.hablar();
        System.out.println(f);
*/

    /*
    p.setEdad(83);
    Persona p2 = new Persona("José","Perez",32);

        System.out.println("Nombre: " + p.getNombre() + "; Apellido: " + p.getApellido() + "; " +
                "Edad: " + p.getEdad());

        System.out.println("Nombre: " + p2.getNombre() + "; Apellido: " + p2.getApellido() + "; " +
                "Edad: " + p2.getEdad());
*/



    }

}
