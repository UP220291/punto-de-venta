package main.java.app.models.metodosPago;

public class TarjetaCredito extends MetodoPago {

    private String numeroTarjeta;

    public TarjetaCredito(int id, String nombre, String numeroTarjeta) {
        super(id, nombre);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Procesando pago de " + monto + " con tarjeta terminación "
                + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}
