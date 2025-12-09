package main.java.app.services;

import main.java.app.models.metodosPago.Efectivo;
import main.java.app.models.metodosPago.MetodoPago;
import main.java.app.models.metodosPago.TarjetaCredito;

public class MetodoPagoFactory {

    public static MetodoPago crear(int id, String nombre) {

        nombre = nombre.toLowerCase();

        switch (nombre) {
            case "efectivo":
                return new Efectivo(id, nombre);

            case "tarjeta":
            case "tarjeta de crédito":
            case "tarjeta credito":
                return new TarjetaCredito(id, nombre, "0000123412341234");

            default:
                throw new RuntimeException("Método de pago no implementado: " + nombre);
        }
    }
}
