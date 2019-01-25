package com.sfaci.ejemplohibernate.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sfaci.ejemplohibernate.base.Personaje;

import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class Vista extends JFrame {

	public JPanel contentPane;
	public DefaultListModel<Personaje> mPersonajes;
	public JLabel lblNewLabel_1;
	public JTextField txNombre;
	public JTextField txDescripcion;
	public JTextField txVida;
	public JTextField txAtaque;
	public JLabel lblNewLabel_2;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_4;
	public JLabel lblNewLabel_5;
	public JLabel lblNewLabel_6;
	public JLabel lblNewLabel_7;
	public JTextField txNombreArma;
	public JTextField txAtaqueArma;
	public JTextField txDuracion;
	public JComboBox cbArmas;
	public JButton btnNewButton_3;
	public JScrollPane scrollPane;
	public JButton btNuevo;
	public JButton btModificar;
	public JButton btGuardar;
	public JButton btCancelar;
	public JList<? extends E> list;
	public JList<? extends E> jlArmas;
	public JScrollPane scrollPane_1;
	public JList jlPersonaje;
	public JList jlArma;
	public JButton btEliminar;
	public JTextField textField;

	public Vista() {
		setTitle("CRUD Hibernate");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 543, 404);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Archivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("Opciones");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("New menu item");
		mnNewMenu_1.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_2 = new JMenu("Ayuda");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("New menu item");
		mnNewMenu_2.add(mntmNewMenuItem_2);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("New label");
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		toolBar.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		toolBar.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		toolBar.add(btnNewButton_2);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Armas", null, panel, null);
		panel.setLayout(null);
		
		lblNewLabel_5 = new JLabel("Nombre");
		lblNewLabel_5.setBounds(10, 11, 46, 14);
		panel.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("Ataque");
		lblNewLabel_6.setBounds(10, 36, 46, 14);
		panel.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Duracion");
		lblNewLabel_7.setBounds(10, 61, 46, 14);
		panel.add(lblNewLabel_7);
		
		txNombreArma = new JTextField();
		txNombreArma.setBounds(94, 8, 86, 20);
		panel.add(txNombreArma);
		txNombreArma.setColumns(10);
		
		txAtaqueArma = new JTextField();
		txAtaqueArma.setBounds(94, 33, 86, 20);
		panel.add(txAtaqueArma);
		txAtaqueArma.setColumns(10);
		
		txDuracion = new JTextField();
		txDuracion.setBounds(94, 58, 86, 20);
		panel.add(txDuracion);
		txDuracion.setColumns(10);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Personajes", null, panel_1, null);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		lblNewLabel_1 = new JLabel("Nombre");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 10, SpringLayout.WEST, panel_1);
		panel_1.add(lblNewLabel_1);
		
		txNombre = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txNombre, 27, SpringLayout.EAST, lblNewLabel_1);
		panel_1.add(txNombre);
		txNombre.setColumns(10);
		
		txDescripcion = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txNombre, -29, SpringLayout.NORTH, txDescripcion);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txNombre, -9, SpringLayout.NORTH, txDescripcion);
		panel_1.add(txDescripcion);
		txDescripcion.setColumns(10);
		
		txVida = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txDescripcion, -26, SpringLayout.NORTH, txVida);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txDescripcion, -6, SpringLayout.NORTH, txVida);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txVida, -187, SpringLayout.SOUTH, panel_1);
		panel_1.add(txVida);
		txVida.setColumns(10);
		
		txAtaque = new JTextField();
		panel_1.add(txAtaque);
		txAtaque.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Descripcion");
		sl_panel_1.putConstraint(SpringLayout.WEST, txDescripcion, 10, SpringLayout.EAST, lblNewLabel_2);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 15, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_1.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Vida");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 3, SpringLayout.NORTH, txVida);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_1.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Ataque");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 12, SpringLayout.SOUTH, lblNewLabel_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_1.add(lblNewLabel_4);
		
		cbArmas = new JComboBox();
		sl_panel_1.putConstraint(SpringLayout.WEST, cbArmas, 29, SpringLayout.EAST, txNombre);
		panel_1.add(cbArmas);
		
		btnNewButton_3 = new JButton("+");
		sl_panel_1.putConstraint(SpringLayout.EAST, cbArmas, -6, SpringLayout.WEST, btnNewButton_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_3, 299, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_3, -172, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_3, -4, SpringLayout.NORTH, lblNewLabel_1);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_1.add(btnNewButton_3);
		
		scrollPane = new JScrollPane();
		sl_panel_1.putConstraint(SpringLayout.NORTH, cbArmas, -29, SpringLayout.NORTH, scrollPane);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, cbArmas, -9, SpringLayout.NORTH, scrollPane);
		sl_panel_1.putConstraint(SpringLayout.EAST, txAtaque, -29, SpringLayout.WEST, scrollPane);
		sl_panel_1.putConstraint(SpringLayout.EAST, txVida, -29, SpringLayout.WEST, scrollPane);
		sl_panel_1.putConstraint(SpringLayout.NORTH, scrollPane, 7, SpringLayout.SOUTH, btnNewButton_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, scrollPane, 189, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, scrollPane, -91, SpringLayout.SOUTH, panel_1);
		panel_1.add(scrollPane);
		
		jlArmas = new JList();
		scrollPane.setViewportView(list_1);
		
		jlArma = new JList();
		scrollPane.setViewportView(jlArma);
		
		btNuevo = new JButton("Nuevo");
		sl_panel_1.putConstraint(SpringLayout.WEST, btNuevo, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_1.add(btNuevo);
		
		btModificar = new JButton("Modificar");
		sl_panel_1.putConstraint(SpringLayout.NORTH, txAtaque, -42, SpringLayout.NORTH, btModificar);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txAtaque, -22, SpringLayout.NORTH, btModificar);
		sl_panel_1.putConstraint(SpringLayout.NORTH, btModificar, 0, SpringLayout.NORTH, btNuevo);
		sl_panel_1.putConstraint(SpringLayout.WEST, btModificar, 19, SpringLayout.EAST, btNuevo);
		panel_1.add(btModificar);
		
		btGuardar = new JButton("Guardar");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btGuardar, 209, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btGuardar, 0, SpringLayout.WEST, lblNewLabel_1);
		panel_1.add(btGuardar);
		
		btCancelar = new JButton("Cancelar");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btNuevo, -27, SpringLayout.NORTH, btCancelar);
		sl_panel_1.putConstraint(SpringLayout.WEST, btCancelar, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btCancelar, -6, SpringLayout.NORTH, btGuardar);
		panel_1.add(btCancelar);
		
		scrollPane_1 = new JScrollPane();
		sl_panel_1.putConstraint(SpringLayout.EAST, scrollPane, -23, SpringLayout.WEST, scrollPane_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, scrollPane_1, 363, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, scrollPane_1, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, scrollPane_1, 219, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, scrollPane_1, 132, SpringLayout.EAST, btnNewButton_3);
		panel_1.add(scrollPane_1);
		
		jlPersonaje = new JList();
		scrollPane_1.setViewportView(jlPersonaje);
		
		btEliminar = new JButton("Eliminar");
		sl_panel_1.putConstraint(SpringLayout.WEST, btEliminar, 189, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btEliminar, -10, SpringLayout.SOUTH, panel_1);
		panel_1.add(btEliminar);
		
		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, 6, SpringLayout.SOUTH, scrollPane_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 0, SpringLayout.WEST, scrollPane_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField, 0, SpringLayout.EAST, scrollPane_1);
		panel_1.add(textField);
		textField.setColumns(10);
		
		mPersonajes = new DefaultListModel<>();
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
