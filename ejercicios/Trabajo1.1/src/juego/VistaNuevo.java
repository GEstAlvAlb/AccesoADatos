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


	
	public JTextField tfNombre;
	public JTextField tfCopias;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JTextField tfValoracion;
	public JLabel lblNewLabel_2;
	public JLabel lblPrecio;
	public JTextField tfPrecio;
	public JTextField tfDuracion;
	public JLabel lblNewLabel_3;
	public JLabel lblPortada;
	public JLabel lblmagen;
	public JButton btGuardar;
	public JButton btCancelar;
	JFrame ventana;
	
	public VistaNuevo() {
		getContentPane().setEnabled(false);
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
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel, 3, SpringLayout.NORTH, tfNombre);
		getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Copias Vendidas");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, 0, SpringLayout.SOUTH, tfCopias);
		springLayout.putConstraint(SpringLayout.EAST, lblNewLabel_1, -23, SpringLayout.WEST, tfCopias);
		getContentPane().add(lblNewLabel_1);
		
		tfValoracion = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfValoracion, 6, SpringLayout.SOUTH, tfCopias);
		springLayout.putConstraint(SpringLayout.EAST, tfValoracion, 0, SpringLayout.EAST, tfNombre);
		getContentPane().add(tfValoracion);
		tfValoracion.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Valoracion");
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		springLayout.putConstraint(SpringLayout.SOUTH, lblNewLabel_2, 0, SpringLayout.SOUTH, tfValoracion);
		getContentPane().add(lblNewLabel_2);
		
		lblPrecio = new JLabel("Precio");
		springLayout.putConstraint(SpringLayout.WEST, lblPrecio, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(lblPrecio);
		
		tfPrecio = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, lblPrecio, 3, SpringLayout.NORTH, tfPrecio);
		springLayout.putConstraint(SpringLayout.NORTH, tfPrecio, 6, SpringLayout.SOUTH, tfValoracion);
		springLayout.putConstraint(SpringLayout.WEST, tfPrecio, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(tfPrecio);
		tfPrecio.setColumns(10);
		
		tfDuracion = new JTextField();
		springLayout.putConstraint(SpringLayout.NORTH, tfDuracion, 6, SpringLayout.SOUTH, tfPrecio);
		springLayout.putConstraint(SpringLayout.WEST, tfDuracion, 0, SpringLayout.WEST, tfNombre);
		getContentPane().add(tfDuracion);
		tfDuracion.setColumns(10);
		
		lblNewLabel_3 = new JLabel("Duracion");
		springLayout.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 3, SpringLayout.NORTH, tfDuracion);
		springLayout.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		getContentPane().add(lblNewLabel_3);
		
		lblPortada = new JLabel("Portada");
		springLayout.putConstraint(SpringLayout.EAST, lblPortada, -78, SpringLayout.EAST, getContentPane());
		getContentPane().add(lblPortada);
		
		lblmagen = new JLabel("");
		springLayout.putConstraint(SpringLayout.WEST, lblmagen, 271, SpringLayout.WEST, getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, tfNombre, -35, SpringLayout.WEST, lblmagen);
		springLayout.putConstraint(SpringLayout.NORTH, lblmagen, 57, SpringLayout.NORTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblmagen, -76, SpringLayout.SOUTH, getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, lblPortada, -6, SpringLayout.NORTH, lblmagen);
		springLayout.putConstraint(SpringLayout.EAST, lblmagen, -35, SpringLayout.EAST, getContentPane());
		lblmagen.setIcon(new ImageIcon("C:\\Users\\Alumnot\\Downloads\\fotoRota.jfif"));
		getContentPane().add(lblmagen);
		
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
		ventana.setVisible(false);
		
	}
}
