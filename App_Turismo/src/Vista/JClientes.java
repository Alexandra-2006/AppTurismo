package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Clientes;
import Model.TiposMedios;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JClientes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNumeroDocumento;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtTelefono;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txteps;
	private JTextField txtAlergias;
	private JTextField txtestadocivil;
	private JButton btnGuardar;
	private JTextField txtTipoDocumento;
	private JTextField txtIdClientes;
	Clientes cr = new Clientes ();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JClientes frame = new JClientes();
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
	public JClientes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 618, 596);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumeroDocumento = new JTextField();
		txtNumeroDocumento.setBounds(407, 99, 86, 20);
		contentPane.add(txtNumeroDocumento);
		txtNumeroDocumento.setColumns(10);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(27, 212, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(253, 195, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(482, 195, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(27, 287, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(263, 302, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txteps = new JTextField();
		txteps.setBounds(482, 313, 86, 20);
		contentPane.add(txteps);
		txteps.setColumns(10);
		
		txtAlergias = new JTextField();
		txtAlergias.setBounds(39, 393, 86, 20);
		contentPane.add(txtAlergias);
		txtAlergias.setColumns(10);
		
		txtestadocivil = new JTextField();
		txtestadocivil.setBounds(272, 407, 86, 20);
		contentPane.add(txtestadocivil);
		txtestadocivil.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo Documento");
		lblNewLabel_1.setBounds(134, 74, 96, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Número de Documento");
		lblNewLabel_2.setBounds(385, 74, 148, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombres");
		lblNewLabel_3.setBounds(39, 172, 74, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Apellidos");
		lblNewLabel_4.setBounds(272, 172, 96, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setBounds(501, 172, 86, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setBounds(52, 266, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Dirección");
		lblNewLabel_7.setBounds(281, 277, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("EPS");
		lblNewLabel_8.setBounds(501, 277, 46, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Alergias");
		lblNewLabel_9.setBounds(52, 368, 75, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Estado Civíl");
		lblNewLabel_10.setBounds(272, 382, 86, 14);
		contentPane.add(lblNewLabel_10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			
				cr.create(txtTipoDocumento.getText(), Integer.parseInt(txtNumeroDocumento.getText()) ,  txtNombres.getText(), txtApellidos.getText(), txtTelefono.getText(), txtCorreo.getText(), txtDireccion.getText(),
						txteps.getText(), txtAlergias.getText(), txtestadocivil.getText());
			}
		});
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnGuardar.setBounds(279, 502, 89, 23);
		contentPane.add(btnGuardar);
		
		JLabel lblNewLabel_11 = new JLabel("Gestión de Clientes");
		lblNewLabel_11.setFont(new Font("Trebuchet MS", Font.PLAIN, 18));
		lblNewLabel_11.setBounds(203, 11, 190, 14);
		contentPane.add(lblNewLabel_11);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setBounds(129, 99, 86, 20);
		contentPane.add(txtTipoDocumento);
		txtTipoDocumento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id Clientes");
		lblNewLabel.setBounds(487, 382, 100, 14);
		contentPane.add(lblNewLabel);
		
		txtIdClientes = new JTextField();
		txtIdClientes.setBounds(468, 407, 86, 20);
		contentPane.add(txtIdClientes);
		txtIdClientes.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				cr.delete(Integer.parseInt(txtIdClientes.getText()));
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(479, 463, 89, 57);
		contentPane.add(btnNewButton);
	}
}
