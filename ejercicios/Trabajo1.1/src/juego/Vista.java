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

public class Vista extends JFrame {


	JFrame ventana;
	public JTextField tfNombre;
	public JTextField tfCopias;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JTextField txFecha;
	public JLabel lblNewLabel_2;
	public JLabel lblPrecio;
	public JTextField txPrecio;
	public JTextField txDuracion;
	public JLabel lblNewLabel_3;
	public JLabel lblPortada;
	public JLabel lblNewLabel_4;
	public JButton btGuardar;
	public JButton btCancelar;
	
	public Vista() {
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
		
		txFecha = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txFecha, 6, SpringLayout.SOUTH, tfCopias);
		springLayout.putConstraint(SpringLayout.EAST, txFecha, 0, SpringLayout.EAST, tfNombre);
		getContentPane().add(txFecha);
		txFecha.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Fecha Lanzamiento");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, txFecha);
		getContentPane().add(lblNewLabel_2);
		
		lblPrecio = new JLabel("Precio");
		springLayout.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(lblPrecio);
		
		txPrecio = new JTextField();
		springLayout.putConstraint(SpringLayout.SOUTH, lblPrecio, 0, SpringLayout.SOUTH, txPrecio);
		springLayout.putConstraint(SpringLayout.NORTH, txPrecio, 6, SpringLayout.SOUTH, txFecha);
		springLayout.putConstraint(SpringLayout.WEST, txPrecio, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(txPrecio);
		txPrecio.setColumns(10);
		
		txDuracion = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, txDuracion, 6, SpringLayout.SOUTH, txPrecio);
		springLayout.putConstraint(SpringLayout.WEST, txDuracion, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(txDuracion);
		txDuracion.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Duracion");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_3, 0, SpringLayout.SOUTH, txDuracion);
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
		ventana= new JFrame();
		ventana.setBounds(100,100,450,300);
		ventana.getContentPane().setLayout(null);
	}
}
