import java.io.*;
import java.util.Scanner;

public class LecturaEscritura {

    private static File archivo;
    private static FileWriter archivoE;
    private static Scanner s = null;
    //OTRA FORMA (FORMATOS)
    private static Writer salida;

    public static void leer(String url){
    archivo = new File(url);

    try{
        s = new Scanner(archivo);

        while (s.hasNext()){
            System.out.println(s.nextLine());
        }


    }catch (Exception ex){
        System.out.println(ex.getMessage());
    }finally {

        try{
            if(s != null){
                s.close();
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


    }

    }

    public static void escribir(String url, String[] lineas){
        archivoE = null;
        try {
            archivoE = new FileWriter(url);

            for(String linea : lineas){
                archivoE.write(linea + "\n");
            }

            archivoE.close();

        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }

    public static void escribirFormato(String url, String[] lineas){
     try {

         salida = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(url),"UTF-8"));

         for (String linea : lineas){

             try{
                 salida.write(linea + "\n");
             }catch (IOException ex){
                 System.out.println(ex.getMessage());
             }


         }


     }catch (UnsupportedEncodingException | FileNotFoundException ex){
         System.out.println(ex.getMessage());
     }finally {

         try{
             salida.close();
         }catch (IOException ex){
             System.out.println(ex.getMessage());
         }


     }

    }


}



