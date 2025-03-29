package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JPromotor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombres;
	private JTextField txtApellidos;
	private JTextField txtFechaNacimiento;
	private JTextField txtTipoIdentificación;
	private JTextField txtNumeroIdentificacion;
	private JTextField txtTelefono;
	private JTextField Correo;
	private JTextField txtAlergias;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPromotor frame = new JPromotor();
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
	public JPromotor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 574);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombres = new JTextField();
		txtNombres.setBounds(250, 46, 86, 20);
		contentPane.add(txtNombres);
		txtNombres.setColumns(10);
		
		txtApellidos = new JTextField();
		txtApellidos.setBounds(250, 89, 86, 20);
		contentPane.add(txtApellidos);
		txtApellidos.setColumns(10);
		
		txtFechaNacimiento = new JTextField();
		txtFechaNacimiento.setBounds(250, 146, 86, 20);
		contentPane.add(txtFechaNacimiento);
		txtFechaNacimiento.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombres");
		lblNewLabel.setBounds(98, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellidos");
		lblNewLabel_1.setBounds(80, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Fecha de Nacimiento");
		lblNewLabel_2.setBounds(60, 149, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		txtTipoIdentificación = new JTextField();
		txtTipoIdentificación.setBounds(250, 204, 86, 20);
		contentPane.add(txtTipoIdentificación);
		txtTipoIdentificación.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tipo de identificación");
		lblNewLabel_3.setBounds(41, 206, 127, 17);
		contentPane.add(lblNewLabel_3);
		
		txtNumeroIdentificacion = new JTextField();
		txtNumeroIdentificacion.setBounds(250, 267, 86, 20);
		contentPane.add(txtNumeroIdentificacion);
		txtNumeroIdentificacion.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Número de identificación");
		lblNewLabel_4.setBounds(41, 267, 156, 14);
		contentPane.add(lblNewLabel_4);
		
		txtTelefono = new JTextField();
		txtTelefono.setBounds(250, 318, 86, 20);
		contentPane.add(txtTelefono);
		txtTelefono.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Teléfono");
		lblNewLabel_5.setBounds(62, 321, 107, 14);
		contentPane.add(lblNewLabel_5);
		
		Correo = new JTextField();
		Correo.setBounds(250, 373, 86, 20);
		contentPane.add(Correo);
		Correo.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Correo");
		lblNewLabel_6.setBounds(60, 373, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		txtAlergias = new JTextField();
		txtAlergias.setBounds(250, 431, 86, 20);
		contentPane.add(txtAlergias);
		txtAlergias.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Alergias");
		lblNewLabel_7.setBounds(60, 434, 66, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Gestión de Promotores");
		lblNewLabel_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_8.setBounds(105, 0, 217, 14);
		contentPane.add(lblNewLabel_8);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(138, 488, 89, 23);
		contentPane.add(btnGuardar);
	}

}
