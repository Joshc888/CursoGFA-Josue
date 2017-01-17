import Operadores.Operador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

   static List<Operador> lista = new ArrayList<>();

    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
        lista.add(new Operador("Operador x",333,true));
        }


       long tiempoInicio = System.currentTimeMillis();
       filtroNuevo();
       long tiempoFinal = System.currentTimeMillis();
        System.out.println(tiempoFinal - tiempoInicio);

    }

    public static void filtroNuevo(){
List<Operador> operadores = lista.stream()
        .filter(op->op.isStatus())
        .collect(Collectors.toList());
        imprimirNuevo(operadores);
    }

    public static void filtroAntiguo(){
        List<Operador> operadores = new ArrayList<Operador>();
        for(Operador op : lista){
            if(op.isStatus()){
                operadores.add(op);
            }
        }
        imprimir(operadores);
    }
    public static void imprimir(List<Operador> operadores){
        System.out.println("---- Lista filtrada ----");
        for(Operador op : operadores){
            System.out.println(op);
        }
    }
    public static void imprimirNuevo(List<Operador> operadores){
        System.out.println("---- Lista filtrada 'Nuevo' ----");
        operadores.forEach(op-> System.out.println(op));
    }
}
