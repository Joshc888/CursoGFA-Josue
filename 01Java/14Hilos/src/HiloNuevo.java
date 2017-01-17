
public class HiloNuevo implements Runnable {
    int id;
    public HiloNuevo(int id){
        this.id = id;
    }


    @Override
    public void run() {
        System.out.println("Inicio de hilo 3 seg. ID: " + id);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fin de hilo de 3 seg. ID: " + id );
    }
}
