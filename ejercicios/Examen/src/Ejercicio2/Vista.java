package Ejercicio2;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.DefaultListModel;
import javax.swing.JButton;

public class Vista extends JFrame {

	private JPanel contentPane;
	public JPanel panel;
	public JTextField txTexto;
	public JButton btnGuardarComo;

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		JLabel Texto = new JLabel("Texto");
		Texto.setBounds(30, 56, 46, 14);
		panel.add(Texto);

		txTexto = new JTextField();
		txTexto.setBounds(10, 81, 194, 90);
		panel.add(txTexto);
		txTexto.setColumns(10);
		
		btnGuardarComo = new JButton("Guardar como");
		btnGuardarComo.setBounds(278, 186, 136, 23);
		panel.add(btnGuardarComo);

	
		setVisible(true);

	}
}
