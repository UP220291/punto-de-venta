package test;
import conexion.DBConnection;
import java.sql.Connection;

public class TestConection {
    public static void main(String[] args) {
        Connection conn = DBConnection.getConnection();

        if (conn != null) {
            System.out.println(" Conexión exitosa");
        } else {
            System.out.println("X No se pudo conectar");
        }
    }
}