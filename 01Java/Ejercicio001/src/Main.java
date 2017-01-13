import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String [] lineas = new String[0];

        LecturaEscritura.leer("out/production/Ejercicio001/lectura.txt");


        System.out.println("Escribe :q para salir");

        while (true){
            String linea = in.nextLine();
            if(linea.contains(":q")){
                LecturaEscritura.escribirFormato("out/production/Ejercicio001/escritura.txt",lineas);
                break;
            }
            String [] nuevaLinea = new String[lineas.length + 1];
            for(int i = 0; i<lineas.length;i++){
                nuevaLinea[i] = lineas[i];
            }
            nuevaLinea[lineas.length] = linea;
            lineas = nuevaLinea;
        }

        LecturaEscritura.leer("out/production/Ejercicio001/escritura.txt");


       // LecturaEscritura.escribir("out/production/Ejercicio001/escritura.txt");
    }
}
