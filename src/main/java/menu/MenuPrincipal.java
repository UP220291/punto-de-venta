package menu;

import interfaz.Dashboard;

import javax.swing.*;
import java.awt.*;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        setTitle("Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(2, 1, 10, 10));

        JButton btnDashboard = new JButton("Abrir Dashboard");
        JButton btnSalir = new JButton("Salir");

        add(btnDashboard);
        add(btnSalir);

        btnDashboard.addActionListener(e -> {
            Dashboard dashboard = new Dashboard();
            dashboard.setVisible(true);
        });

        btnSalir.addActionListener(e -> System.exit(0));
    }

    public static void main(String[] args) {
        new MenuPrincipal().setVisible(true);
    }
}