package Vistas;

import javax.swing.*;

public class Ventas extends JFrame {

    public Ventas() {
        setTitle("Ventas");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Aquí va la ventana para procesar ventas"), "Center");
    }
}