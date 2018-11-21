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

public class VistaPrograma extends JFrame {

	private JPanel contentPane;
	public JList<Juego> lJuegos;
	public JLabel lblNewLabel;
	public JButton btnNuevo;
	public JButton btnEditar;
	public JButton btnEliminar;
	public DefaultListModel<Juego> mJuegos;

	Frame ventana ;

	public VistaPrograma() {
		ventana=new JFrame();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		

		lJuegos = new JList<>();
		lJuegos.setBounds(191, 11, 220, 239);
		contentPane.add(lJuegos);

		lblNewLabel = new JLabel("Juegos");
		lblNewLabel.setBounds(64, 12, 58, 21);
		contentPane.add(lblNewLabel);

		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(10, 44, 89, 23);
		contentPane.add(btnNuevo);

		btnEditar = new JButton("Editar");
		btnEditar.setBounds(10, 78, 89, 23);
		contentPane.add(btnEditar);

		btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(10, 227, 89, 23);
		contentPane.add(btnEliminar);

		mJuegos = new DefaultListModel<>();
		lJuegos.setModel(mJuegos);
		contentPane.setLayout(null);
		repaint();
	}
}
