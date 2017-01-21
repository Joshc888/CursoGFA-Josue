/**
 * Created by joshcaro on 20/01/17.
 */
public class Estado {
    private int idEstado;
    private int ciudades;
    private String capital;
    private String nombre;
    private String curiosidades;
    private String lugaresInteresantes;

    public Estado(int idEstado, int ciudades, String capital, String nombre, String curiosidades, String lugaresInteresantes) {
        this.idEstado = idEstado;
        this.ciudades = ciudades;
        this.nombre = nombre;
        this.curiosidades = curiosidades;
        this.lugaresInteresantes = lugaresInteresantes;
        this.capital = capital;
    }

    public Estado(){}

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public int getCiudades() {
        return ciudades;
    }

    public void setCiudades(int ciudades) {
        this.ciudades = ciudades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuriosidades() {
        return curiosidades;
    }

    public void setCuriosidades(String curiosidades) {
        this.curiosidades = curiosidades;
    }

    public String getLugaresInteresantes() {
        return lugaresInteresantes;
    }

    public void setLugaresInteresantes(String lugaresInteresantes) {
        this.lugaresInteresantes = lugaresInteresantes;
    }
}
