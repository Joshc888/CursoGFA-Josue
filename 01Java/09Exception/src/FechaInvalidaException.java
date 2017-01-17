
public class FechaInvalidaException extends Exception {
    public FechaInvalidaException(){
        super("La fecha es anterior a la actual");
    }


    public void otroMensaje(){
        System.out.println("Otro mensaje");
    }
}
