package Vistas;

import javax.swing.*;

public class AgregarProducto extends JFrame {

    public AgregarProducto() {
        setTitle("Agregar Producto");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        add(new JLabel("Aquí va el formulario para agregar producto"), "Center");
    }
}