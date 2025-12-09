package main.java.app.models.metodosPago;

public abstract class MetodoPago {

    protected int idMetodo;
    protected String nombre;
    protected boolean activo;

    public MetodoPago() {}

    public MetodoPago(int idMetodo, String nombre, boolean activo) {
        this.idMetodo = idMetodo;
        this.nombre = nombre;
        this.activo = activo;
    }

    public int getIdMetodo() {
        return idMetodo;
    }

    public void setIdMetodo(int idMetodo) {
        this.idMetodo = idMetodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public abstract boolean procesarPago(double monto);
}
