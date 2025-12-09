package Vistas;

import javax.swing.*;

public class MetodoPago extends JFrame {

    public MetodoPago() {
        setTitle("Método de Pago");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Ventana para administrar métodos de pago"), "Center");
    }
}