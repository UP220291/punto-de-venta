package interfaz;


import Vistas.*;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JFrame {

    public Dashboard() {
        setTitle("Dashboard del Sistema");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(7, 1, 10, 10));

        JButton btnAgregarProducto = new JButton("Agregar Producto");
        JButton btnEliminarProducto = new JButton("Eliminar Producto");
        JButton btnAgregarUsuario = new JButton("Agregar Usuario");
        JButton btnEliminarUsuario = new JButton("Eliminar Usuario");
        JButton btnRoles = new JButton("Roles");
        JButton btnMetodoPago = new JButton("Método de Pago");
        JButton btnVenta = new JButton("Venta");

        add(btnAgregarProducto);
        add(btnEliminarProducto);
        add(btnAgregarUsuario);
        add(btnEliminarUsuario);
        add(btnRoles);
        add(btnMetodoPago);
        add(btnVenta);

        btnAgregarProducto.addActionListener(e -> new AgregarProducto().setVisible(true));
        btnEliminarProducto.addActionListener(e -> new EliminarProducto().setVisible(true));
        btnAgregarUsuario.addActionListener(e -> new AgregarUsuario().setVisible(true));
        btnEliminarUsuario.addActionListener(e -> new EliminarUsuario().setVisible(true));
        btnRoles.addActionListener(e -> new Roles().setVisible(true));
        btnMetodoPago.addActionListener(e -> new MetodoPago().setVisible(true));
        btnVenta.addActionListener(e -> new Ventas().setVisible(true));
    }
}