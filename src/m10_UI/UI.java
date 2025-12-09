package m10_UI;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI {
    static void main() {
        // VENTANA PRINCIPAL
        JFrame ventana = new JFrame("Interfaz completa para curso de Java");
        ventana.setSize(700, 450);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        /* ZONA SUPERIOR */
        // PANEL SUPERIOR DONDE LOS COMPONENTES SE DIBUJARAN UNO DETRAS DE OTRO
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new FlowLayout());

        //LABEL
        JLabel etiqueta = new JLabel("Escribe tu nombre: ");
        panelSuperior.add(etiqueta);

        //TEXT FIELD
        JTextField campoTexto = new JTextField(10);
        panelSuperior.add(campoTexto);

        //BUTTON
        JButton botonSaludar = new JButton("Saludar");
        panelSuperior.add(botonSaludar);

        //COMBO BOX
        String[] opciones = {"Opcion A", "Opcion B", "Opcion C"};
        JComboBox<String> combo = new JComboBox<>(opciones);
        panelSuperior.add(combo);


        botonSaludar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = campoTexto.getText();
                String opcion = combo.getSelectedItem().toString();

                JOptionPane.showMessageDialog(ventana,
                        "Hola " + nombre + " has seleccionado la : " + opcion,
                        "Saludar",
                        JOptionPane.INFORMATION_MESSAGE);

            }
        });

        //AÑADIR A LA VENTANA EL PANEL SUPERIOR
        ventana.add(panelSuperior, BorderLayout.NORTH);

        /* ZONA CENTRAL */
        // TABLA CENTRAL
        String[] columnas = {"Producto", "Cantidad", "Precio"};

        DefaultTableModel modeloTabla = new DefaultTableModel(columnas, 0);
        JTable tabla = new JTable(modeloTabla);

        modeloTabla.addRow(new Object[]{"Manzana", 8, 2.2});
        modeloTabla.addRow(new Object[]{"Pera", 10, 1.3});
        modeloTabla.addRow(new Object[]{"Sandia", 1, 3});
        modeloTabla.addRow(new Object[]{"Platano", 12, 2.6});
        modeloTabla.addRow(new Object[]{"Mango", 5, 4.2});
        modeloTabla.addRow(new Object[]{"Tomate", 9, 1.6});

        JScrollPane scrollTabla = new JScrollPane(tabla);
        ventana.add(scrollTabla, BorderLayout.CENTER);


        /* ZONA INFERIOR */
        JPanel panelInferior = new JPanel();
        panelInferior.setLayout(new FlowLayout());

        //LABEL PARA CADA CAMPO
        JLabel labelProducto = new JLabel("Producto: ");
        JTextField campoProducto = new JTextField(8);
        panelInferior.add(labelProducto);
        panelInferior.add(campoProducto);

        JLabel labelCantidad = new JLabel("Cantidad: ");
        JTextField campoCantidad = new JTextField(8);
        panelInferior.add(labelCantidad);
        panelInferior.add(campoCantidad);

        JLabel labelPrecio = new JLabel("Precio: ");
        JTextField campoPrecio = new JTextField(8);
        panelInferior.add(labelPrecio);
        panelInferior.add(campoPrecio);

        JButton botonAgregarFila = new JButton("Añadir producto");
        panelInferior.add(botonAgregarFila);

        // AÑADIR NUEVAS FILAS
        botonAgregarFila.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String producto = campoProducto.getText();
                String cantidad = campoCantidad.getText();
                String precio = campoPrecio.getText();

                try {

                    int cantidadNumero = Integer.parseInt(cantidad);
                    double precioNumero = Double.parseDouble(precio);
                    modeloTabla.addRow(new Object[]{producto, cantidadNumero, precioNumero});

                } catch (NumberFormatException error) {
                    JOptionPane.showMessageDialog(ventana,
                            "Campo invalido, debe de ser un número: " + error,
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

                campoProducto.setText("");
                campoPrecio.setText("");
                campoCantidad.setText("");
            }
        });


        ventana.add(panelInferior, BorderLayout.SOUTH);

        //MOSTRAR VENTANA
        ventana.setVisible(true);


    }

}
