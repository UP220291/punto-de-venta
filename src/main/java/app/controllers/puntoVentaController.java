package main.java.app.controllers;

import main.java.app.dao.MetodoPagoDAO;
import main.java.app.models.metodosPago.MetodoPago;

import java.sql.Connection;
import java.util.List;

public class PuntoVentaController {

    private MetodoPagoDAO metodoPagoDAO;

    public PuntoVentaController(Connection conexion) {
        this.metodoPagoDAO = new MetodoPagoDAO(conexion);
    }

    public void mostrarMetodosPago() {
        List<MetodoPago> metodos = metodoPagoDAO.obtenerMetodosActivos();

        System.out.println("Métodos de pago disponibles:");
        for (MetodoPago mp : metodos) {
            System.out.println(mp.getId() + " - " + mp.getNombre());
        }
    }

    public void procesarPago(int idMetodo, double monto) {

        MetodoPago mp = metodoPagoDAO.obtenerMetodoPorId(idMetodo);

        if (mp == null) {
            System.out.println("Error: método no encontrado.");
            return;
        }

        mp.procesarPago(monto);
    }
}
