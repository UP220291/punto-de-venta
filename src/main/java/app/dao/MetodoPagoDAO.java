package main.java.app.dao;

import main.java.app.models.metodosPago.MetodoPago;
import main.java.app.services.MetodoPagoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MetodoPagoDAO {

    private Connection conexion;

    public MetodoPagoDAO(Connection conexion) {
        this.conexion = conexion;
    }

    public List<MetodoPago> obtenerMetodosActivos() {
        List<MetodoPago> metodos = new ArrayList<>();

        String sql = "SELECT C_ID_metodo, C_Nombre FROM METODO_PAGO WHERE C_Activo = 1";

        try (PreparedStatement stmt = conexion.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("C_ID_metodo");
                String nombre = rs.getString("C_Nombre");

                // construimos objetos según nombre
                MetodoPago metodo = MetodoPagoFactory.crear(id, nombre);

                metodos.add(metodo);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return metodos;
    }
}
