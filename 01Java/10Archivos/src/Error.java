import java.io.*;
import java.util.Date;

public class Error implements Escribible{
    private long timeStamp;
    private int codigoError;
    private String descripcion;

    public Error(){}

    public Error(int codigoError, String descripcion){
        this.timeStamp = new Date().getTime();
        this.codigoError = codigoError;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
       return timeStamp + " | " + codigoError +
               " | " + descripcion;

    }

    @Override
    public void escribir(String url){
        try {
            FileOutputStream fO = new FileOutputStream(url, true);
            OutputStreamWriter oS = new OutputStreamWriter(fO,"UTF-8");
            BufferedWriter bW = new BufferedWriter(oS);

            String linea = timeStamp + " | " + codigoError + " | " + descripcion + "\n";
            bW.write(linea);
            bW.close();

        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado");
        }catch (UnsupportedEncodingException ex){
            System.out.println("Tipo de codificación no soportada");
        }catch (IOException ex){
            System.out.println("Error de IO");
        }catch (Exception ex){
            System.out.println("Otro error");
        }
    }
    /*
    public void escribir(String url) {
        FileWriter fw;
        try {
            fw = new FileWriter(url,true);
        String linea = timeStamp + " | " + codigoError + " | " + descripcion + "\n";
            fw.append(linea);
            fw.close();
        }
        catch (IOException ex){

            System.out.println("El archivo no existe");
        }
    }*/

    @Override
    public Escribible leer(String url, long timeStamp) {
        try {
            FileReader fR = new FileReader(url);
            BufferedReader bR = new BufferedReader(fR);
            String linea;
            while ((linea = bR.readLine()) != null){
                String[] sl = linea.split("-");
                if(Long.parseLong(sl[0].trim())==timeStamp){
                    this.timeStamp = timeStamp;
                    this.codigoError = Integer.parseInt(sl[1].trim());
                    this.descripcion = sl[2].trim();
                    return this;
                }
            }

        }catch (FileNotFoundException ex){
            System.out.println("Archivo no encontrado");
        }catch (IOException ex){
            System.out.println("Error IO");
        }
        return null;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }

    public int getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(int codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
