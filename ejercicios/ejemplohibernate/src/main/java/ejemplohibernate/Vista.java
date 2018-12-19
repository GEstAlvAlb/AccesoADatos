package ejemplohibernate;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;


public class Vista extends JFrame {

	JFrame ventana;
	public JTextField tfNombre;
	public JTextField tfVida;
	public JTextField tfAtaque;
	public JButton btEditar;

	public JScrollPane scrollPane;
	
	public JButton btNuevo;
	public JButton btGuardar;
	public JLabel lblNewLabel_1;
	public JTextField tfDescripcion;
	public JButton btnNuevo;

	public Vista() {
		ventana = new JFrame();
		ventana.setBounds(100, 100, 450, 366);
		ventana.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nombre*");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 31, 57, 14);
		ventana.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Vida");
		lblNewLabel_2.setBounds(10, 93, 46, 14);
		ventana.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Ataque");
		lblNewLabel_3.setBounds(10, 124, 46, 14);
		ventana.getContentPane().add(lblNewLabel_3);
		
		tfNombre = new JTextField();
		tfNombre.setBounds(103, 28, 86, 20);
		ventana.getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfVida = new JTextField();
		tfVida.setBounds(103, 90, 86, 20);
		ventana.getContentPane().add(tfVida);
		tfVida.setColumns(10);
		
		tfAtaque = new JTextField();
		tfAtaque.setBounds(103, 121, 86, 20);
		ventana.getContentPane().add(tfAtaque);
		tfAtaque.setColumns(10);
		
		btEditar = new JButton("Editar");
		btEditar.setIcon(new ImageIcon("C:\\Users\\Profesor\\Downloads\\open_icon_library-standard-0.11\\open_icon_library-standard\\icons\\png\\32x32\\actions\\edit.png"));
		btEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btEditar.setActionCommand("editar");
		btEditar.setBounds(133, 210, 73, 41);
		ventana.getContentPane().add(btEditar);
		
	

		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(258, 11, 166, 180);
		ventana.getContentPane().add(scrollPane);
		
		
		ventana.setVisible(true);
		
		
		
		btNuevo = new JButton("Guardar");
		btNuevo.setActionCommand("nuevo");
		btNuevo.setIcon(new ImageIcon("C:\\Users\\Profesor\\Downloads\\open_icon_library-standard-0.11\\open_icon_library-standard\\icons\\png\\32x32\\actions\\contact-new-3.png"));
		btNuevo.setBounds(17, 210, 86, 41);
		ventana.getContentPane().add(btNuevo);
		
		btGuardar = new JButton("Eliminar");
		btGuardar.setActionCommand("guardar");
		btGuardar.setIcon(new ImageIcon("C:\\Users\\Profesor\\Downloads\\open_icon_library-standard-0.11\\open_icon_library-standard\\icons\\png\\32x32\\actions\\document-save-5.png"));
		btGuardar.setBounds(232, 210, 86, 41);
		ventana.getContentPane().add(btGuardar);
		
		lblNewLabel_1 = new JLabel("Descripcion");
		lblNewLabel_1.setBounds(10, 59, 67, 14);
		ventana.getContentPane().add(lblNewLabel_1);
		
		tfDescripcion = new JTextField();
		tfDescripcion.setBounds(103, 59, 86, 20);
		ventana.getContentPane().add(tfDescripcion);
		tfDescripcion.setColumns(10);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(14, 277, 89, 23);
		ventana.getContentPane().add(btnNuevo);
		
		ventana.setTitle("PokemonSQL");
		ventana.setLocationRelativeTo(null);
		ventana.repaint();		
	}
}
