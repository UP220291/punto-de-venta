package Vistas;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import conexion.DBConnection;

public class VentanaProductos extends JFrame {

    private JTable tabla;
    private DefaultTableModel modelo;
    private JTextField txtNombre, txtPrecio, txtStock;
    private JButton btnAgregar, btnActualizar, btnEliminar, btnLimpiar;

    public VentanaProductos() {
        setTitle("Gestión de Productos");
        setSize(700, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel superior (Formulario)
        JPanel panelForm = new JPanel(new GridLayout(4, 2, 5, 5));
        panelForm.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelForm.add(new JLabel("Nombre:"));
        txtNombre = new JTextField();
        panelForm.add(txtNombre);

        panelForm.add(new JLabel("Precio:"));
        txtPrecio = new JTextField();
        panelForm.add(txtPrecio);

        panelForm.add(new JLabel("Stock:"));
        txtStock = new JTextField();
        panelForm.add(txtStock);

        btnAgregar = new JButton("Agregar");
        btnActualizar = new JButton("Actualizar");
        panelForm.add(btnAgregar);
        panelForm.add(btnActualizar);

        add(panelForm, BorderLayout.NORTH);

        // Tabla
        modelo = new DefaultTableModel(new String[]{"ID", "Nombre", "Precio", "Stock"}, 0);
        tabla = new JTable(modelo);
        JScrollPane scroll = new JScrollPane(tabla);
        add(scroll, BorderLayout.CENTER);

        // Panel inferior (botones)
        JPanel panelBotones = new JPanel();
        btnEliminar = new JButton("Eliminar");
        btnLimpiar = new JButton("Limpiar");
        panelBotones.add(btnEliminar);
        panelBotones.add(btnLimpiar);

        add(panelBotones, BorderLayout.SOUTH);

        // Eventos
        btnAgregar.addActionListener(e -> agregarProducto());
        btnActualizar.addActionListener(e -> actualizarProducto());
        btnEliminar.addActionListener(e -> eliminarProducto());
        btnLimpiar.addActionListener(e -> limpiarCampos());

        tabla.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int fila = tabla.getSelectedRow();
                if (fila >= 0) {
                    txtNombre.setText(modelo.getValueAt(fila, 1).toString());
                    txtPrecio.setText(modelo.getValueAt(fila, 2).toString());
                    txtStock.setText(modelo.getValueAt(fila, 3).toString());
                }
            }
        });

        cargarProductos();
        setVisible(true);
    }

    private void cargarProductos() {
        modelo.setRowCount(0);
        try (Connection cn = DBConnection.getConnection();
             PreparedStatement ps = cn.prepareStatement("SELECT * FROM productos");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                modelo.addRow(new Object[]{rs.getInt("id"), rs.getString("nombre"), rs.getDouble("precio"), rs.getInt("stock")});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar productos: " + e.getMessage());
        }
    }

    private void agregarProducto() {
        try (Connection cn = DBConnection.getConnection();
             PreparedStatement ps = cn.prepareStatement("INSERT INTO productos(nombre, precio, stock) VALUES (?, ?, ?)") ) {

            ps.setString(1, txtNombre.getText());
            ps.setDouble(2, Double.parseDouble(txtPrecio.getText()));
            ps.setInt(3, Integer.parseInt(txtStock.getText()));
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Producto agregado");
            cargarProductos();
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al agregar: " + e.getMessage());
        }
    }

    private void actualizarProducto() {
        int fila = tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un producto");
            return;
        }

        int id = (int) modelo.getValueAt(fila, 0);

        try (Connection cn = DBConnection.getConnection();
             PreparedStatement ps = cn.prepareStatement("UPDATE productos SET nombre=?, precio=?, stock=? WHERE id=?")) {

            ps.setString(1, txtNombre.getText());
            ps.setDouble(2, Double.parseDouble(txtPrecio.getText()));
            ps.setInt(3, Integer.parseInt(txtStock.getText()));
            ps.setInt(4, id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Producto actualizado");
            cargarProductos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al actualizar: " + e.getMessage());
        }
    }

    private void eliminarProducto() {
        int fila = tabla.getSelectedRow();
        if (fila < 0) {
            JOptionPane.showMessageDialog(this, "Selecciona un producto");
            return;
        }

        int id = (int) modelo.getValueAt(fila, 0);

        try (Connection cn = DBConnection.getConnection();
             PreparedStatement ps = cn.prepareStatement("DELETE FROM productos WHERE id=?")) {

            ps.setInt(1, id);
            ps.executeUpdate();

            JOptionPane.showMessageDialog(this, "Producto eliminado");
            cargarProductos();
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al eliminar: " + e.getMessage());
        }
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtPrecio.setText("");
        txtStock.setText("");
        tabla.clearSelection();
    }
}