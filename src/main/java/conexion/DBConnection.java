package conexion;

import java.sql.DriverManager;
import java.sql.Connection;

public class DBConnection {

    private static final String URL = "jdbc:mysql://127.0.0.1:3306/grupoB";
    private static final String USER = "root";
    private static final String PASSWORD = "admin123";

    public static Connection getConnection() {
        Connection connection = null;
        try{
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to database successfully");
        } catch (Exception e){
            System.out.println("Connection failed" + e.getMessage());
        }

        return connection;
    }
}
