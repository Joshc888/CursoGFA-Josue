
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(targetNamespace = "default")
public class PaisImpl implements Pais {
    private AuxDB estado;

    public PaisImpl(){
        estado = new AuxDB();
    }

    @WebMethod
    public String getCapital(@WebParam(name = "estado")String s) {
      return estado.getEstado(s).getCapital();
    }

    @WebMethod
    public int getCiudades(@WebParam(name = "estado")String s) {
        return estado.getEstado(s).getCiudades();
    }

    @WebMethod
    public String getCuriosidades(@WebParam(name = "estado")String s) {
        return estado.getEstado(s).getCuriosidades();
    }

    @WebMethod
    public String getLugaresInteresantes(@WebParam(name = "estado")String s) {
        return estado.getEstado(s).getLugaresInteresantes();
    }
}
