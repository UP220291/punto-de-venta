package Vistas;

import javax.swing.*;

public class Roles extends JFrame {

    public Roles() {
        setTitle("Roles de Usuario");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Ventana para administrar roles"), "Center");
    }
}