package Vistas;

import javax.swing.*;

public class AgregarUsuario extends JFrame {

    public AgregarUsuario() {
        setTitle("Agregar Usuario");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Aquí va el formulario para agregar usuario"), "Center");
    }
}