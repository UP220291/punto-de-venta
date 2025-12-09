package Vistas;

import javax.swing.*;

public class EliminarUsuario extends JFrame {

    public EliminarUsuario() {
        setTitle("Eliminar Usuario");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Aquí va la ventana para eliminar usuario"), "Center");
    }
}