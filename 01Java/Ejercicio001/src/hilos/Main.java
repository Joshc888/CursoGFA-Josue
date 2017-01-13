package hilos;

public class Main {
    public static void main(String[] args) {
       NoHilo n1 = new NoHilo();
        NoHilo n2 = new NoHilo();
        NoHilo n3 = new NoHilo();

        MuestraHilo h1 = new MuestraHilo();
        MuestraHilo h2 = new MuestraHilo();
        MuestraHilo h3 = new MuestraHilo();

       new Thread(h1).start();
       new Thread(h2).start();
       new Thread(h3).start();
    }
}
