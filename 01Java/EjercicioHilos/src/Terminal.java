/**
 * Created by joshcaro on 17/01/17.
 */
public class Terminal implements Runnable {
private Autobus autobus;

public Terminal(Autobus autobus, long initialTime){
    this.autobus = autobus;
    this.initialTime = initialTime;
}

private long initialTime;
    @Override
    public void run() {
        System.out.println("La cajera " + Thread.currentThread().getName()
                + " COMIENZA A PROCESAR LA COMPRA DEL autobus " + this.autobus.getRuta()
                + " EN EL TIEMPO: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

        for (int i = 0; i < this.autobus.getAcciones().length; i++) {
            // Se procesa el pedido en X segundos
            this.esperarXsegundos(autobus.getAcciones()[i]);
            System.out.println("Procesado el producto " + (i + 1) + " del " + this.autobus.getRuta()+
                    "->Tiempo: " + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");
        }

        System.out.println("La cajera " + Thread.currentThread().getName() + " HA TERMINADO DE PROCESAR "
                + this.autobus.getRuta() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000 + "seg");

    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }
}
