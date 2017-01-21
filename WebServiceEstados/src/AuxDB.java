import java.sql.*;

/**
 * Created by joshcaro on 20/01/17.
 */
public class AuxDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:8889/PaisJAX";
    private static final String USER = "root";
    private static final String PASS = "root";


    public Estado getEstado(String s){
        Estado estado = null;
        try {
            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement consulta = conexion.createStatement();
            ResultSet resultado = consulta.executeQuery("SELECT * FROM estado WHERE `nombre` = `"+s+"`");


             estado =  new Estado();
            estado.setIdEstado(resultado.getInt("idEstado"));
            estado.setNombre(resultado.getString("nombre"));
            estado.setCapital(resultado.getString("capital"));
            estado.setCuriosidades(resultado.getString("curiosidades"));
            estado.setLugaresInteresantes(resultado.getString("lugaresInteresantes"));
            estado.setCiudades(resultado.getInt("ciudades"));

            resultado.close();
            consulta.close();
            conexion.close();
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }

        return estado;
    }

}
