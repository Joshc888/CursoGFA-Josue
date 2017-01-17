import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Boleto b = new Boleto();
        Date d = new Date("05/25/2016");


        try {
            b.setFecha(d);
        } catch (FechaInvalidaException e) {
            System.out.println("Fecha invalida");
            System.out.println(  e.getMessage());

        }finally {
            System.out.println(b.getFecha());
            System.out.println("Siempre se va a ejecutar");
        }





        /*
        String s = "Jose";
        int d;
        ArrayList<String> a = null;



        try{
            a.add("d");
            System.out.println(args[2]);
            d = Integer.parseInt(s);
        }catch (ArrayIndexOutOfBoundsException  ex){
            System.out.println("Posicion no valida!");
        }catch (NumberFormatException  ex){
            System.out.println("Error de Formato");
        }catch (Exception ex){
            ex.printStackTrace();
            System.out.println("Excepcion Generica");
        }

        System.out.println("Final");*/
    }
}
