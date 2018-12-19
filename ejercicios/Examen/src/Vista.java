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
	public JLabel lbModelo;
	public JTextField txModelo;
	public JLabel lbMarca;
	public JLabel lbprecio;
	public JLabel lbFecha;
	public JTextField txMarca;
	public JTextField txPrecio;
	public JTextField txFecha;
	public JList<Ejer1> lLista;
	public JButton btnNuevo;
	public DefaultListModel<Ejer1> mLista;

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

		lbModelo = new JLabel("Modelo");
		lbModelo.setBounds(30, 56, 46, 14);
		panel.add(lbModelo);

		txModelo = new JTextField();
		txModelo.setBounds(118, 53, 86, 20);
		panel.add(txModelo);
		txModelo.setColumns(10);

		lbMarca = new JLabel("Marca");
		lbMarca.setBounds(30, 96, 46, 14);
		panel.add(lbMarca);

		lbprecio = new JLabel("Precio");
		lbprecio.setBounds(30, 129, 46, 14);
		panel.add(lbprecio);

		lbFecha = new JLabel("Fecha de compra");
		lbFecha.setBounds(30, 154, 103, 14);
		panel.add(lbFecha);

		txMarca = new JTextField();
		txMarca.setBounds(118, 93, 86, 20);
		panel.add(txMarca);
		txMarca.setColumns(10);

		txPrecio = new JTextField();
		txPrecio.setBounds(118, 126, 86, 20);
		panel.add(txPrecio);
		txPrecio.setColumns(10);

		txFecha = new JTextField();
		txFecha.setBounds(118, 151, 86, 20);
		panel.add(txFecha);
		txFecha.setColumns(10);

		lLista = new JList();
		lLista.setBounds(258, 24, 137, 184);
		panel.add(lLista);

		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(10, 204, 89, 23);
		panel.add(btnNuevo);

		mLista = new DefaultListModel<>();
		lLista.setModel(mLista);
		
		setVisible(true);

	}
}
