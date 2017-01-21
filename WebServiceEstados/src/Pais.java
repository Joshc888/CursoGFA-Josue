import javax.jws.WebMethod;

/**
 * Created by joshcaro on 20/01/17.
 */
public interface Pais {

    @WebMethod
    String getCapital(String s);

    @WebMethod
    int getCiudades(String s);

    @WebMethod
    String getCuriosidades(String s);

    @WebMethod
    String getLugaresInteresantes(String s);

}
