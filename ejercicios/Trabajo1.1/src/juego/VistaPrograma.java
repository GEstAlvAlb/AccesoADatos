package juego;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import base.Juego;

import java.awt.GridLayout;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class VistaPrograma extends JFrame {

	private JPanel contentPane;
	public JList<Juego> lJuegos;
	public JLabel lblNewLabel;
	public JButton btnNuevo;
	public JButton btnEditar;
	public JButton btnEliminar;
	public DefaultListModel<Juego> mJuegos;

	Frame ventana ;
	public JButton btnBorrarTodo;
	public JTextField txBuscar;
	public JLabel lblBuscador;
	public JLabel lblNombre;
	public JLabel lbCopias;
	public JLabel lblValoracion;
	public JLabel lblPrecio;
	public JLabel lblDuracion;

	public VistaPrograma() {
		ventana=new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 335);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		lJuegos = new JList<>();
		lJuegos.setBounds(109, 14, 220, 271);
		contentPane.add(lJuegos);

		lblNewLabel = new JLabel("Juegos");
		lblNewLabel.setBounds(21, 12, 58, 21);
		contentPane.add(lblNewLabel);

		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(10, 44, 89, 23);
		contentPane.add(btnNuevo);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(10, 78, 89, 23);
		contentPane.add(btnEditar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 262, 89, 23);
		contentPane.add(btnEliminar);

		mJuegos = new DefaultListModel<>();
		lJuegos.setModel(mJuegos);
		contentPane.setLayout(null);
		
		btnBorrarTodo = new JButton("Borrar todo");
		btnBorrarTodo.setBounds(332, 262, 121, 23);
		contentPane.add(btnBorrarTodo);
		
		txBuscar = new JTextField();
		txBuscar.setBounds(339, 45, 114, 20);
		contentPane.add(txBuscar);
		txBuscar.setColumns(10);
		
		lblBuscador = new JLabel("Buscador");
		lblBuscador.setBounds(367, 15, 52, 14);
		contentPane.add(lblBuscador);
		
		lblNombre = new JLabel("");
		lblNombre.setBounds(21, 138, 46, 14);
		contentPane.add(lblNombre);
		
		lbCopias = new JLabel("");
		lbCopias.setBounds(21, 163, 46, 14);
		contentPane.add(lbCopias);
		
		lblValoracion = new JLabel("");
		lblValoracion.setBounds(21, 212, 46, 14);
		contentPane.add(lblValoracion);
		
		lblPrecio = new JLabel("");
		lblPrecio.setBounds(21, 237, 46, 14);
		contentPane.add(lblPrecio);
		
		lblDuracion = new JLabel("");
		lblDuracion.setBounds(21, 188, 46, 14);
		contentPane.add(lblDuracion);
		repaint();
	}
}
