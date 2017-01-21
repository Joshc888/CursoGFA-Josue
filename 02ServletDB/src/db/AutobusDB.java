package db;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;
import model.Autobus;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutobusDB {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:8889/gfajava";
    private static final String USER = "root";
    private static final String PASS = "root";

    public int registrarAutobus(Autobus autobus)throws ClassNotFoundException,
            SQLException{



            Class.forName(JDBC_DRIVER);
            Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
            Statement consulta = conexion.createStatement();
        //String query = String.format("INSERT INTO autobus(num_autobus,siglas,modelo,capacidad,base) values ('%d','%s','%d','%d','%s')",
                //    autobus.getNum_autobus(),autobus.getSiglas(),autobus.getModelo(),autobus.getCapacidad(),autobus.getBase());


            String query = String.format("INSERT INTO autobus(siglas,modelo,capacidad,base) values ('%s','%d','%d','%s')",
              autobus.getSiglas(),autobus.getModelo(),autobus.getCapacidad(),autobus.getBase());


            int res = consulta.executeUpdate(query);
            consulta.close();
            conexion.close();

            return res;


    }

    public List<Autobus> getAutobuses()
            throws ClassNotFoundException,
            SQLException{

        Class.forName(JDBC_DRIVER);
        Connection conexion = DriverManager.getConnection(DB_URL,USER,PASS);
        Statement consulta = conexion.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM autobus");

        ArrayList<Autobus> lista = new ArrayList<>();


        while (resultado.next()){
            /*
            int num_autobus = resultado.getInt("num_autobus");
            String siglas = resultado.getString("siglas");
            int modelo = resultado.getInt("modelo");
            int capacidad = resultado.getInt("capacidad");
            String base = resultado.getString("base");
            */
            Autobus autobus =  new Autobus();

            autobus.setNum_autobus(resultado.getInt("num_autobus"));
            autobus.setSiglas(resultado.getString("siglas"));
            autobus.setModelo(resultado.getInt("modelo"));
            autobus.setCapacidad(resultado.getInt("capacidad"));
            autobus.setBase(resultado.getString("base"));

            lista.add(autobus);
        }

        resultado.close();
        consulta.close();
        conexion.close();

        return lista;

    }

}
