package hilos;

public class AuxiliarHilos {

    public void esperarSegundos(int seg){

        try{
            Thread.sleep(seg * 1000);
        }catch (InterruptedException ex){
            Thread.currentThread().interrupt();
        }

    }

}
