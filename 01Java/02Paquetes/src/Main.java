
import matematicas.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Matematicas mat = new Matematicas();
        Scanner lector = new Scanner(System.in);
        float a,b;

        System.out.println("Introduce un Número");
        a = lector.nextFloat();
        System.out.println("Introduce otro Número");
        b = lector.nextFloat();

        //Metodo STATIC
        System.out.println("Resultado Suma:" + Matematicas.suma(a,b) );
        //Sin STATIC
        System.out.println("Resultado Resta:" + mat.resta(a,b) );
        System.out.println("Resultado Multiplicacion:" + mat.multiplicacion(a,b) );
        System.out.println("Resultado Division:" + mat.division(a,b) );
    }

}
