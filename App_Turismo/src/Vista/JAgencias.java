package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Agencias;
import Model.TiposMedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class JAgencias extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDirección;
	private JTextField txtTelefono;
	private JTextField txtWeb;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField txtIdCompañia;
	private JTextField txtCorreo;
	private JLabel lblNewLabel_7;
	private JTextField txtIdAgencias;
	Agencias cr = new Agencias ();
	private JLabel lblNewLabel_8;
	private JTextField txtConsultar;
	private JButton btnConsultar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JAgencias frame = new JAgencias();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JAgencias() {
		setTitle("AGENCIAS");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 516, 615);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setForeground(new Color(245, 255, 250));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(29, 70, 175, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtDirección = new JTextField();
		txtDirección.setBounds(0, 155, 189, 20);
		contentPane.add(txtDirección);
		txtDirección.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(234, 70, 200, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(29, 254, 167, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(70, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Dirección");
		lblNewLabel_2.setBounds(60, 130, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Teléfono");
		lblNewLabel_3.setBounds(296, 45, 71, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setBounds(321, 130, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Web");
		lblNewLabel_5.setBounds(70, 229, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666542_save_icon (1)guardar.png"));
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtNombre.getText(), txtDirección.getText(), txtTelefono.getText(),txtCorreo.getText(), txtWeb.getText(), Integer.parseInt(txtIdCompañia.getText()));
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(137, 293, 71, 54);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_6 = new JLabel("Gestión de Agencias");
		lblNewLabel_6.setBackground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Dubai Medium", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(137, 11, 201, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("IdCompañia");
		lblNewLabel.setBounds(287, 229, 123, 14);
		contentPane.add(lblNewLabel);
		
		txtIdCompañia = new JTextField();
		txtIdCompañia.setBounds(257, 254, 153, 20);
		contentPane.add(txtIdCompañia);
		txtIdCompañia.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(257, 155, 153, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		lblNewLabel_7 = new JLabel("Id Agencias");
		lblNewLabel_7.setBounds(284, 313, 97, 14);
		contentPane.add(lblNewLabel_7);
		
		txtIdAgencias = new JTextField();
		txtIdAgencias.setBounds(281, 338, 86, 20);
		contentPane.add(txtIdAgencias);
		txtIdAgencias.setColumns(10);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setForeground(new Color(30, 144, 255));
		btnNewButton.setBackground(new Color(245, 222, 179));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			cr.delete(Integer.parseInt(txtIdAgencias.getText()));	
				
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(152, 414, 52, 57);
		contentPane.add(btnNewButton);
		
		lblNewLabel_8 = new JLabel("Consultar");
		lblNewLabel_8.setBounds(23, 341, 93, 14);
		contentPane.add(lblNewLabel_8);
		
		txtConsultar = new JTextField();
		txtConsultar.setBounds(7, 371, 109, 20);
		contentPane.add(txtConsultar);
		txtConsultar.setColumns(10);
		
		btnConsultar = new JButton("New button");
		btnConsultar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				cr.readOne(Integer.parseInt(txtConsultar.getText()), txtNombre, txtDirección, txtTelefono, txtCorreo, txtWeb, txtIdCompañia);
				
			}
		});
		btnConsultar.setBackground(new Color(222, 184, 135));
		btnConsultar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\9041903_search_icon.png"));
		btnConsultar.setBounds(144, 358, 60, 45);
		contentPane.add(btnConsultar);
		
		JButton btnActualizar = new JButton("New button");
		btnActualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				cr.Update(Integer.parseInt(txtConsultar.getText()),txtNombre.getText(), txtDirección.getText(), txtTelefono.getText(),txtCorreo.getText(), txtWeb.getText(), Integer.parseInt(txtIdCompañia.getText()));
			}
		});
		btnActualizar.setBackground(new Color(253, 245, 230));
		btnActualizar.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666721_rotate_ccw_icon.png"));
		btnActualizar.setBounds(137, 492, 71, 45);
		contentPane.add(btnActualizar);
	}
}
