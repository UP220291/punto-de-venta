package main.java.app.models;

import main.java.app.models.metodosPago.MetodoPago;

import java.time.LocalDateTime;
import java.util.List;

public class sell {

    private int idVenta;
    private LocalDateTime fechaHora;
    private double total;
    private Users usuario;
    private MetodoPago metodoPago;

    public sell() {}

    public sell(int idVenta, LocalDateTime fechaHora, double total,
                Users usuario, MetodoPago metodoPago) {
        this.idVenta = idVenta;
        this.fechaHora = fechaHora;
        this.total = total;
        this.usuario = usuario;
        this.metodoPago = metodoPago;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Users getUsuario() {
        return usuario;
    }

    public void setUsuario(Users usuario) {
        this.usuario = usuario;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }

}
