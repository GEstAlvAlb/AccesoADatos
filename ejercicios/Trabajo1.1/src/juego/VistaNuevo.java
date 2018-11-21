package juego;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class VistaNuevo extends JFrame {


	JFrame ventana;
	public JTextField tfNombre;
	public JTextField tfCopias;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JTextField tfFecha;
	public JLabel lblNewLabel_2;
	public JLabel lblPrecio;
	public JTextField tfPrecio;
	public JTextField tfDuracion;
	public JLabel lblNewLabel_3;
	public JLabel lblPortada;
	public JLabel lblNewLabel_4;
	public JButton btGuardar;
	public JButton btCancelar;
	
	public VistaNuevo() {
		ventana= new JFrame();
		ventana.setBounds(100,100,450,300);
		ventana.getContentPane().setLayout(null);
		SpringLayout springLayout = new SpringLayout();
		getContentPane().setLayout(springLayout);
		
		tfNombre = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfNombre, 42, SpringLayout.NORTH, getContentPane());
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfCopias = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfCopias, 68, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tfCopias, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(tfCopias);
		tfCopias.setColumns(10);
		
		lblNewLabel = new JLabel("Nombre");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel, -202, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, tfNombre, 64, SpringLayout.EAST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel, -348, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Copias Vendidas");
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, tfCopias);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -23, SpringLayout.WEST, tfCopias);
		getContentPane().add(lblNewLabel_1);
		
		tfFecha = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfFecha, 6, SpringLayout.SOUTH, tfCopias);
		springLayout.putConstraint(SpringLayout.EAST, tfFecha, 0, SpringLayout.EAST, tfNombre);
		getContentPane().add(tfFecha);
		tfFecha.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Fecha Lanzamiento");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, tfFecha);
		getContentPane().add(lblNewLabel_2);
		
		lblPrecio = new JLabel("Precio");
		springLayout.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(lblPrecio);
		
		tfPrecio = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, lblPrecio, 0, SpringLayout.SOUTH, tfPrecio);
		springLayout.putConstraint(SpringLayout.NORTH, tfPrecio, 6, SpringLayout.SOUTH, tfFecha);
		springLayout.putConstraint(SpringLayout.WEST, tfPrecio, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(tfPrecio);
		tfPrecio.setColumns(10);
		
		tfDuracion = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfDuracion, 6, SpringLayout.SOUTH, tfPrecio);
		springLayout.putConstraint(SpringLayout.WEST, tfDuracion, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(tfDuracion);
		tfDuracion.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Duracion");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 0, SpringLayout.SOUTH, tfDuracion);
		getContentPane().add(lblNewLabel_3);
		
		lblPortada = new JLabel("Portada");
		springLayout.putConstraint(SpringLayout.EAST, lblPortada, -78, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblPortada);
		
		lblNewLabel_4 = new JLabel("");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 57, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_4, -76, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblPortada, -6, SpringLayout.NORTH, lblNewLabel_4);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_4, 35, SpringLayout.EAST, tfNombre);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_4, -35, SpringLayout.EAST, getContentPane());
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\Alumnot\\Downloads\\fotoRota.jfif"));
		getContentPane().add(lblNewLabel_4);
		
		btGuardar = new JButton("Guardar");
		springLayout.putConstraint(SpringLayout.SOUTH, btGuardar, -28, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, btGuardar, 0, SpringLayout.EAST, lblNewLabel_1);
		getContentPane().add(btGuardar);
		
		btCancelar = new JButton("Cancelar");
		springLayout.putConstraint(SpringLayout.WEST, btCancelar, 0, SpringLayout.WEST, tfNombre);
		springLayout.putConstraint(SpringLayout.SOUTH, btCancelar, 0, SpringLayout.SOUTH, btGuardar);
		getContentPane().add(btCancelar);
		
		ventana.setLocationRelativeTo(null);
		ventana.repaint();
		ventana.setVisible(true);
		
	}
}
