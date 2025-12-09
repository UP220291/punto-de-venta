package main.java.app.models.metodosPago;
public class Efectivo extends MetodoPago {

    public Efectivo(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pagando " + monto + " con " + nombre);
    }
}
