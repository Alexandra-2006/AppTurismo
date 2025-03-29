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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 457);
		contentPane = new JPanel();
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
		txtTelefono.setBounds(234, 155, 200, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtWeb = new JTextField();
		txtWeb.setBounds(257, 279, 167, 20);
		contentPane.add(txtWeb);
		txtWeb.setColumns(10);
		
		lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setBounds(70, 45, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Dirección");
		lblNewLabel_2.setBounds(60, 130, 79, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("Teléfono");
		lblNewLabel_3.setBounds(294, 130, 71, 14);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("Correo");
		lblNewLabel_4.setBounds(70, 247, 46, 14);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Web");
		lblNewLabel_5.setBounds(319, 247, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				Agencias cr = new Agencias ();
				cr.create(txtNombre.getText(), txtDirección.getText(), txtTelefono.getText(),txtCorreo.getText(), txtWeb.getText(), Integer.parseInt(txtIdCompañia.getText()));
				
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(307, 359, 89, 33);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_6 = new JLabel("Gestión de Agencias");
		lblNewLabel_6.setBackground(Color.BLACK);
		lblNewLabel_6.setFont(new Font("Dubai Medium", Font.PLAIN, 18));
		lblNewLabel_6.setBounds(137, 11, 201, 29);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel = new JLabel("IdCompañia");
		lblNewLabel.setBounds(29, 336, 123, 14);
		contentPane.add(lblNewLabel);
		
		txtIdCompañia = new JTextField();
		txtIdCompañia.setBounds(10, 365, 86, 20);
		contentPane.add(txtIdCompañia);
		txtIdCompañia.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(53, 279, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
	}
}
