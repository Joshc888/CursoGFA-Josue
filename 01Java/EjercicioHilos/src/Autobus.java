/**
 * Created by joshcaro on 17/01/17.
 */
public class Autobus {
    private String ruta;
    private int[] acciones;

    public Autobus(String ruta, int[] acciones) {
        this.ruta = ruta;
        this.acciones = acciones;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public int[] getAcciones() {
        return acciones;
    }

    public void setAcciones(int[] acciones) {
        this.acciones = acciones;
    }
}
