package Vistas;

import javax.swing.*;

public class EliminarProducto extends JFrame {

    public EliminarProducto() {
        setTitle("Eliminar Producto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Aquí va la ventana para eliminar producto"), "Center");
    }
}