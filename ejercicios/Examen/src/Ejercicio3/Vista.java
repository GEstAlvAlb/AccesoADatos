package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class Vista extends JFrame {

	private JPanel contentPane;
	public JLabel lblNombre;
	public JLabel lblNewLabel;
	public JLabel lblNewLabel_1;
	public JLabel lblNewLabel_2;
	public JTextField txNombre;
	public JTextField txPatrocinador;
	public JTextField txPresupuesto;
	public JTextField txCategoria;
	public JButton btnRegistrar;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre*");
		lblNombre.setBounds(21, 46, 83, 14);
		contentPane.add(lblNombre);
		
		lblNewLabel = new JLabel("patrocinador*");
		lblNewLabel.setBounds(21, 80, 110, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("presupuesto");
		lblNewLabel_1.setBounds(21, 120, 83, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("categoria");
		lblNewLabel_2.setBounds(21, 150, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txNombre = new JTextField();
		txNombre.setBounds(196, 43, 86, 20);
		contentPane.add(txNombre);
		txNombre.setColumns(10);
		
		txPatrocinador = new JTextField();
		txPatrocinador.setBounds(196, 77, 86, 20);
		contentPane.add(txPatrocinador);
		txPatrocinador.setColumns(10);
		
		txPresupuesto = new JTextField();
		txPresupuesto.setBounds(196, 117, 86, 20);
		contentPane.add(txPresupuesto);
		txPresupuesto.setColumns(10);
		
		txCategoria = new JTextField();
		txCategoria.setBounds(196, 147, 86, 20);
		contentPane.add(txCategoria);
		txCategoria.setColumns(10);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.setBounds(63, 200, 89, 23);
		contentPane.add(btnRegistrar);
		setVisible(true);
	}

}
