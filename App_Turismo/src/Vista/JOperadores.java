package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Model.Compañia;
import Model.Operadores;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.ImageIcon;

public class JOperadores extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtCorreo;
	private JTextField txtDireccion;
	private JTextField txtTipoDocumento;
	private JTextField txtNumeroDocumento;
	private JTextField txtTelefono;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_8;
	private JTextField txtIdOperadores;
	private JButton btnNewButton;
	Operadores cr = new Operadores();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOperadores frame = new JOperadores();
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
	public JOperadores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 542);
		contentPane = new JPanel();
		contentPane.addMouseListener(new MouseAdapter() {
			
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(247, 67, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(247, 92, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtCorreo = new JTextField();
		txtCorreo.setBounds(247, 136, 86, 20);
		contentPane.add(txtCorreo);
		txtCorreo.setColumns(10);
		
		txtDireccion = new JTextField();
		txtDireccion.setBounds(247, 185, 86, 20);
		contentPane.add(txtDireccion);
		txtDireccion.setColumns(10);
		
		txtTipoDocumento = new JTextField();
		txtTipoDocumento.setBounds(247, 231, 86, 20);
		contentPane.add(txtTipoDocumento);
		txtTipoDocumento.setColumns(10);
		
		txtNumeroDocumento = new JTextField();
		txtNumeroDocumento.setBounds(247, 289, 86, 20);
		contentPane.add(txtNumeroDocumento);
		txtNumeroDocumento.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(247, 340, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(89, 70, 79, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(84, 95, 79, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Correo");
		lblNewLabel_2.setBounds(87, 138, 46, 17);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección");
		lblNewLabel_3.setBounds(82, 188, 86, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("Tipo De Documento");
		lblNewLabel_5.setBounds(54, 234, 114, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Número de Documento");
		lblNewLabel_6.setBounds(62, 289, 139, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Teléfono");
		lblNewLabel_7.setBounds(89, 340, 76, 14);
		contentPane.add(lblNewLabel_7);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				
				cr.create(txtTipoDocumento.getText(),Integer.parseInt(txtNumeroDocumento.getText()), txtNombres.getText(),txtApellidos.getText(),txtDireccion.getText(), txtCorreo.getText(),txtTelefono.getText());
				
			}
		});
		btnGuardar.setBounds(62, 427, 89, 23);
		contentPane.add(btnGuardar);
		
		
		
		lblNewLabel_4 = new JLabel("Gestión de Operadores");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_4.setBounds(115, 11, 201, 31);
		contentPane.add(lblNewLabel_4);
		
		lblNewLabel_8 = new JLabel("Id Operadores");
		lblNewLabel_8.setBounds(89, 381, 158, 14);
		contentPane.add(lblNewLabel_8);
		
		txtIdOperadores = new JTextField();
		txtIdOperadores.setBounds(257, 381, 86, 20);
		contentPane.add(txtIdOperadores);
		txtIdOperadores.setColumns(10);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				 cr.delete(Integer.parseInt(txtIdOperadores.getText()));	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\APRENDIZ\\Downloads\\8666597_trash_2_icon.png"));
		btnNewButton.setBounds(257, 443, 89, 49);
		contentPane.add(btnNewButton);
		
		
		
		
	}

}
