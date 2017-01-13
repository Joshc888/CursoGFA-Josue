package hilos;

/**
 * Created by joshcaro on 13/01/17.
 */
public class MuestraHilo implements Runnable {

    @Override
    public void run() {
        Long tiempo = System.currentTimeMillis();
        AuxiliarHilos aux = new AuxiliarHilos();
        System.out.println("Inicio del Hilo de 3 seg");
        aux.esperarSegundos(3);
        System.out.println("Fin de Hilo: " + (System.currentTimeMillis() - tiempo) / 1000 + "Seg");
    }
}
